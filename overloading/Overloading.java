package overloading;

public class Overloading {
    
    public  int add(int a, int b) {
        return a + b;
    }
    public  int add(int a, short b) {
        return a + b;
    }
    public  float add(float a, float b){
        return a + b;
    }
    public  double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Overloading ov = new Overloading();
       int sumInt = add(100, 200);
       double sumDouble = add(2.36, 3.54);
       float sumFloat = add(3.25f, 6.89f);

        System.out.println("sum of int: " + sumInt);
        System.out.println("sum of float: " + sumFloat);
        System.out.println("sum of double: " + sumDouble);

   

    }
}
