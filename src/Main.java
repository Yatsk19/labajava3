public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 4, 5};

        int index = findFirstZeroIndex(array);

        if (index != -1) {
            System.out.println("Індекс першого нульового елемента: " + index);
        } else {
            System.out.println("Масив не містить нульових елементів.");
        }
    }

    public static int findFirstZeroIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
