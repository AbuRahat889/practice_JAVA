public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        // butterfly pattern
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
        System.out.print("* ");
        }
        int space = 2 * (n - i);
        for (int j = 1; j <= space; j++) {
        System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
        System.out.print("* ");
        }
        System.out.println();

        }
        
        for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
        System.out.print("* ");
        }
        int space = 2 * (n - i);
        for (int j = 1; j <= space; j++) {
        System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
        System.out.print("* ");
        }
        System.out.println();
        }

        // rombos
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j <= n + 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
