import java.util.Scanner;
class maxi_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
        int maxi = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>maxi)
            maxi = arr[i];
        }
        System.out.println(maxi);

        for(int i=0;i<n;i++){
            if(arr[i]==maxi)
            System.out.println(i);
        }
        sc.close();
    }
}