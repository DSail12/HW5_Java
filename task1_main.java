// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package hw5_java;

import java.util.ArrayList;

public class task1_main {
    public static void main(String[] args) {
        task1_phonebook myPhoneBook = new task1_phonebook();

        myPhoneBook.addUser("Ivan", "Ivanov");
        myPhoneBook.addUser("Feofan", "Ignatov");
        myPhoneBook.addUser("Vasily", "Pupkin");

        myPhoneBook.addPhone("+79991111111", 1);
        myPhoneBook.addPhone("+79992222222", 2);
        myPhoneBook.addPhone("+79993333333", 1);

        for (ArrayList<String> user : myPhoneBook.getAll()) {
            System.out.println(user);
        }
    }
}