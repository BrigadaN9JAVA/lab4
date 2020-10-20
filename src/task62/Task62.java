package task62;

public class Task62 {
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {0, 1, 5, 6};
        int[] arr3 = {-10, 11};
        int[] arr4 = {-2, -3, -6, 100};
        int[] arr5 = {-1, 1, -1, 1, 0};
        printResultTask62(arr1);
        printResultTask62(arr2);
        printResultTask62(arr3);
        printResultTask62(arr4);
        printResultTask62(arr5);

    }

    private static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private static int[] calc(int[] array) {
        if (array.length == 0) throw new NullPointerException(" Array is empty");

        int min = min(array);

        int[] tmp = new int[array.length];
        System.arraycopy(array, 0, tmp, 0, array.length);

        if (min == 0) {
            for (int i = 0; i < tmp.length; i++) {
                System.out.print(tmp[i] + " ");
                tmp[i] = -10;
            }
        } else {
            for (int i = 0; i < tmp.length; i++) {
                System.out.print(tmp[i] + " ");
                tmp[i] = tmp[i]/min;
            }
        }
        System.out.println();
        return tmp;
    }

    public static void printResultTask62(int[] array){
        try {
            int[] tmp = calc(array);
            for (int t : tmp) {
                System.out.print(t + " ");
            }

            System.out.println();   // Ентер
            System.out.println();   // Ентер

        } catch(NullPointerException e){
            System.out.println("Exception!" + e.getMessage());
        }
    }
}
