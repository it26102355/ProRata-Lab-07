import java.util.Scanner;

public class IT26102355Lab7Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int student = 1;

        while (student <= 3) {

            int total = 0;

            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            int subject = 1;

            while (subject <= 4) {
                int mark = input.nextInt();
                total = total + mark;
                subject++;
            }

            double average = (double) total / 4;
            String grade;

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();

            student++;
        }
    }
}
