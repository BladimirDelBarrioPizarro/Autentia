package com.autentia.courses.controller.impl;


import com.autentia.courses.model.constants.ErrorMessages;
import com.autentia.courses.model.dto.HttpErrorDTO;
import com.autentia.courses.model.exceptions.HandleExceptionPagination;
import com.autentia.courses.model.map.CourseMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Slf4j
@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler{
    public static HttpServletRequest getCurrentRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        Assert.state(requestAttributes != null, "Could not find current request via RequestContextHolder");
        Assert.isInstanceOf(ServletRequestAttributes.class, requestAttributes);
        HttpServletRequest servletRequest = ((ServletRequestAttributes) requestAttributes).getRequest();
        Assert.state(servletRequest != null, "Could not find current HttpServletRequest");
        return servletRequest;
    }

    @ExceptionHandler(HandleExceptionPagination.class)
    public ResponseEntity<HttpErrorDTO> handleExceptionPagination(Exception ex) {
        log.error(" -- ERROR API AUTENTIA: Incorrect parameters {} {} {} ",getCurrentRequest().getMethod(),getCurrentRequest().getContextPath(),
                getCurrentRequest().getRequestURI());
        return CourseMapper.buildHttpErrorDTO(getCurrentRequest().hashCode(), HttpStatus.CONFLICT,
                getCurrentRequest().getServletPath(), ErrorMessages.AUTENTIA_ERROR_PAGINATION,getCurrentRequest().getMethod(),new Date());
    }
}
