public class reversearray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Original array: " + Arrays.toString(arr));
        reverseArray(arr, n);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
