import java.util.Scanner;
class first_repeatative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
         int flag=-1;
        for(int i = 0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    flag++;
                    break;
                }
            }
            if(flag==0)
            break;
        }
        sc.close();
    }
}