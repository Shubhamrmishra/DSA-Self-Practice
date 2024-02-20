package Jan19.reflection;

import java.lang.reflect.Field;

public class Reflection {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Company company = new Company("Facebook");
        System.out.println("company name is: " + company.getName());

        Field name = Company.class.getDeclaredField("name");
        name.setAccessible(true);
        name.set(company,"Meta");
        System.out.println("company name is: " + company.getName());

        company.showCompanyName();
        
    }
}
