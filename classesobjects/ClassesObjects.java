package classesobjects;

public class ClassesObjects {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Tom");

        Cat meow = new Cat();
        meow.setName("Meow");

        System.out.println(tom.getName());

        String meowName = meow.getName();
        System.out.println("meow's name is : " + meowName);


















    }
}
