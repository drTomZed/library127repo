package pl.sdacademy.ui;

import pl.sdacademy.HibernateUtil;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsoleInterface {

    public void userUI() {


        Scanner scanner = new Scanner(System.in);
        String welcomeText = "Welcome in our best dupa Libray. Type number of action what you want to do:  \n" +
                "1 - Check is there a book in the system \n" +
                "2 - Delete book using title \n" +
                "3 - adding new book";

        Scanner skaner = new Scanner(System.in);
        String continueOption = "yes";

        do {
            System.out.println(welcomeText);
            String userSelection = scanner.nextLine();
            Pattern templateRegexOneDigitSelection = Pattern.compile("\\d{1}");
            String text;
            Matcher matcher = templateRegexOneDigitSelection.matcher(userSelection);
                if (matcher.matches()) {

                    int number = Integer.valueOf(userSelection);
                    if (number == 1) {
                        BookFinder bookFinder = new BookFinder();
                        bookFinder.isBookExists();
                    } else if (number == 2) {
                        BookFinder bookFinder = new BookFinder();
                        bookFinder.deleteBook();
                    } else if (number == 3) {
                        BookFinder bookFinder = new BookFinder();
                        bookFinder.addBook();
                    } else {
                        System.out.println("Number what you put is not correct");
                    }
                } else {
                    System.out.println("Data what you type in is not correct");
                }

            System.out.println("Do you want ? yes - tak, no - nie, zamknij program");
            continueOption = skaner.nextLine();

        } while (continueOption.equals("yes"));
        System.out.println("Koniec programu!!!");
        HibernateUtil.shutdown();

    }
}