public class IT26102355Lab7Q2B {

    public static void main(String[] args) {

        int number = 1;

        while (number <= 5) {

            System.out.print(number + " - ");

            int star = 1;

            while (star <= number) {
                System.out.print("*");

                if (star < number) {
                    System.out.print(" ");
                }

                star++;
            }

            System.out.println();
            number++;
        }
    }
}
