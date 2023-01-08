import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание №5");
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i + 1) % 2 != 0 && (j + 1) % 2 != 0 || (i + 1) % 2 == 0 && (j + 1) % 2 == 0) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void task2() {
        System.out.println("Задание №6");
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr2 = new int[5];
        int j = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 4; i >= 0; i--) {
            arr2[j] = arr[i];
            j = j + 1;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void task3() {
        System.out.println("Задание №7");
        int[] arr = {5, 4, 3, 2, 1};
        int j = arr.length;
        for (int i = 0; i < j / 2; i++) {
            int temp = arr[j - i - 1];
            arr[j - i - 1] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task4() {
        System.out.println("Задание №9");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i]+arr[j];
                if (sum==-2){
                    System.out.println("числа "+arr[i]+" и "+arr[j]);
                }
            }

        }

    }
}