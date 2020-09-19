import java.util.Scanner;

interface DataEntry {

    // abstract public methods
    void integerEntry();
    void stringEntry();
    void doubleEntry();
    void totalList();
}

abstract class D implements DataEntry {
    //instance variables
    int number;
    String word;
    double decimal;
    //method totalList is used to combine input from other 3 methods
    public void totalList(){
        if (number == 1) {
            System.out.println("Would you believe he only left " + number + " donut in the box, \n");
            System.out.println("and... the most important word to you when you started this application " +
                    "was '" + word + "'\n");
        }
        if (number > 1) {
            System.out.println("What would you do if you got paid " + number + " dollars an hour! \n");
            System.out.print("I would yell " + word + "for " + decimal + "seconds, and then remember " +
                    "it's only just an app");
        }
        if (number == 0) {
            System.out.println("Really... " + number + " is the first number you thought of. \n");
            System.out.println("Is that also why you chose " + word + ", you have to dig deeper my friend :P");
        }
        if (number <0) {
            System.out.println("What if your super power was to go back " + number + " days in time?\n");
            System.out.println("You have about " + decimal + " seconds to consult the inner you about your decisions :)\n");
        }
        
        System.out.println("Thank you for trying my app, AUTHOR: EricCanCode");
    }
}

class Input extends D{
    Scanner sc = new Scanner(System.in);
    public void integerEntry(){ // number entry method
        System.out.println("Enter a number");
    number = sc.nextInt();
    }
    public void stringEntry(){ // word entry method
        System.out.println("Enter a word");
    word = sc.next();
    }
    public void doubleEntry(){ // double entry method
        System.out.println("Enter a decimal number");
    decimal = sc.nextDouble();
        System.out.println();
    }
}

class TestMethods implements DataEntry { // Start of program
    public static void main(String [] args){
        System.out.println("Welcome to my interface demo \n");
        System.out.print("This program will take your input and tie it together ");
        System.out.println("using 4 separate methods. \nDepending on a positive, negative, " +
                "1, or a 0 number entry, you will get a different result \n" +
                "so don't be afraid to try it more than once \n");
        DataEntry a = new Input();
        a.integerEntry();
        a.stringEntry();
        a.doubleEntry();
        a.totalList();
    }
    //override methods
    @Override
    public void integerEntry() {
    }

    @Override
    public void stringEntry() {
    }

    @Override
    public void doubleEntry() {
    }

    @Override
    public void totalList() {
    }
}
