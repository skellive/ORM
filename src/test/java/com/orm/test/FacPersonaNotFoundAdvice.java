package com.orm.test;

import com.orm.test.CONTROLLER.EXCEPTION.FacPersonaException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class FacPersonaNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(FacPersonaException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String facPersonaNotFoundHandler(FacPersonaException exception){
        return exception.getMessage();
    }

}
