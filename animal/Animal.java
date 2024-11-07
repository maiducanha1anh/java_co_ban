package animal;

public class Animal {
    protected String name;
    private int age;
    private flaot weight;

    protected void saySomething() {
        System.out.println("Bla bla bla....");
    }
    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public flaot getWeight() {
        return weight;
    }


    public void setWeight(flaot weight) {
        this.weight = weight;
    }


    public void eat() {

    }
    public void move(){
        System.out.println("Animal is moving ...");
    }
    public void sleep() {

    }
    @Override
    public boolean equals(Object otherObj) {
        if(this == otherObj) {
            return true;
        }

        if(otherObj == null) {
            return false;
        }
        if(!(this.getClass() == otherObj.getClass())) {
            return false;
        }
        Animal other = (Animal)otherObj;
        return Objects.equals(this.name, other.name) && this.age  == other.age\
            && this.weight == other.weight;
    }
    @Override
    public String toString(){
        return getClass().getName() + "[Name=" + name +", age="
         + age +", weight=" + weight +"]";
    }

}
