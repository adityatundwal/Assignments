import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        inverse(arr);
    }

    public static void inverse(int arr []){
        int n = arr.length;
        int newArr[] = new int[n];

        for(int i = 0; i < n; i++){
            int temp = arr[i];
            newArr[temp] = i;
        }

        for(int i = 0; i < n; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}