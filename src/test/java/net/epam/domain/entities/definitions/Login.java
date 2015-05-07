package net.epam.domain.entities.definitions;


public class Login {
    public static LoginBuilder get() {
        return new LoginBuilder();
    }

    private Login(LoginBuilder loginBuilder) {
        this.username = loginBuilder.username;
        this.password = loginBuilder.password;
    }

    private final String username;
    private final String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class LoginBuilder {
        protected String username;
        protected String password;

        public LoginBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public LoginBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Login build() {
            return new Login(this);
        }
    }
}
