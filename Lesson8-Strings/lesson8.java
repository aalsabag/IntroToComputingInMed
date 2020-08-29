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
}