package Inter_Task;

import java.util.LinkedList;

public class ReLink {
    public static void main(String[] args) {


        LinkedList<String> links = new LinkedList<String>();
        links.add("shubham");
        links.add("vaibhav");
        links.add("sachin");

        revesrseLink(links);
    }

    private static void revesrseLink(LinkedList<String> links) {

        LinkedList<String> result = new LinkedList<String>();
        for(int i=links.size()-1; i>=0; i--){
            result.add(links.get(i));
        }
        System.out.println(result);
    }

    


}
