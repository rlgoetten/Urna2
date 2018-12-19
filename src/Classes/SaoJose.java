package Classes;

public class SaoJose extends Municipio{
    private static final SaoJose INSTANCE = new SaoJose();
    
    //SaoJose sj = new SaoJose();
    
    public static SaoJose getInstance(){
        return SaoJose.INSTANCE;
    }
    
    public SaoJose(){
        super("São José");
    }
}
