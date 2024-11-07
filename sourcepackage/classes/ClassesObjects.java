package sourcepackage.classes;

import Source.Apple;

public class ClassesObjects {
    public static void main(String[] args) {

        
        Cat tom = new Cat("Tom" , "red");
        System.out.println("cat's name: " + tom.getName());
        System.out.println("cat's age: " + tom.getAge());
        System.out.println("cat's color: " + tom.getColor());
        tom.move();
        System.out.println("=====================================");       

        Student mai = new Student("B23DCCN123", "Pham Huyen Mai", 20);
        System.out.println("Name: " + mai.getName());
        System.out.println("Age: " + mai.getAge());
        System.out.println("ID: " + mai.getId());
        System.out.println("Email: " + mai.getEmail());
        System.out.println("=====================================");
        Student hoang = new Student("B23DCCN123");
        hoang.setName("Nguyen Minh Hoang");
        System.out.println("Hoang's name: " + hoang.getName());
















    }
}
