package com.autentia.courses.model.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HandleExceptionPagination extends RuntimeException {

    public HandleExceptionPagination(Exception ex){
        super(ex.getMessage());
    }
}
