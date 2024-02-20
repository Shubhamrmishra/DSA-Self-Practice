package Feb7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfString {
    public static void main(String[] args) {

        String str = "java";

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if ((charCount.containsKey(ch))) {

                charCount.put(ch, charCount.get(ch) + 1);
            }else{
                charCount.put(ch, 1);
            }
        }
        System.out.println(charCount);




//        List<String> strList = new ArrayList<String>();
//
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//
//            if (strList.contains(ch)) {
//
//                System.out.println(strList);
//            }else {
//                strList.add(String.valueOf(ch));
//                count++;
//            }
//        }
//        System.out.println(strList);
//
    }

}
