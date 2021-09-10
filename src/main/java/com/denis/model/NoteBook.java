package com.denis.model;

public class NoteBook {
    private String firstName;
    private String loginData;

    public NoteBook(String firstName, String loginData) throws NotUniqueLoginException {
        if (DBNoteBook.checkLogin(loginData)){
            throw new NotUniqueLoginException("Repeated login", loginData);
        }
        this.firstName = firstName;
        this.loginData = loginData;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLoginData() {
        return loginData;
    }
    public void setLoginData(String loginData) {
        this.loginData = loginData;
    }
}
