import java.util.Scanner;

public class ex9_Tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }System.out.println(min);
    }
}
