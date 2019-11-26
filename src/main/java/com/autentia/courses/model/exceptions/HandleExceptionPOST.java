package com.autentia.courses.model.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HandleExceptionPOST extends RuntimeException {
    public HandleExceptionPOST(Exception ex){
        super(ex.getMessage());
    }
}
