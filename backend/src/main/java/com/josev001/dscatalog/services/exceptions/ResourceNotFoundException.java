package com.josev001.dscatalog.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String msg){ //usa o super() quando quer passar a mensagem para a classe pai (RuntimeException)
        super(msg);
    }

}
