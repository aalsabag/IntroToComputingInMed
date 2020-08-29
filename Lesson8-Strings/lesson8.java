import java.util.Scanner;

class Lesson8 {

    public static void main (String args[]){
        // Before we dive into all of the String methods we have at our disposal, we're
        // gonna talk about proper procedural design. At this point, we have accumulated
        // quite a bit of knowledge. This means we can build fairly lare programs. When
        // building large programs, an elegant design is key.

        // If you recall our lesson on methods, you may remember how we talked about
        // the main method being a good summary of your program. When people hear this
        // advice they begin to make the mistake of "chaining". A method calling a method
        // that calls another method without ever returning.

        // Try to follow this thread
        System.out.println("This program will give you a person's age group");
        Scanner console = new Scanner(System.in);
        person(console);
        // No returns! The end program resembles a chain. We should attempt to minimize
        // coupling. A better way is like this:
        Scanner console2 = new Scanner(System.in);
        String ageGroup = person2(console2);
        System.out.println(ageGroup);

        //Strings
        // A string is an object soring a sequence of characters. 
        // It has indexes starting with 0, like an array! (hmmmm)
        String a = "Quick Brown Fox";
        // The element in the seventh index is 'r' . Its type is char
        // Here are some comon String methods:
        /*
        indexOf(str) - index where the start of the given str appears. Returns -1 if not found
        length()
        substring(index1, index2) - the characters in this string from index1 (inclusive) to index2 (exclusive);
        substring(index1) - if index2 is omitted, grabs till end of string
        toLowerCase()
        toUpperCase()
        */
        // But how do we call these methods? Using the dot notation
        System.out.println(a.length()); // 15
        // the toLowerCase method example returns a modified string. You must set the result equal to a variable
        a.toLowerCase();
        System.out.println(a); // Quick Brown Fox. It didn't work!

        String b = a.toLowerCase();
        System.out.println(b); // quick brown fox. It worked!

        // You can also override the original value
        a = a.toLowerCase();
        System.out.println(a); // quick brown fox

        // What about conditionals and comparisons
        String candy = "Snickers";
        if ("Snickers" == candy){
            System.out.println("These are the same"); // Will this print
        }

        // For string we have to use the .equals() method
        if (candy.equals("Snickers")){
            System.out.println("These are the same");
        }

        // equals() is not the only comparator method for strings. We have
        // equalsIgnoreCase(), startsWith(), endsWith(), contains()
        if ("Mr. John Smith".startsWith("Mr.")){
            System.out.println("Hello sir");
        }

    }

    public static void person(Scanner console){
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        getAge(console, name);
    }

    public static void getAge(Scanner console, String name){
        System.out.print("Enter your age: ");
        int age = console.nextInt();
        getAgeGroup(console, name, age);
    }

    public static void getAgeGroup(Scanner console, String name, int age){
        if (age < 13){
            System.out.println(name + " is a child");
        }else if (age <20){
            System.out.println(name + " is a teen");
        }else {
            System.out.println(name + " is an adult");
        }
    }

    public static String person2(Scanner console){
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        System.out.print("Enter your age: ");
        int age = console.nextInt();
        return getAgeGroup2(name, age);
    }

    public static String getAgeGroup2(String name, int age){
        if (age < 13){
            System.out.println(name + " is a child");
            return "child";
        }else if (age <20){
            System.out.println(name + " is a teen");
            return "teen";
        }else {
            System.out.println(name + " is an adult");
            return "adult";
        }
    }
}