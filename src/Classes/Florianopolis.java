package Classes;

public final class Florianopolis extends Municipio{
    private static final Florianopolis INSTANCE = new Florianopolis();
    
    //Florianopolis floripa = new Florianopolis();
    
    public static Florianopolis getInstance(){
        return Florianopolis.INSTANCE;
    }
    
    public Florianopolis(){
        
        super("Florianópolis");
    
    }
}
