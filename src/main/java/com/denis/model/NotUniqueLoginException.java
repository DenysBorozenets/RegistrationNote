package com.denis.model;

public class NotUniqueLoginException extends Exception{
    private String login;

    public String getLogin() {
        return login;
    }

    public NotUniqueLoginException(String message, String loginData) {
        super(message);
        this.login = loginData;
    }
}
