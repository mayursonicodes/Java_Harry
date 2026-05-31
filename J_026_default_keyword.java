//! By using default keyword, we can define a method inside interface itself.
//! Suppose Notification already existed and 100 classes implemented it. Later, you decide every notification should be loggable. Then, Without a default method all 100 implementing classes would fail to compile until they add logNotification() method.
//! With a default method, All existing classes continue to work automatically, and only classes needing custom behavior override it.

interface Notification{

    void send(String message);

    //! Default method that we added later on after completing the code.
    default void logNotification(String message){
        System.out.println("Notification logged: " + message);
    }
}

class EmailNotification implements Notification{

    public void send(String message){
        System.out.println("Email sent: " + message);
    }

    //! Here, we didn't override the logNotification() but it still works.
}

class SMSNotification implements Notification{

    public void send(String message){
        System.out.println("SMS sent: " + message);
    }

    //! Optional, default implementation
    public void logNotification(String message){
        System.out.println("SMS Log: " + message);
    }
}

public class J_026_default_keyword {
    public static void main(String[] args){
        EmailNotification email = new EmailNotification();
        email.send("Hello!");
        email.logNotification("Hello!");

        System.out.println();

        SMSNotification sms = new SMSNotification();
        sms.send("Hi!");
        sms.logNotification("Hi!");
    }
}