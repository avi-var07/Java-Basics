import java.util.Scanner;
class var_args{
    static int sum(int... a){
        int sum=0;
        for(int i: a)
        sum+=i;
        
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            sum+=sum(num);
        }
        System.out.println(sum);
        sc.close();
    }
}