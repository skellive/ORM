package com.orm.test.CONTROLLER.EXCEPTION;

public class FacPersonaException extends RuntimeException{
    FacPersonaException(Long id){
        super("Not Find FacPersona "+ id);
    }
}
