public class Incremental 
{
    public static int cont = 0;
    public static int numb;
    private static Incremental instance;
    private Incremental(int num){
        for(int i = 0; i< num; i++){
            numb = ++cont;
            System.out.println("Incremental "+ numb);
        }
    }
    public static Incremental getIncremental(int num){
        instance = new Incremental(num);
        return instance;
    }
}