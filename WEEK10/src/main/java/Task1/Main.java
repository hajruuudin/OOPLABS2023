package Task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//Generating the custom annotations
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CanSendMessage{}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@interface RequiresPermission{int value();}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface UserPermission{int value();}


//Creating the necessary classes
@UserPermission(1)
class User{
    @SuppressWarnings("all") private String username;

    public User(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

@UserPermission(2)
class Admin{
    @SuppressWarnings("all") private String username;

    public Admin(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class Main {
    @CanSendMessage
    @RequiresPermission(1)
    public static void sendMessage(User user, String message){
        System.out.println("User: " + user.getUsername() + " send message: " + message);
    }

    @CanSendMessage
    @RequiresPermission(2)
    public static void sendMessage(Admin admin, String message){
        System.out.println("User: " + admin.getUsername() + " send message: " + message);
    }

    public static void main(String[] args) {
        User userExample = new User("Jonathan");
        Admin adminExample = new Admin("Benjamin");
        @SuppressWarnings("unused") String word = "Test";

        sendMessage(userExample, "Hello i am a user");
        sendMessage(adminExample, "Hello i am an admin");
    }
}
