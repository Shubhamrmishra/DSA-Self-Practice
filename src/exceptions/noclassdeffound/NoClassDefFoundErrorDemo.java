package exceptions.noclassdeffound;

public class NoClassDefFoundErrorDemo {
    public static void main(String[] args) {

        Removal removal=new Removal();
        System.out.println(removal.n);

        // we have to rename Removal.class file then it throw NoClassDefFoundError at runtime
    }
}
