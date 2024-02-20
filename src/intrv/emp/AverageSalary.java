package intrv.emp;

import javasss.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AverageSalary {

    // find the employees whose salary is more than 100000

    public static void main(String[] args) {

        List<javasss.Employee> allEmp= new ArrayList<javasss.Employee>();

        allEmp.add(new javasss.Employee(2,"shubham2","java",20000l));
        allEmp.add(new javasss.Employee(3,"shubham3","Hr",500000l));
        allEmp.add(new javasss.Employee(1,"shubham1","java",30000l));
        allEmp.add(new javasss.Employee(4,"shubham4","hr",3440l));
        allEmp.add(new javasss.Employee(5,"shubham5","java",300000l));
        allEmp.add(new Employee(6,"shubham6","java",2000l));

        allEmp.stream().filter(a->a.getSal()>100000).forEach(emp->
                System.out.println(emp.getId()+ " "+emp.getName()+"sal"+ " "+emp.getSal()));


        double javaDeptAvarageSal = allEmp.stream().filter(a -> a.getDept().contentEquals("java"))
                .map(emp -> emp.getSal())
                .mapToDouble(value -> value.doubleValue())
                .average()
                .getAsDouble();

        System.out.println(javaDeptAvarageSal);


       List<String> names = Arrays.asList("jaipur", "Department","Delhi", "aba");

        String maxLengthofStr = names.stream().reduce(" ", (a, b) -> a.length() > b.length() ? a : b);
        System.out.println(maxLengthofStr);


        names.stream()
                .filter(s -> isPalindrome(s))
                .forEach(System.out::println);



    }

    public static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
