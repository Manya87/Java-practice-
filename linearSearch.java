public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7, 9};
        int target = 5;
        int index = linearSearch(arr, target);
        System.out.println(index);
    }

    static int linearSearch(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
