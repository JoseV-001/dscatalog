package com.josev001.dscatalog.services.exceptions;

public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(String msg){ //usa o super() quando quer passar a mensagem para a classe pai (RuntimeException)
        super(msg);
    }

}
