import java.util.Scanner;

public class Reverse {
    int arr[],n;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n & search ele : ");
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" ele : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    void process(){
        int j = n-1;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

    void output(){
        System.out.println("Reverse Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
