package principles.interfaces;

@FunctionalInterface
public interface ResultMessage {
    String format(String op, int res);

    //Default: Enriquecer la interfaz


    //Static: Actúan como utilitarios
    static void show(String s){
        System.out.println(s);
    }
}
