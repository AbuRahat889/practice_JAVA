import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[][] names = new int[3][2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter name: ");
                names[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

    }
}
