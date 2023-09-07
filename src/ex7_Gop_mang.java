import java.util.Arrays;

public class ex7_Gop_mang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6};
        int[] arr2 = {5, 4, 7};
        int[] arr3 = new int[arr1.length + arr2.length];
        int size = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[size] = arr1[i];
            size++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[size] = arr2[i];
            size++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
