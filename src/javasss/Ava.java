package javasss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ava
{

    // find the employees whose salary is more than 100000

    public static void main(String[] args) {

        List<Employee> allEmp= new ArrayList<Employee>();

        allEmp.add(new Employee(2,"shubham2","java",20000l));
        allEmp.add(new Employee(3,"shubham3","Hr",500000l));
        allEmp.add(new Employee(1,"shubham1","java",30000l));
        allEmp.add(new Employee(4,"shubham4","hr",3440l));
        allEmp.add(new Employee(5,"shubham5","java",300000l));
        allEmp.add(new Employee(6,"shubham6","java",2000l));

       allEmp.stream().filter(a->a.getSal()>100000).forEach(emp->
               System.out.println(emp.getId()+ " "+emp.getName()+"sal"+ " "+emp.getSal()));





    }


}
