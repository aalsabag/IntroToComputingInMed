class Lesson {

    public static void main (String args[]){
        System.out.println("Hello World!!");

        // A variable is a piece of computer memory that can
        // store a value.
        int a = 123;
        // Here we have stated that we have a variable called 'a'
        // and the value of this variable is 123.

        // Now we can use it!
        System.out.println(a);

        // Notice the 'int' defined a before the name of the variable.
        // This is called the type. There are quite a few types out there
        // but for now we will discuss 'int's and 'double's

        // An int is an integer. Remember math class! Any whole number.
        // ex: -50, 31, 0, 13443

        // A double is a real number
        // ex: 3.54, -2.1, 2.0
        // They are declared like this:
        double b = 2.5;
        System.out.println(b);

        // We can do some math with these variables that we've created
        int c = 3;
        int d = 4;
        int e = c + d;
        System.out.println(e); //7
        // You can just call it directly too
        System.out.println(c * d); //12

        // We can also do division, but there is an important rule to remember
        // Operating on two ints will yield and int
        // Operating on an int and a double will yield a double!
        /* **********PRACTICE POINT*********** */

        System.out.println(d / c); // = 1 not 1.333


    }
    
}