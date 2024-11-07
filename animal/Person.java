package animal;

public class Person  extends Animal {
    private String address;
    private String id;
     private String email;
    
     public void speak() {
        this.saySomething();
     }
     public void move(){
        System.out.println("Person is runnung....");
     }
}
