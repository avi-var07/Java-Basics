
class file_exception {
    static void readFile(){
        try{
            File f = new File("file.txt");
            FileReader fr = new FileReader(f);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
    }
}
