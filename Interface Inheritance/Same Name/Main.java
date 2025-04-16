interface Wifi{
    void Connect();
}
interface USB{
    void Connect();
}
class Printer implements Wifi, USB{
    public void ConnectWifi(){
        System.out.println("Connecting via WiFi");
    }
    public void ConnectUSB(){
        System.out.println("Connecting via USB");
    }
}
class Main{
    public static void main(String args[]){
        Printer p = new Printer();
        p.Connect();
    }
}