class enums{
    enum day{
        monday(44), tuesday(21), wednesday(41);
        int value;
        day(int value){
            this.value=value;
        }
        int get(){
            return value;
        }
    }
    public static void main(String args[]){
        day d=day.wednesday;
        System.out.println(d);
        
        for(day i:day.values())
        System.out.println(i);
        
        switch(d){
            case monday: System.out.println("monday");
            break;
            case tuesday: System.out.println("tuesday");
            break;
            case wednesday: System.out.println("wednesday");
            break;
        }
        System.out.println(d.ordinal());
        day dd = day.valueOf("monday");
        System.out.println(dd.get());
    }
}