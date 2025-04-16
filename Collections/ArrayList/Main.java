import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter -1 to stop!!");
        int n = sc.nextInt();
        while(n!=-1){
            arr.add(n);
            n=sc.nextInt();
        }
        System.out.println("Elements in the array are: ");
        for(int ele:arr)
        System.out.print(ele+" ");
        sc.close();
    }
}