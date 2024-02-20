package Feb19;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

    public static void main(String[] args) {

        LinkedList<String> cityList = new LinkedList<String>();

        cityList.add("Jaipur");
        cityList.add("Delhi");
        cityList.add("Noida");
        cityList.add("Prayagraj");

        System.out.println(cityList);

        List<String> cities = new LinkedList<String>();

        cities.addAll(cityList);


        List<String> collect = cities.stream().map(String::trim).collect(Collectors.toList());
        System.out.println(collect);


    }
}
