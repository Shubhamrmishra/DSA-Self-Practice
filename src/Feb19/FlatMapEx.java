package Feb19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEx {
    public static void main(String[] args) {
       List< List<String>> lists = Arrays.asList(
         Arrays.asList("hello","my","name","is"),
               Arrays.asList("shubham","And","And","I"),
               Arrays.asList("Love","java","8")
       );

        System.out.println(lists);

        List<String> collect = lists.stream().flatMap((List<String> name) -> name.stream()).collect(Collectors.toList());
        System.out.println(collect);

        List<String> stringStream = lists.stream().flatMap((List<String> name) -> name.stream().filter(s -> s.length() >= 3).distinct()).collect(Collectors.toList());

        System.out.println(stringStream);



    }
}
