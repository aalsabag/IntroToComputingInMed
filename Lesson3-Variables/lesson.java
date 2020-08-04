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
        // Operating on two ints will yield an int
        // Operating on an int and a double will yield a double!
        /* **********PRACTICE POINT*********** */

        System.out.println(d / c); // = 1 not 1.333

        // Another operation is the modulus operator denoted by %
        // It will give the remainder after performing a division

        System.out.println(d % c); // = 1   3 goes into 4 one time with a remainder 1
        System.out.println(18 % 4); // = 2 ie. 4R2

        System.out.println(5 % 15); // = 5 0R5

        // Don't forget PEMDAS! This is still math afterall
        System.out.println(6 + (18 % (17 - 12))); 
        System.out.println(203 % 100 / 5);
        
        // Mixing types in PEMDAS
        System.out.println(7 / 3 * 1.2 + 3 / 2); //Tough one!

        // These operators can be used with other types like strings!
        // String concatenation is using a + between a string and another
        // value to make a longer string
        System.out.println("ab" + "cd"); // abcd
        System.out.println("ab" + 13); // ab13
        // PEMDAS stilllll applies
        System.out.println(5.0 / 2 + "abcd"); // "2.5abcd"

        // Putting it all together
        String name = "John";
        double income = 20000;
        double tax = .2;
        int bills = 10000;

        System.out.println("My name is: " + name);
        income = income * tax; // notice that we don't have to specify a type
        System.out.println(name + "'s income is: " + income);
        double takeHome = income - bills;
        System.out.println(name + "'s take home income is: " + takeHome);
        
    }
    
}