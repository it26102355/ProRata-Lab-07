public class IT26102355Lab7Q2C {

    public static void main(String[] args) {

        int number = 5;

        while (number >= 1) {

            int count = 1;

            while (count <= number) {
                System.out.print(number);
                count++;
            }

            System.out.println();
            number--;
        }
    }
}
