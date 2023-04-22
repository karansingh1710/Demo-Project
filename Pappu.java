public class Pappu {
    public static void main(String[] args) {
        int n = 7;
        // This print statment seperate the output and print after two lines
        System.out.println("\n\n");
        for (int i = 0; i < n; i++) {
            // P
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j > 0 && j < n - 1 || j == n - 1 && i < (n - 1) / 2 && i > 0
                        || i == (n - 1) / 2 && j < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // This print statement prints a space between letter
            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 || i == 0 && j > 0 && j < n - 1 || j == n - 1 && i > 0 || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
             // P
             for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j > 0 && j < n - 1 || j == n - 1 && i < (n - 1) / 2 && i > 0
                        || i == (n - 1) / 2 && j < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
             // P
             for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j > 0 && j < n - 1 || j == n - 1 && i < (n - 1) / 2 && i > 0
                        || i == (n - 1) / 2 && j < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            // U
             for (int j = 0; j < n; j++) {
                if (j==0&&i<n-1 || j==n-1&&i<n-1 || i==n-1&&j>0&&j<n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
