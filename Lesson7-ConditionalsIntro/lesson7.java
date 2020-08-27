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
        int grade2 = 88;
        if ( (grade2 >= 87) && (grade2 < 90)){ // && indicates both conditions must be met
            System.out.println("You got a B+");
        }

        char letterGrade = "B";
        if ((letterGrade == "A") || (letterGrade == "B") || (letterGrade == "C")) {
            System.out.println("You passed");
        }

        // You can also define what to do if a condition is not met with and else or and else if block
        int grade3 = 71;
        if (grade3 >=90) {
            System.out.println("You got an A");
        } else if ((grade3 >=80) && (grade3 <90)){
            System.out.println("You got a B");
        } else if ((grade3 >=70) && (grade3 <80)){
            System.out.println("You got a C");
        } else if ((grade3 >=60) && (grade3 <70)){
            System.out.println("You got a D");
        } else { // "else" alone means if none of the above conditionals are met, we do the following
            System.out.println("You got a F");
        }

        // It is important to understand the difference between a bunch of if conditionals and an if/else if combo
        // What is wrong with this:

        int grade4 = 81;
        if (grade4 >=90) {
            System.out.println("You got an A");
        }
        if (grade4 >=80) {
            System.out.println("You got an B");
        }
        if (grade4 >=70) {
            System.out.println("You got an C");
        }
        if (grade4 >=60) {
            System.out.println("You got an D");
        }

        // When returning a value, all possible exits must have a return value.
        // Let's look at returnGreaterBad(int a, int b) and returnGreaterGood(int a, int b)

        // Formatting
        // You may have realized by now that having a pretty print statement isn't always fun
        // Formatted printing allows you to put placeholders in your string. The common placeholders
        // are %d (integer), %f (real number), %s (string)
        String name = "John";
        int yearsOld = 35;
        double gpa = 2.5;
        System.out.printf("%s is %d years old and has a %f gpa.", name, yearsOld, gpa);
        // John is 35 years old and has a 2.5 gpa.

        // You can also use it for alignment purposes. %Wd (integer, W characters wide, right aligned)
        // %-Wd (integer, W characters wide, left aligned), %Wf (real, W characters wide, right aligned)
        // We can see this when we create a times table:
        for (int i=1; i<15; i++){
            for (int j=1; j<=15; j++){
                System.out.printf("%4d", (i*j)); // Each number will be 4 spaces apart and will be right aligned
            }
            System.out.println();
        }
        // You can even use it for rounding! %.Df (real number, rounded to D digits after the decimal)
        double length = 3.2432;
        System.out.printf("The length is %.1f feet\n", length); //The length is 3.2 feet

        // Can you figure out what %W.Df does ?????
    }

    // public static int returnGreaterBad1(int a, int b){
    //     if (a>b){
    //         return a;
    //     }// Error, not all paths return a value!
    // }

    // public static int returnGreaterBad2(int a, int b){
    //     if (a>b){
    //         return a;
    //     }else if ((a == b) || (b > a)){
    //         return b;
    //     }
    // } // This also suprisingly will not work even though technically it should be on or the other.
    // The compiler thinks there is a possibility that we won't enter either of these.

    public static int returnGreaterGood(int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    } // This works since "else" functions as the default
}