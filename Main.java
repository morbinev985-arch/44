import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int[] inputArray = {12000, 15000, 10000, 18000, 13000};
        int sum = 0;
        int max = inputArray[0];
        int min = inputArray[0];
        for (int value : inputArray) {
            sum += value;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        double average = (double) sum / inputArray.length;
        double[] outputArray = {sum, max, min, average};
        System.out.println("inputArray: " + Arrays.toString(inputArray));
        System.out.println("outputArray: " + Arrays.toString(outputArray));
        System.out.println();

        System.out.println("Задание 2");

        int[] inputArray1 = {50000, 60000, 55000, 70000, 65000};
        double[] outputArray1 = new double[inputArray1.length];
        double tax = 0.13;
        for (int i = 0; i < inputArray1.length; i++) {
            outputArray1[i] = inputArray1[i] * tax;
        }
        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));
        System.out.println();

        System.out.println("Задание 3");

        int[] inputArray2 = {3000, 6000, 8000, 4500, 5200};
        boolean[] outputArray2 = new boolean[inputArray2.length];
        int maxBonus = 5000;
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] > maxBonus;
        }
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));
        System.out.println();

        System.out.println("Задание 4");

        int[] inputArray3 = {1500, 1200, 800, -400, 100};
        boolean[] outputArray3 = {true};
        for (int value : inputArray3) {
            if (value < 0) {
                outputArray3[0] = false;
                break;
            }
            System.out.println("inputArray3: " + Arrays.toString(inputArray3));
            System.out.println("outputArray3: " + Arrays.toString(outputArray3));
            System.out.println();

            System.out.println("Задание 5");

            int[] inputArray4 = {30000, -4000, 12000, 0, 10000};
            int[] outputArray4 = {0};
            for (int value1 : inputArray4) {
                if (value1 > 0) {
                    outputArray4[0]++;
                }
            }
            System.out.println("inputArray4: " + Arrays.toString(inputArray4));
            System.out.println("outputArray4: " + Arrays.toString(outputArray4));
            System.out.println();
        }
    }
}