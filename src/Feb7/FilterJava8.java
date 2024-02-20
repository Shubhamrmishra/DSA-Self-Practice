package Feb7;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterJava8 {


    public static void main(String[] args) {

                List<Integer> list = Arrays.asList(10,11,12,13,14,15,16,17,18,19);

                List<Integer> fil = list.stream()
                        .filter(number -> number % 2 != 0).collect(Collectors.toList());
//                        .forEach(System.out::println);
        System.out.println(fil);




    }
}
