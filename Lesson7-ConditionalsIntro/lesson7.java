import java.util.Scanner;

class Lesson7 {
    public static void main(String args[]){
        // Scanner - allows us to read inputs from different sources
        // Today we'll cover how to read values from the command line.

        // The scanner we will be using comes from java.util.Scanner so you will have
        // to import it at the top of this file

        // The scanner has a few methods, most notable are nextInt(), nextDouble(), nextLine()
        // Each of these methods will wait until a user presses the Enter key

        // First we instantiate the Scanner, we'll call it console
        Scanner console = new Scanner(System.in);

        System.out.print("What day is it today? ");
        int day = console.nextLine(); // It will wait until you type something and press enter. It then stores in the day variable
        System.out.println("Today is " + day); // This will print out the day variable
       
        
        System.out.print("What is your age ");
        int age = console.nextInt();
        System.out.println("You are " + age + " years old");
        // console.close(); // Once you are done with a console it is important to close it for proper clean up. There is a better way, but we will cover that at a later time.

        // Conditionals
        // An if block executes only if a condition is true
        // You would use it like this:
        int grade = 91;
        if (grade >= 90) { // if your grade is greater than or equal to 90
            System.out.println("You got an A");
        }

        // In the example above we used the >= operator to indicate greater than or equal to
        // There are other operators to
        // == equals
        // != does not equals
        // < less than;  <= less than or equal to
        // > greather than; >= greater than or equal to

        if (3 != 3) { // What does this mean?
            System.out.println("This should never print");
        }
        
        // What happens when we want to combine conditions
        // We have && to indicate AND and || to indicate OR
        int grade2 = 85;

    }
}