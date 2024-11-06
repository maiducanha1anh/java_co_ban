package Java_co_ban;

public class Bai7 {
    public static void main(String[] args) {
        //string trong java
        //lay do dai : .length()
        //viet hoa: .toUpperCase()
        //viet thuong : .toLowerCase()
        //tim vi tri ki tu trong text: .indexOf('chữ đó')
        // muốn in ra kí tự đặc biệt thì dùng dấu \ dằng trước kí tự đó
        // nếu muốn tách dòng trong text thì dùng kí tự \n để cách
        // nếu muốn cách kí tự 1 khoẳng bằng tab thì dùng \t
        String msg ="hello\n world!";
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.indexOf("w"));
        String name ="Than";
        String gretting = msg +" "+ name;
        System.out.println(gretting);
        String str ="\"";
        System.out.println(str);

        int a = 10;
        int b = 255;

        String x = name + (a +b);
    }
}
