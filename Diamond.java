public class Diamond {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) { // executing
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = n; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) { // executing
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}