import java.util.*;

class checkSubset {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first set: ");
        int n = sc.nextInt();
        System.out.println("Enter size of another subset: ");
        int m = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        System.out.println("Enter elements of first set: ");
        for(int i=0;i<n;i++){
            String  ele = sc.next();
            arr.add(ele);
        }
        System.out.println("Enter elements of another set: ");
        for(int i=0;i<m;i++){
            String  ele = sc.next();
            arr1.add(ele);
        }
        int count =0;
        for(String ele: arr1)
        if(arr.indexOf(ele)!=-1)count++;

        if(count==m)System.out.println("Yes the other set is a subset of first set!");
        else System.out.println("No the sets are different! ");
        
        sc.close();
    }
}