package com.kodilla.good.patterns.food2door;

public class User {
    private String nick;
    private String mail;


    public User(String nick, String mail){
        this.nick = nick;
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public String getNick() {
        return nick;
    }
}
