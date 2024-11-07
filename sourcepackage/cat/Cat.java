package sourcepackage.cat;

public class Cat {
    private String name;
    private int age;
    private float weight;
    private String color;
    private String eyesColor;

    public Cat() {

    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

 

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setColor(String color){
        this.color = color;
    }




    public void speak() {
        System.out.println(name + " is speaking");
    }

    public void move() {
        System.out.println(name + " is running");
    }

    public void sleep() {
        System.out.println(name + "is sleeping");

    }

    public void eat() {
        System.out.println(name + "is eating");
    }
    














}
