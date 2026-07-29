import java.util.Scanner;

public class PrintEvenNumbers {

    public static void printEven(int[] arr, int index) {

        if (index == arr.length) {
            return;
        }
    
        if (arr[index] % 2 == 0) {
            System.out.println(arr[index]);
        }
       
        printEven(arr, index + 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        printEven(arr, 0);

        sc.close();
    }
}
