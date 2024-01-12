package behavioralpattern.templatemethod;

import behavioralpattern.templatemethod.concreteclass.Facebook;
import behavioralpattern.templatemethod.abstractclass.SocialNetwork;
import behavioralpattern.templatemethod.concreteclass.Twitter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SocialNetwork network = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input user name: ");
        String userName = scanner.nextLine();

        System.out.print("Input password: ");
        String password = scanner.nextLine();

        System.out.print("Input message: ");
        String message = scanner.nextLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = scanner.nextInt();

        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
        scanner.close();
    }
}
