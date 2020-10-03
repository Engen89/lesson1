package lesson3Coirse2;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "a", "d", "b", "e","f", "a", "g", "f"};

        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> selecmap = new HashMap<>();
        for (String x:words) {
            selecmap.put(x, selecmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(selecmap);

        PhoneBook tellBook = new PhoneBook();
        tellBook.add("Smith", "920 000 00 00");
        tellBook.add("Johnson", "921 111 11 11");
        tellBook.add("Williams", "922 222 22 22");
        tellBook.add("Jones", "923 333 33 33");
        tellBook.add("Brown", "924 444 44 44");
        tellBook.add("Taylor", "925 555 55 55");
        tellBook.add("Davis", "926 666 66 66");
        tellBook.add("Smith", "927 777 77 77");
        tellBook.add("Taylor", "928 888 88 88");

        System.out.println("Phone: " + tellBook.get("Smith"));
    }
}
