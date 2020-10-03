package lesson3Coirse2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private HashMap<String, Set<String>> phoneBook = new HashMap<>();

    public void add (String name, String phone) {
        Set<String> number = phoneBook.getOrDefault(name, new HashSet<>());
        number.add(phone);
        phoneBook.put(name, number);
    }

    public Set<String> get (String name){
        return phoneBook.get(name);
    }
}
