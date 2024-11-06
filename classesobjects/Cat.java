package classesobjects;

public class Cat {
    private String name;
    private int age;
    private float weight;
    private String color;
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private String eyesColor;

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
