import java.util.*;
public class lesson9 {
    public static void main(String args[]){
        System.out.println("Hello World!");

        /* We've already talked about for loops and how they are used. 
        If you've started practing with them, you may have already encountered
        a few problems.
        One of them is what we call the fencepost problem.

        Try to write a function that prints the numbers 1 to n separated by commas
        if n=5
        1,2,3,4,5
        */
        int n=5;
        for (int i=1; i<=n; i++){
            System.out.print(n+",");
        }
        System.out.println();
        //Seems correct. Right???
        // What's wrong with the above
        // 1,2,3,4,5,
        // We have an unneccessary comma after the 5. If you imagine the number as a fencepost
        // and the commas as fencing, you end up with extra fencing, hence the name fencepost problem
        // |----|-----|----|------

        // The way we solve this problem is by creating your first post (number), outside of the loop
        // and begin the inside of the loop with fencing (comma)
        n = 7;
        System.out.print(1);
        for (int i=2; i<=n; i++){
            System.out.print(","+n);
        }
        System.out.println();
        // 1,2,3,4,5,6,7
        // That's better

        // While Loops
        // You may think that for loops will solve all of your problems, but in reality they are for
        // sequential execution of a task.
        // While loops repeatedly execute the body as long as a conditional evaluates to true
        // We can solve the problem from above the exact same way, but with a while loop
        n = 10;
        int x = 1;
        System.out.print(x); // fencepost!!!!!
        while (x<=n) { // While our starting point (x) is less that 10 (n)
            x++; // increment x by one
            System.out.print(","+x);
        }
        System.out.println();

        // Think of examples where while loops are necessary
        // Find the first number divisible by 101 that isn't 101
        int startingNumber =102;
        while (startingNumber % 101 != 0){ // as long as the remainder of x/101 is not 0
            startingNumber++;
            if (startingNumber % 101 == 0){
                System.out.println("Found the first number divisible by 101 = "+startingNumber);
            }
        }
        //While loops also have break commands, to automatically break out of a while loop
        // and just stop looping
        int startingNumber2 =102;
        while (true){ // This would loop forever!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            startingNumber2++;
            if (startingNumber2 % 101 == 0){
                System.out.println("Found the first number divisible by 101 = "+startingNumber2);
                break; // This breaks the while loop no matter what
            }
        }
        // In general it is best not to use break commands when you can make modifications to your
        // while conditional

        //While loops with scanners...
        // Close the scanner when a person types quit into the prompt
        Scanner console = new Scanner(System.in);

        System.out.print("Type a line (or \"quit\" to exit): ");
        String response = console.nextLine();
        while (!response.equals("quit")) {
            System.out.print("Type a line (or \"quit\" to exit):");
            response = console.nextLine();
        }
        console.close(); // close the scanner now that we are out of the loop

        //Random numbers
        // In order to generate a random number, we need to use the Random class in java.util
        // Instantiate the class
        Random r = new Random();
        int randomNumber = rand.nextInt(10); //returns random integer from 0-9

        // How can we get a number between 100 and 200 though
        // simple math
        randomNumber = rand.nextInt(100) + 100;

        int randomDouble = rand.nextDouble(); // returns random real number in range [0.0, 1.0)
        // What if I want a real number that's greater than 1.0
        // just multiply by the factor you want
        randomDouble = rand.nextDouble()*10; // Real number between 0 and 10

        
    }
}
