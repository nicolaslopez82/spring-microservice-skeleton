package com.nicolaslopez82.sms.web;

import javax.validation.constraints.NotNull;

public class LoginDto {

    @NotNull
    private String username;

    @NotNull
    private String password;

    private String firstName;

    private String lastName;

    /**
     * Default constructor
     */
    protected LoginDto() {}

    /**
     * Full constructor
     * @param username
     * @param password
     */
    public LoginDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Full constructor
     * @param username
     * @param password
     */
    public LoginDto(String username, String password, String firstName, String lastName) {
        this(username, password);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
