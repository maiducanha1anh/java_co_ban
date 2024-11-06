package Java_co_ban;

public class Bai19 {
    public static void main(String[] args) {
        //mảng 2 chiều
        // khai báo
        //khởi tạo
        //Truy xuất phần tử
        //Cấp phát
        //Duyệt mảng hai chiều

    boolean[][] bools;
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}

    };

    bools =  new boolean[5][9];

    bools[0][0] = true;
    bools[2][8] = false;

    matrix[0][2] = -666;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
