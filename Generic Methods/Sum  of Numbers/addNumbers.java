//A generic method in Java is a method that is written with a type parameter, allowing it to work with different data types without rewriting the code for each type.
//<T extends Number>: This restricts T to only subclasses of Number, like Integer, Double, Float, etc.
//This means that the method can only accept arguments that are of type Number or its subclasses.
//we need to specify the method name intValue(), doubleValue(), floatValue()...

class addNumbers{
    static <T extends Number>void sum(T a, T b){
        System.out.println("Sum is : " + (a.doubleValue() + b.doubleValue()));
    }
    static <T extends Number, U extends Number> void sumAgain(T a, U b) {
        System.out.println("Sum is: " + (a.doubleValue() + b.doubleValue()));
    }
    public static void main(String[] args) {
        sum(10, 20); // Integer
        sum(10.5, 20.5); // Double
        sum(10.5f, 20.5f); // Float
        sum(10L, 20L); // Long
        sum(10.5d, 20.5d); // Double
        /* sum(10.5f, 20.5d); // Float and Double
        sum(10.5d, 20.5f); // Double and Float
         the above two cases will fail because T extends Number, and both arguments must be of the same type T.
        */
        sumAgain(10.5f,20.5d); // Float and Double
        sumAgain(10.5d,20.5f); // Double and Float
    }
}