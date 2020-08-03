class Lesson {
//
    public static void main(String args[]){

        // Printing
        // Difference between this ....
        System.out.println("This is my first print line.....");
        // and this
        System.out.print("This is my second print line.....");
        /* **********PRACTICE POINT*********** */

        // Escape characters
        // What if i want to add a new line at the end of my code

        // Option 1 - An empty line, you already know how to do this:
        System.out.println(); // This can get ugly if I want to write many new lines

        // Option 2 - New line escape character
        System.out.println("abc\n\n\n\n\n\ndef"); //much cleaner
        // the letter "n" preceded by a backslash "\" is a new line
        // we call these escape characters

        // What if I actually want to print a backslash!?
        // There is an escape character for that too, it's just another
        // back slash
        System.out.println("\\ this is a backslash");
        /* **********PRACTICE POINT*********** */
        /* Here are some common escape characters
        \t - Insert a tab in the text at this point.
        \b - Insert a backspace in the text at this point.
        \n - Insert a newline in the text at this point.
        \r - Insert a carriage return in the text at this point.
        \f - Insert a formfeed in the text at this point.
        \' - Insert a single quote character in the text at this point.
        \" - Insert a double quote character in the text at this point.
        \\ - Insert a backslash character in the text at this point.
        */

        /* **********PRACTICE POINT*********** */
        // Erros and Debugging
        // What's wrong with the following statement:
        // System.out.println(".......")
        
        // And this one
        // System.out.println("this should work really well,.....);
    }
}