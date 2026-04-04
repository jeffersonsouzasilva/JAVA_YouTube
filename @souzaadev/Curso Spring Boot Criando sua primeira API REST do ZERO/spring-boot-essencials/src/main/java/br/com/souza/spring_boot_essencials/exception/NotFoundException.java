package br.com.souza.spring_boot_essencials.exception;

public class NotFoundException extends Exception {
    public NotFoundException(String message){
        super(message);
    }
}
