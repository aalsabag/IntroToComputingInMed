class Lesson {

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
        
    }
    
}