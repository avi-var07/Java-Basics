import java.util.Scanner;

class string_func {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = "Hello Class";
        String s2 = "Hello World";
        System.out.println(s1.length());    //11
        System.out.println(s1.charAt(7));//l
        System.out.println(s1.substring(3, 7));//lo C
        System.out.println(s1.concat(s2));  //Hello ClassHello World
        System.out.println(s1); //Hello Class
        System.out.println(s2); //Hello World
        System.out.println(s1.equals(s2));  //false
        System.out.println(s1.equalsIgnoreCase(s2));    //false
        System.out.println(s1.compareTo(s2));   //-20 because 'C' is less than 'W'
        System.out.println(s1.compareToIgnoreCase(s2)); //-20
        String p = "jaAaa java";
        System.out.println(p.indexOf('a')); //1
        System.out.println(p.lastIndexOf('a'));     //9
        System.out.println(p.indexOf('a', 2));  //3
        System.out.println(p.lastIndexOf('a', 2));  //1
        System.out.println(p.indexOf("aa"));    //3
        String name = "Aviral Varshney";
        System.out.println(name.contains("@")); //false
        String a = "*".repeat(name.length());   
        System.out.println(a);  //***************
        System.out.println(p.toUpperCase());    //JAAAA JAVA    
        System.out.println(name.toLowerCase()); //aviral varshney
        String u = "   Aviral Varshney   ";     
        System.out.println(u.trim());   //Aviral Varshney
        //String arr[] = name.split(" ");
        System.out.println(a.replaceAll("[aeiou]","#"));
        sc.close();
    }
}