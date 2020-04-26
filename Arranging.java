import java.util.Scanner;

public class Arranging {
    int arr[],n;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " ele : ");
            arr[i] = sc.nextInt();
        }
    }

    void ascendingOrder(){
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }

    void decendingOrder(){
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }
}
