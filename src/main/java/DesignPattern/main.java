package DesignPattern;

public class main {
    public static void main(String[] args) {
        User user= new User.UserBuilder()
                .setEmailId("subhransu@gmail.com")
                .setUserId("USERID!@#")
                .setUserName("Subhransu")
                .build();
        System.out.println(user);

    }
}
