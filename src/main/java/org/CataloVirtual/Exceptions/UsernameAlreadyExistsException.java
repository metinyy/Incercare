package org.CataloVirtual.Exceptions;

public class UsernameAlreadyExistsException extends Exception{
    private String username;

    public UsernameAlreadyExistsException(String username) {
        super(String.format("A fost deja creat un cont cu acest nume de utilizator!", username));
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
