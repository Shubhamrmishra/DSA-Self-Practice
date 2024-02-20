package Feb7;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> list2 = new LinkedList<Integer>();

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(0);



        System.out.println(list);

        list.add(2,9);

//        System.out.println(list.contains(1));
//
//        System.out.println(list.indexOf(3));
//
//        System.out.println(list.pop());

//        System.out.println(list.peek());
//
//        System.out.println(list.pollLast());
//        System.out.println(list);

     //   List<Integer> collect = list.stream().filter(list3 -> list3.intValue() > 3).collect(Collectors.toList());

//        System.out.println( collect);
//
//        list.add(1);
//        list.add(2);
//
//        System.out.println(list);
//
//        List<Integer> collect1 = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect1);

        System.out.println(list);
//
//        System.out.println(list.stream().count());

        List<Integer> collect = list.stream()
                .filter(a -> a.intValue()>0)
                .sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList());

        System.out.println(collect);



    }
}
