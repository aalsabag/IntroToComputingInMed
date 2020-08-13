class Lesson5 {
    public static final String MY_NAME = "Bob";
    public static void main(String args[]){
        System.out.println("Hello World!");

        // Real quick we are going to talk about the limitations of variables.
        // Firstly, a variable in one method is unknown to another method.
        // public static void method1(){int a =0;}
        // public static void method2(){int b =0;}
        // In the above example, a cannot be accessed from method2 and vice versa.

        // Another limitation is regarding scope. A variable is accessible from its declaration
        // to the end of its braces { } 
        // Which means that a variable can be declared twice with the SAME name if the scopes do
        // not overalap. 
        // Where have we seen this before??????????
        for (int i=0; i<10; i++){//scope i begins
            System.out.println("loop1");
        }//scope i ends
        for (int i=0; i<10; i++){ // scope i begins
            System.out.println("loop2");
        } // scope i ends
        // We declared i twice!!

        for (int i=0; i<10; i++){//scope i begins
            for (int j=0; j<10; j++){ // scope j begins
                System.out.println("loop1");
            } // scope j ends
        }// scope i ends

        // Constants are exactly what they sound like! The value is set only at declaration.
        // They are declared like this:
        // public static final String MY_NAME = "Bob";
       System.out.println(MY_NAME);

       // PARAMETERS
       // To talk about parameters, you have to remember our discussion about methods. All
       // examples we've discussed so far don't have any parameters.
       // public static void helloWorld(int count) {...}
       // The parameter in the above method is the count. It is a value that must be passed
       // in to a method for it to function. Below the method is defined.

       //helloWorld() // this alone would give a compilation error
       helloWorld(3); // prints hello world 3 times

       int a = 2;
       helloWorld(a); // prints hellow world 2 times
       // These examples would work. We would be passing in the 'count' and the value is used in the for loop

       // We can also pass in multiple values
       helloName(3, "Steve"); // prints "Hello Steve!" 3 times
    }

    public static void helloWorld(int count) { 
        for (int i=0; i<count; i++){ // the method basically prints hello world based on the number passed in
            System.out.println("Hello World!");
        }
    }

    // multiple parameters
    public static void helloName(int count, String name) { 
        for (int i=0; i<count; i++){ // the method basically prints hello 'name' 'count' number of times
            System.out.println("Hello " + name +"!");
        }
    }
}