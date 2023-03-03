package pojo;

public class User {

    private String userName;
    private String password;

    public User(UserBuilder builder) {
        this.userName = builder.userName;
        this.password = builder.password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static class UserBuilder {

        private String userName;
        private String password;


        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
