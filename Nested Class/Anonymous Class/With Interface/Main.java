interface EventListener{
    void handleEvent();
}
class Main{
    public static void main(String[] args){
        EventListener listener = new EventListener(){
            public void handleEvent(){
                System.out.println("Event Handled");
            }
        };
        listener.handleEvent();
    }
}