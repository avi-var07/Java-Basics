import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        char arr[]=str.toCharArray();
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(Character.isAlphabetic(arr[i])){
                if(mp.containsKey(arr[i]))mp.put(arr[i],mp.get(arr[i])+1);
                else mp.put(arr[i],1);
            }
        }
        for(var ele:mp.entrySet())System.out.println(ele.getKey()+"->"+ele.getValue());
        sc.close();
    }
}