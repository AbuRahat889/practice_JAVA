import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        String firstName = "Abu";
        String lastName = "Rahat";
        String fullName = firstName + lastName;

        System.out.println(fullName);
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }

    }
}
