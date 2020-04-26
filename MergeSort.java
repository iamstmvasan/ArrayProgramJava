import java.util.Scanner;

public class MergeSort {
    int f_arr[],s_arr[],m_arr[],n;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n & search ele : ");
        n = sc.nextInt();
        f_arr = new int[n];
        s_arr = new int[n];
        m_arr = new int[n*2];
        System.out.println("-------------------First array input----------------");
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" ele : ");
            f_arr[i] = sc.nextInt();
        }
        System.out.println("----------------------------------------------------");
        System.out.println("-------------------second array input---------------");
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" ele : ");
            s_arr[i] = sc.nextInt();
        }
        System.out.println("----------------------------------------------------");
    }
    void process(){
        int j = 0;
        for(int i=0;i<n;i++)
            m_arr[j++] = f_arr[i];

        for(int i=0;i<n;i++)
            m_arr[j++] = s_arr[i];

        System.out.println("-------------------merge array---------------");
        for(int i=0;i<n*2;i++)
            System.out.print(m_arr[i]+"\t");
        System.out.println("----------------------------------------------------");
        System.out.println("-------------------Decending array---------------");
        for(int i=0;i<m_arr.length-1;i++)
            for(j=i+1;j<m_arr.length;j++)
                if(m_arr[i] < m_arr[j]){
                    int temp = m_arr[i];
                    m_arr[i] = m_arr[j];
                    m_arr[j] = temp;
                }
        for(int i=0;i<n*2;i++)
            System.out.print(m_arr[i]+"\t");
        System.out.println("----------------------------------------------------");
    }
}
