public class ex8_Tim_phan_tu_lon_nhat_trong_mang_hai_chieu {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5}, {1, 86, 4}, {1, 64, 0}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
