class Task implements Runnable  //Runnable is an predefined functional interface which is used to create a thread
{
    public void run()   //run method is used to perform the task of the thread
    {
        System.out.println("Hello from run method ");
        
    }
}
class Main
{
    public static void main(String args[])
    {
        System.out.println("Hello from run method 1");
        System.out.println("Hello from run method 2");
        Thread t=new Thread(new Task());
        t.start();
        System.out.println("Hello from run method 3");
        System.out.println("Hello from run method 4");

}
}
//Output:   No order is followed in the output as it depends on CPU Scheduler
/*
Hello from run method 1
Hello from run method 2
Hello from run method 3
Hello from run method 4
Hello from run method
 */