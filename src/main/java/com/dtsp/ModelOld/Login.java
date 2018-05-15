package com.dtsp.ModelOld;

import org.springframework.stereotype.Component;

@Component
public class Login {
    private String username;
    private String password;
    private Integer Jurisdiction;

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

    public Integer getJurisdiction() {
        return Jurisdiction;
    }

    public void setJurisdiction(Integer jurisdiction) {
        Jurisdiction = jurisdiction;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Jurisdiction=" + Jurisdiction +
                '}';
    }
}
