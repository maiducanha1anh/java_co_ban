package Java_co_ban;

public class Bai11 {
    public static void main(String[] args) {
        //toán tử ba ngôi
        int a= 108;
        String str1 ="a là số chẵn";
        String str2 ="a là số lẻ ";
        String str = "";

        // if(a % 2 == 0){
        //     str = str1;
        // }else{
        //     str = str2 ;
        // }

        str = (a % 2 == 0) ? str1 : str2;
        System.out.println("thong diep: "+ str);

    }
}
