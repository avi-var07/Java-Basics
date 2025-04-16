import java.util.*;

class numberOfOccurences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter -1 to stop!!");
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        while(n!=-1){
            arr.add(n);
            n=sc.nextInt();
        }
        int count=0;
        System.out.println("Enter element whose number of occurences you want to know: ");
        int key = sc.nextInt();
        System.out.println("Elements in the array are: ");
        for(int ele:arr)
        System.out.print(ele+" ");

        System.out.println();
        for(int ele: arr)
        if(ele==key) count++;
        System.out.println(count);
        sc.close();
    }
}