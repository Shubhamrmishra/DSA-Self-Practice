package exceptions;

public class NotFoundExceptionDemo {
    public static void main(String[] args) {

        try {
           // Class.forName("exceptions.Test");
            Class.forName("java.util.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
