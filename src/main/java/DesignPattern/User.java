package DesignPattern;

public class User {
    private final String userId;
    private final String emailId;
    private final String userName;

    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return this.userId + " " + this.userName + " " + this.emailId;
    }

    static class UserBuilder {
        private String userId;
        private String emailId;
        private String userName;

        public UserBuilder() {}

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

