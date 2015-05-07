package net.epam.domain.entities.repositories;

import net.epam.domain.entities.definitions.Login;


public class LoginRepository {
    public static Login getAdidasPM() {
        return Login.get().setUsername("username1").setPassword("password1").build();
    }

    public static Login getAdidasBSU() {
        return Login.get().setUsername("username2").setPassword("password2").build();
    }

    public static Login getReebokPM() {
        return Login.get().setUsername("reebookPM").setPassword("reebokPM").build();
    }

    public static Login getAdidasUser() {
        return Login.get().setUsername("user2015").setPassword("user2015pswd").build();
    }
}
