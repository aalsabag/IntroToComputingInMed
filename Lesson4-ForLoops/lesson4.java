class Lesson4 {

    public static void main (String args[]){
        System.out.println("Hello World!!");

        // A java for loop will repeat a particular task multiple time
        // What do you think this line does
        for (int i=0; i<5; i++){
            System.out.println("hello");
        }
        // It prints hello 5 times!!

        // Let's break that down 
        //  `int i=0;` this declares a variable called i and sets it to 0
        // `i<5;` defines the condition at which we should stop, when i is no longer less than 5
        // i++ defines how much to increment by. i++ notation means increment by 1,
        // that mean i-- means decrement by 1. i+=3 means increment by 3. i-=3 means decrement by 3, etc      
        
        // The value of i changes in every iteration
        for (int i=0; i<5; i++){
            System.out.println(i); // 0,1,2,3,4
        }
        // Notice that this printed starting from 0 (i = 0) and ended at 4, the
        // last number that satisfies i < 5

        // We can use expressions too
        int a = 20;
        for (int i=2; i< a/2; i++){ // 2 to 9 (less than 10 (<10))
            System.out.println(i);
        }

        // So what happens when we put a loop inside a loop
        for (int i=1; i<=10; i++){
            for (int j=1; j<=5; j++){ // we have to use a different variable (j) since we're already using (i)
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
        // A times table!!!!!!!
        // What is the difference between (<=) and (<) . (<=) is inclusive which is why 10 is included! 
        // It satisfies i <= 10

        // The most important thing is to keep track of the loop variables (i) and (j)
        // REMEMBER the names do not matter, consistency does. This is the same things as above:
        for (int outerLoop=1; outerLoop<=10; outerLoop++){
            for (int innerLoop=1; innerLoop<=5; innerLoop++){
                System.out.print(outerLoop*innerLoop + " ");
            }
            System.out.println();
        }

        // This might be hard to think about, but what does this code do:
        for (int i=1; i<=10; i++){
            for (int j=1; j<=i*2; j++){ 
                System.out.print(j*j + " ");
            }
            System.out.println();
        }

    }
    
}