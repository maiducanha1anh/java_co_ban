package Java_co_ban;

public class Bai16 {
    public static void main(String[] args) {
        //vòng lặp lồng nhau(vòng lặp chứa vòng lặp)
        int m = 6;
        int n = 6;
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
            }
            System.out.println("");
        }
    }
}
