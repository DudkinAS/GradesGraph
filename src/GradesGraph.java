// Alia Dudkin
// COSC 1430 -501
// Project #5
// Due date: 4/18/2018
// Description: Graph of grades using methods


import java.util.Scanner;

public class GradesGraph {
    public static void main(String[] args) {

        // create object 'self'
        GradesGraph self = new GradesGraph();

        // call method 'input' - read grades and store in variables
        int A = self.input('A');
        int B = self.input('B');
        int C = self.input('C');
        int D = self.input('D');
        int F = self.input('F');
        System.out.println();

        // calculate sum of grades
        int sum = A + B + C + D + F;

        // call method 'heading' - print head
        self.heading();

        // call method 'calculate' to calculate percentage of letter grades and return into the method 'display' to
        // print results
        System.out.println();
        self.display(self.calculate(sum, A), 'A');
        self.display(self.calculate(sum, B), 'B');
        self.display(self.calculate(sum, C), 'C');
        self.display(self.calculate(sum, D), 'D');
        self.display(self.calculate(sum, F), 'F');

    }

    /**
     * print string message
     * @param message: string
     */
    public void print(String message)
    {
        System.out.print(message);
    }

    /**
     * read user input
     * @param grade
     * @return integer
     */
    public int input(char grade)
    {
        Scanner keyboard = new Scanner(System.in);
        print("Enter the number of " + grade + "'s: ");
        return keyboard.nextInt();

    }

    /**
     * print heading
     */
    public void heading()
    {
        System.out.println("0         10        20        30        40        50        60        70        80        90     100%");
        System.out.println("|         |         |         |         |         |         |         |         |         |       |");
        for (int i = 0; i < 50; i++) {
            System.out.print("* ");
        }
    }

    /**
     * calculate percent grade of sum
     * @param sum: an integer
     * @param grade: an integer
     * @return integer
     */
    public int calculate(int sum, int grade)
    {
        double s = (double) sum;
        double g = (double) grade;
        return ((int)((g/s)*100));

    }

    /**
     * creating star output and display
     * @param percent: integer
     * @param grade: character
     */
    public void display(int percent, char grade)
    {
        int stars = ((percent + 1)/2);
        for (int i = 0; i < stars; i++)
        {
            System.out.print("* ");
        }
        System.out.println(" " + grade);
    }

}
