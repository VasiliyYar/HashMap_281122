import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Текст:");
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et" +
                " dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex" +
                " ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat" +
                " nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim" +
                " id est laborum.";
        System.out.println(text);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char k = text.charAt(i);
            if (Character.isLetter(k) == true) {
                if (map.containsKey(k)){
                    map.put (k, map.get(k)+1);
                }else{
                    map.put (k,1);
                }

                continue;
            }
        }
        System.out.println("Количество символов в тексте:");
       System.out.println(map);
        int maxValue = -1;
        int minValue = Integer.MAX_VALUE;
        char max = ' ';
        char min = ' ';
        for (Character key : map.keySet()){
            int value = map.get(key);
            if (value >maxValue) {
                maxValue = value;
                max = key;
            }
            if (value < minValue){
                minValue = value;
                min = key;
            }
        }
        System.out.println("Максимум: " + max +"="+maxValue);
        System.out.println("Минимум: " + min +"="+minValue);
    }

    }

