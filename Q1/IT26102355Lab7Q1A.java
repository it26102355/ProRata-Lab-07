import java.util.Scanner;

public class IT26102355Lab7Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark;
        int total = 0;
        double average;
        String grade;

        System.out.println("Enter marks for four subjects:");

        int subject = 1;

        while (subject <= 4) {
            System.out.print("Enter Subject Mark " + subject + ": ");
            mark = input.nextInt();

            total = total + mark;
            subject++;
        }

        average = (double) total / 4;

        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);

        input.close();
    }
}
