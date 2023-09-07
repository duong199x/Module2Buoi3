import java.util.Arrays;

public class ex6_Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        int[] array = new int[10];
        int size = 0;
        size = addElement(array, -3, size);
        size = addElement(array, 5, size);
        size = addElement(array, 7, size);
        size = addElement(array, 9, size);
        size = addElement(array, -2, size);
        size = addElement(array, -10, size);
        System.out.println("old" + Arrays.toString(array));
        size = addNewElement(array, 2, -5, size);
        System.out.println("new" + Arrays.toString(array));
        size = addElement(array, -9, size);
        System.out.println("new" + Arrays.toString(array));
    }

    public static int addElement(int[] arr, int element, int size) {
        arr[size] = element;
        size++;
        return size;
    }

    public static int addNewElement(int[] arr, int index, int element, int size) {
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        size++;
        return size;
    }

}
