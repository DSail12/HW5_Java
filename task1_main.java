// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов

package hw5_java;

import java.util.ArrayList;

public class task1_main {
    public static void main(String[] args) {
        task1_phonebook myPhoneBook = new task1_phonebook();

        myPhoneBook.addUser("Dmitry", "Semenov");
        myPhoneBook.addUser("Leonid", "Vasliev");
        myPhoneBook.addUser("Kristina", "Kozlova");

        myPhoneBook.addPhone("+79289502298", 1);
        myPhoneBook.addPhone("+79269934556", 2);
        myPhoneBook.addPhone("+79858458862", 1);
        myPhoneBook.addPhone("+79858458864", 3);

        for (ArrayList<String> user : myPhoneBook.getAll()) {
            System.out.println(user);
        }
    }
}