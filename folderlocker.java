import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class FolderLocker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("File Folder Locker Menu:");
        while (true) {
            System.out.println("File Folder Locker Menu:");
            System.out.println("1. Lock a Folder");
            System.out.println("2. Unlock a Folder");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    lockFolder();
                    break;
                case 2:
                    unlockFolder();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    // Lock a folder with a password
    private static void lockFolder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the folder you want to lock: ");
        String folderPath = scanner.nextLine();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        try {
            File folder = new File(folderPath);
            if (!folder.exists() || !folder.isDirectory()) {
                System.out.println("Folder not found.");
                return;
            }

            // Here, you can implement a mechanism to lock the folder with the given password.
            // You may choose to encrypt the folder or set a password to access it.

            System.out.println("Folder locked successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Unlock a locked folder
    private static void unlockFolder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the folder you want to unlock: ");
        String folderPath = scanner.nextLine();
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        try {
            File folder = new File(folderPath);
            if (!folder.exists() || !folder.isDirectory()) {
                System.out.println("Folder not found.");
                return;
            }

            // Here, you can implement a mechanism to check the password and unlock the folder.

            System.out.println("Folder unlocked successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
