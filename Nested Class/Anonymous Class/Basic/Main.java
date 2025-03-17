class Animal{
    void makesound(){
        System.out.println("Animal makes sound");
    }
    void display(){
        System.out.println("Animal is displayed");
    }
}
class Main {

    public static void main(String[] args) {
        var ob = new Animal(){  //var is used to create an object of anonymous class, it is general type
            void makesound(){
                System.out.println("Dog barks");
            }
            void show(){
                System.out.println("Dog is shown");
            }
        };
        ob.makesound();
        ob.display();
        ob.show(); 
    }
}