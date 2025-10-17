import java.util.*;

public class StringBuilders {

    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Rahat");

        // System.out.println(sb);

        // // set char into stirng
        // sb.setCharAt(0, 'H');
        // System.out.println(sb);

        // // insert char
        // sb.insert(0, 'M');
        // System.out.println(sb);

        //delete chart form string 
        // sb.delete(0, 4);
        // System.out.println(sb);

        // add string
        // sb.append(" Shaum");
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Convert string to char array manually
        char[] chars = str.toCharArray();

        // Reverse logic
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i]; // adding each character in reverse order
        }

        System.out.println("Reversed string: " + reversed);
    }
}