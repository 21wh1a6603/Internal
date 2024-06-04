import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        
        scanner.nextLine(); 
        
        System.out.println("Enter student gender:");
        String gender = scanner.nextLine();

        
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

        
        scanner.close();
    }
}

