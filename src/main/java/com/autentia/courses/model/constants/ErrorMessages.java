package com.autentia.courses.model.constants;

import lombok.Getter;

@Getter
public enum ErrorMessages {
    AUTENTIA_ERROR_PAGINATION("Error en alguno de los parámetros page,size o sort.");

    private String message;

    ErrorMessages(String message){
        this.message = message;
    }
}
