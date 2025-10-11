import java.util.Scanner;

class Introduction {
    public static void main(String[] args) {
        System.out.println("Hello world");
        // System.out.println("this is a test file");
        // System.out.print("slkdfjl");

        // variable

        // String name = "Rahat";
        // int age = 24;
        // float cgpa = 5.5;
        // char section = 'A';
        // boolean isMale = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        scanner.close();

        Scanner age = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int userAge = age.nextInt();
        age.close();

        System.out.println(userName);
        System.out.println(userAge);
    }
}