package com.autentia.courses.model.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Setter
@Getter
@Data
@Builder
public class HttpErrorDTO {
    private Integer code;
    private HttpStatus status;
    private String url;
    private String message;
    private String method;
    private Date date;
}
