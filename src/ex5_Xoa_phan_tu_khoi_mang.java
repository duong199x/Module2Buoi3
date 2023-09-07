import java.util.Arrays;

public class ex5_Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 8, 5, 2, -4, -6};
        int size = array.length;
        System.out.println(search(array, 4, size));
        System.out.println(Arrays.toString(array));
        delete(array, -4, size);
        System.out.println(Arrays.toString(array));
    }

    public static int delete(int[] arr, int elementDelete, int size) {
        int index = search(arr, elementDelete, size);
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        return size;
    }

    public static int search(int[] arr, int elementSearch, int size) {
        for (int i = 0; i < size; i++) {
            if (elementSearch == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
