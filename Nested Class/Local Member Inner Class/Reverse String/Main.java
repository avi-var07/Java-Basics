import java.util.Scanner;
class String_Operations{
    void reverse(String str){
        class String_Reverse{
            StringBuilder sb = new StringBuilder(str);
            String reverse(){
                return sb.reverse().toString();
            }

        }
        String_Reverse obj = new String_Reverse();
        System.out.println("Reversed String is: " + obj.reverse());
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String_Operations obj = new String_Operations();
        obj.reverse(str);
        sc.close();
    }
    
}