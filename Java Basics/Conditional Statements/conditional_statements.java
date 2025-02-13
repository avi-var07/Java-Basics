import java.util.Scanner;
public class conditional_statements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char ch1 = Character.toUpperCase(ch);
        if(!Character.isLetter(ch))
        System.out.println("Enter alphabets only.");
        else{
            if(ch1=='A'||ch1=='E'||ch1=='O'||ch1=='I'||ch1=='U')
            System.out.println("The entered alphabet is a vowel.");
            else
            System.out.println("The entered alphabet is a consonent.");
        }
        sc.close();
    }
}
