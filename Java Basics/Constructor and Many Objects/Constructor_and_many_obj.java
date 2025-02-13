import java.util.Scanner;
class Science{
    String model;
    int RAM, year;
    static Scanner  sc = new Scanner(System.in);
    double speed;
    static int c=0;
    Science(String model, int RAM, int year, double speed){
        c++;
        this.model=model;
        this.RAM = RAM;
        this.year=year;
        this.speed=speed;
    }
    void getdata(){
        //sc.nextLine();
        model = sc.nextLine();
        RAM=  sc.nextInt();
        year=sc.nextInt();
        speed = sc.nextDouble();
        if(c>1)sc.nextLine();
    }
    void putdata(){
        System.out.println(model);
        System.out.println(RAM);
        System.out.println(year);
        System.out.println(speed);
        System.out.println(c);
    }
}
class Constructor_and_many_obj{
    public static void main(String args[]){
        Science ob1=new Science("default",0,0,0.0);
        Science ob2=new Science("default",0,0,0);
        Science ob3=new Science("default",0,0,0);
        Science ob4=new Science("default",0,0,0);
        ob1.getdata();
        ob2.getdata();
        ob3.getdata();
        ob4.getdata();
        ob1.putdata();
        ob2.putdata();
        ob3.putdata();
        ob4.putdata();
        
    }
}