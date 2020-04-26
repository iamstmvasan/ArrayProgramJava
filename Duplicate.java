import java.util.Scanner;

public class Duplicate {
    int arr[],n;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
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
        for(int i=0;i<n-1;i++){
            int count = 1;
            boolean flag = true;
            for(int j = 0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                for(int j = i+1;j<n;j++)
                    if(arr[i] == arr[j])
                        count++;
            }
            if(count>1)
                System.out.println(arr[i]+"------->"+count);
        }
    }
}
