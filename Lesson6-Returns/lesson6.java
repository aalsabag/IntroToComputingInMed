class Lesson6 {
    public static void main(String args[]){
        System.out.println("Hello World!");

        // We've covered a number of data types so far. Most of them are what 
        // we would call primitive data types. There are only 8 primitive data
        // types in Java in particular (byte, short, int, long, float, double, char, boolean)
        // That Java standard library has a bunch more (String, Color, Math, etc.)

        // The Math class contains static methods that would be used like this:
        System.out.println(Math.abs(-10)); // |-10|
        System.out.println(Math.round(10.5));
        System.out.println(Math.pow(5, 2)); // 5^2
        System.out.println(Math.sqrt(25)); // sqrt(25)

        // To convert from one type to another, say from an int to a double, is called type
        // casting. This can prove to be very useful when doing math
        System.out.println(12/5); // Normally this would return 2, an int
        double division = (double) 12/5; 
        System.out.println(division); // This returns 2.4, a double

        // Calling these Math methods alone does nothing
        Math.abs(-10); // Nothing happens
        // These methods have what are called return values. They return and pass a value along
        // usually to a variable like this:
        int absolute = Math.abs(-10);
        System.out.println(absolute);
        
        // How can we implement return values!? It's simple we use the return key word. The 
        // addTwoNumbers(int a, int b) method below describes this.
        // We would use the method like this:
        int sum = addTwoNumbers(10, 15);
        System.out.println(sum); // prints 25
        // Now we have a method for adding two numbers that we can use over and over again.
        // Lets say we wanted to keep adding 15 using our method
        sum = addTwoNumbers(sum, 15);
        sum = addTwoNumbers(sum, 15);
        sum = addTwoNumbers(sum, 15);
        sum = addTwoNumbers(sum, 15);
        // What's our value now? BTW, there is a much easier way to keep adding 15? Anyone remember?
    }

    // This first thing that should be noticed here is that this method no longer says void, but
    // rather int, the type of what we will be returning.
    //            ***
    public static int addTwoNumbers(int a, int b){
        int result = a + b;

        return result; // result is an int, just like we promised in the header
        // return a+b; would make this even shorter
    }
}