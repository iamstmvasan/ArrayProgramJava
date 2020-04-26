import java.util.Scanner;

public class BiggestElement {
    int arr[],n;
    Scanner sc;

    void input() {
        sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " ele : ");
            arr[i] = sc.nextInt();
        }
    }

    void firstBig(){
        int firstBig = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > firstBig)
                firstBig = arr[i];
        }
        System.out.println("first Biggest is : "+firstBig);
    }

    void secondBig(){
        int firstBig = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > firstBig)
                firstBig = arr[i];
        }

        int secondBig = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] < firstBig && arr[i] > secondBig)
                secondBig = arr[i];
        }
        System.out.println("Second biggest is : "+secondBig);
    }

    void nBig(){
        int firstBig = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > firstBig)
                firstBig = arr[i];
        }
        System.out.println("which biggest you want : ");
        int choice = sc.nextInt();

        for(int k=1;k<choice;k++){
            int secondBig = arr[0];
            for(int i=1;i<n;i++){
                if(arr[i] < firstBig && arr[i] > secondBig)
                    secondBig = arr[i];
            }
            firstBig = secondBig;
        }
        System.out.println("N th Biggest is : "+firstBig);


    }

}
