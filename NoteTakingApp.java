import java.util.ArrayList;
import java.util.Scanner;

public class NoteTakingApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> notes = new ArrayList<>();

        int choice;

        System.out.println(" Welcome to Notes App ");

        do {

            System.out.println("\n===== NOTES MENU =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Delete Note");
            System.out.println("4. Search Note");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter your note: ");
                    String note = input.nextLine();

                    notes.add(note);

                    System.out.println("Note Added Successfully!");
                    break;

                case 2:

                    if (notes.isEmpty()) {

                        System.out.println(" No Notes Available.");

                    } else {

                   System.out.println("\n Your Notes:");

                        for (int i = 0; i < notes.size(); i++) {

                            System.out.println((i + 1) + ". " + notes.get(i));
                        }
                    }

                    break;

                case 3:

                    if (notes.isEmpty()) {

                        System.out.println("No Notes to Delete.");

                    } else {

                        System.out.println("\n Notes List:");

                        for (int i = 0; i < notes.size(); i++) {

                            System.out.println((i + 1) + ". " + notes.get(i));
                        }

                        System.out.print("Enter note number to delete: ");
                        int delete = input.nextInt();

                        if (delete > 0 && delete <= notes.size()) {

                            notes.remove(delete - 1);

                            System.out.println(" Note Deleted Successfully!");

                        } else {

                            System.out.println("Invalid Note Number.");
                        }
                    }

                    break;

                case 4:
                   System.out.print("Enter keyword to search: ");
                    String search = input.nextLine();

                    boolean found = false;

                    for (String n : notes) {

                        if (n.toLowerCase().contains(search.toLowerCase())) {

             System.out.println(" Found Note: " + n);

                            found = true;
                        }
                    }

                    if (!found) {

            System.out.println(" Note Not Found.");
                    }

                    break;

                case 5:

          System.out.println(" Thank You for Using Notes App!");
                    break;

                default:

                System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        input.close();
    }
}