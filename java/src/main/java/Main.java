import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Dev branch");

        int counter = 0;
        while (true) {
            counter++;

            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            try {
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                break;
            } catch (Exception e) {

            }
        }
    }
}
