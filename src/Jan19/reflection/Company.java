package Jan19.reflection;

public class Company {
    public String getName() {
        return name;
    }

    public Company(String name) {
        this.name = name;
    }

    private String name ;



    public void showCompanyName() {
        System.out.println("private methode invoked, Company name is :"+ name);
    }
}
