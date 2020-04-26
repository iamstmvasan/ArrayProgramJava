import java.util.Scanner;

public class Searching {
    int arr[],n,s_ele;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n & search ele : ");
        n = sc.nextInt();
        s_ele = sc.nextInt();
        arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" ele : ");
            arr[i] = sc.nextInt();
        }
    }

    void process(){
        boolean flag = false;
        int i;
        for(i=0;i<n;i++) {
            if (arr[i] == s_ele) {
                flag = true;
                break;
            }
        }
         if(flag)
             System.out.println("Avilable "+(i+1));
         else
             System.out.println("Not available");
        }
    }

