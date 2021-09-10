package com.denis.model;

public enum DBNoteBook {
    NOTE_ONE("Денис", "Dines"),
    NOTE_TWO("Микола","nik12345"),
    NOTE_THREE ("Петро","shoko123");

    private final String firstName;
    private final String login;

    DBNoteBook(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLogin() {
        return login;
    }

    public static boolean checkLogin (String loginData){
        for (DBNoteBook note : DBNoteBook.values()){
            if (note.getLogin().equals(loginData)){
                return true;}
        }
        return  false;
    }
}
