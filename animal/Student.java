package animal;

public class Student extends Person {
    private float mark;

    public Student(){
    this.saySomething();
    this.name = "ABC";
    this.age = 20;
}

    public void move() {
        System.out.println("Student is driving a car....");
    }
}

