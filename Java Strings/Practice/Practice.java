class Practice {
    public static void main(String args[])  {  
        String fruit1 = new String("apple");   
        String fruit2 = new String("orange");   
        String fruit3 = new String("pear");    
        fruit3 = fruit1;   
        fruit2 = fruit3;   
        fruit1 = fruit2;
        System.out.println(fruit1);
        System.out.println(fruit2);
        System.out.println(fruit3);

        
    } 
}