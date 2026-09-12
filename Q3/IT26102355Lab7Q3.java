import java.util.Scanner;

public class IT26102355Lab7Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int customer = 1;

        while (customer <= 5) {

            System.out.println("Customer " + customer);
            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = input.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * 0.05;
                double amountToBePaid = billAmount - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);

            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);

            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
            customer++;
        }

        input.close();
    }
}
