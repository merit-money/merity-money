package br.com.db1.meritmoney.service.dto;

import javax.validation.constraints.Email;

public class EmailDTO {

    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
