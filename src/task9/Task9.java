package task9;

public class Task9 {
    public static void main(String[] args){
        printResultTask9(0, 10, 100);
        printResultTask9(10, 10, 0);
        printResultTask9(10, -100, 100);
        printResultTask9(5, 0, 100);
        printResultTask9(3, 2,2);

    }

    private static int calc(int N, int minRandom, int maxRandom) {
        if (N <= 0) throw new IllegalArgumentException(" Param N must be above zero!!!");
        if (minRandom >= maxRandom) throw new IllegalArgumentException(" Param maxRandom must be bigger than minRandom!!!");

        int[] array = new int[N];

        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {    // Вивод та заповнення массива рандомими числами
            array[i] = minRandom + (int) (Math.random() * maxRandom);
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {    // Знаходження максимального та мінімального значення массива
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
        }
        return max-min;
    }

    public static void printResultTask9(int N, int minRandom, int maxRandom){
        try{
            System.out.println("> Max - Min = " + calc(N, minRandom, maxRandom));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception!" + e.getMessage());
        }
    }
}
