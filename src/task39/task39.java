package task39;

public class task39 {
    public static void main(String[] args){
        printResultTask39(2, 10, 100);
        printResultTask39(10, 10, 0);
        printResultTask39(10, -100, 100);
        printResultTask39(5, 0, 100);
        printResultTask39(3, 2,2);
    }

    private static int calc(int N, int minRandom, int maxRandom){
        if (N <= 2) throw new IllegalArgumentException(" Param N must be above two!!!");
        if (minRandom >= maxRandom) throw new IllegalArgumentException(" Param maxRandom must be bigger than minRandom!!!");

        int[] array = new int[N];

        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {    // Вивод та заповнення массива рандомими числами
            array[i] = minRandom + (int) (Math.random() * maxRandom);
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        int max = array[0];
        for (int i = 1; i < array.length; i++) {    // Знаходження максимального та мінімального значення массива
            if (max < array[i]) {
                max = array[i];
        }
    }
        return max-array[array.length-2];
    }

    public static void printResultTask39(int N, int minRandom, int maxRandom){
        try{
            System.out.println("> Max - Penultimate element = " + calc(N, minRandom, maxRandom));
        } catch(IllegalArgumentException e){
            System.out.println("Exception!" + e.getMessage());
        }
    }
}
