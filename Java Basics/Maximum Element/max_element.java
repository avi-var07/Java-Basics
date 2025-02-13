import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
        int arr1[] = new int[n];
        
        for(int i=0;i<n;i++)
        arr1[i]=arr[i];
        
        
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        System.out.println(arr[n-1]);
        for(int i=0;i<n;i++){
            if(arr1[i]==arr[n-1])
            System.out.println(i);
        }
        sc.close();
    }
}