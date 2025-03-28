package javaprojects.p1_addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do { 
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1 -> {
                    System.out.println("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Phone: ");
                    String phone = scanner.nextLine();
                    System.out.println("Enter Email: ");
                    String email = scanner.nextLine();
                    contacts.add(new Contact(name, phone, email));
                    System.out.println("Contact added.");
                }
                case 2 -> {
                    System.out.println("\nContacts:");
                    for (Contact contact : contacts) {
                        System.out.println(contact);
                    }
                }
                case 3 -> System.out.println("Existing Address Book.");
                default -> System.out.println("Invalid choice. Please try again");
            }
        } while (choice != 3);

        scanner.close();
    }
}
