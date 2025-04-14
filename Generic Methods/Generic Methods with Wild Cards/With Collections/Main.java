import java.util.*;
class Main{
    static void printList(List<?> lst){ //? means any type of object, wildcard <?> matlab unknown type. Kisi bhi type ki list aa sakti hai — List<String>, List<Integer>, etc. This is unbounded, when you only need to read
        for(Object obj:lst) System.out.println(obj);    //List ke elements print ho rahe hain using Object type kyunki type pata nahi hai. superclass of all classes is Object.
    }
    static void sumList(List<? extends Number>lst){ //This is upper bounded wildcard. It means that the list can only contain Number or its subclasses (like Integer, Double, etc.). It is used when you want to read from the list.
        double sum=0;
        for(Number n:lst) sum+=n.doubleValue();
        System.out.println("Sum: "+sum);
    }
    static void addList(List<? super Integer> lst){ //This is lower bounded. Jab tum list mein T type ke objects add karna chahte ho. super Integer means Integer or its superclass which is Number or Object. 
        lst.add(1); lst.add(2); lst.add(3); lst.add(4); lst.add(5);
        System.out.println("List after adding elements: "+lst);
     }
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("java", "python", "c++", "javascript");
        printList(strList);
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        sumList(intList);
        List<Number> numList = new ArrayList<>();
        addList(numList);
    }
}
//upper bounded mei sub classes ko accept karega. Lower bounded mei super classes ko accept karega.
//Wildcard ka matlab hai ki tumhe pata nahi hai ki type kya hai.
//upper bound and unbounded can only read, lower bound can only write. 