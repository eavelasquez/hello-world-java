
import java.util.Scanner;

/**
 *
 * @author ev
 */
public class HelloWorld {

    public static void main(String args[]) {
        System.out.println("Hello World from Java!");

        // Define an integer variable
        int myIntVariable = 0;
        System.out.println(myIntVariable);

        // Change value of integer variable
        myIntVariable = 1;
        System.out.println(myIntVariable);

        // Define a string variable
        String myStringVariable = "Greetings!";
        System.out.println(myStringVariable);

        // Change value of string variable
        myStringVariable = "Goodbye!";
        System.out.println(myStringVariable);

        // Define a data type var - infers the integer data type
        var myIntVarVariable = 2;
        System.out.println(myIntVarVariable); // shorcut sout

        // Define a data type var - infers the string data type
        var myStringVarVariable = "A pleasure to greet.";
        System.out.println("myStringVarVariable = " + myStringVarVariable); // shortcut soutv

        // Examples of allowed name nomenclatures for variables
        var myVariable = 1;
        var _myVariable = 2;
        var $myVariable = 3;

        // Note: to format the code use Alt + Shift + F
        // String concatenation
        var user = "Alice";
        var jobTitle = "Engineer";
        var concatenate = jobTitle + " " + user;
        System.out.println("concatenate = " + concatenate);

        var i = 3;
        var j = 4;
        System.out.println(i + j); // Sum of numbers
        System.out.println(i + j + user); // 7Alice - The hierarchy of operations is evident
        System.out.println(user + i + j); // Alice34 - The concept of string is applied
        System.out.println(user + (i + j)); // 7Alice - The use of parentheses changes the order of priority

        // Special characters
        var name = "Bob";
        System.out.println("New line character: \n" + name);
        System.out.println("Tab character: \t" + name);
        System.out.println("Backspace character: \b" + name);
        System.out.println("Single quote character: \'" + name + "\'");
        System.out.println("Double quote character: \"" + name + "\"");

        // Scanner class
//        Scanner console = new Scanner(System.in);
//        System.out.println("Enter your first name:");
//        var firstName = console.nextLine();
//        System.out.println("firstName = " + firstName);
//        System.out.println("Enter your profession:");
//        var profession = console.nextLine();
//        System.out.println("profession = " + profession);
//        var result = profession + " " + firstName;
//        System.out.println("result = " + result);
//        System.out.println("Provide the title:");
//        var title = console.nextLine();
//        System.out.println("Provide the author:");
//        var author = console.nextLine();
//        System.out.println(title + " fue escrito por " + author);

        /*
            integer primitive data types: byte (8 bits), short (16 bits), int (32 bits), long (64 bits)
         */
        byte byteNumber = (byte) 129; // type conversion
        System.out.println("byteNumber = " + byteNumber); // -127 (loss of precision)
        System.out.println("Minimum value of data type byte: " + Byte.MIN_VALUE);
        System.out.println("Maximum value of data type byte: " + Byte.MAX_VALUE);

        short shortNumber = (short) 32768;
        System.out.println("shortNumber = " + shortNumber); // -32768 (loss of precision)
        System.out.println("Minimum value of data type short: " + Short.MIN_VALUE);
        System.out.println("Maximum value of data type short: " + Short.MAX_VALUE);

        int intNumber = (int) 2147483648L; // long data type literal (...l o ...L)
        System.out.println("intNumber = " + intNumber); // -2147483648 (loss of precision)
        System.out.println("Minimum value of data type int: " + Integer.MIN_VALUE);
        System.out.println("Maximum value of data type int: " + Integer.MAX_VALUE);

        long longNumber = (long) 9223372036854775807L; // float o double data type literal (...f, ...F, ...d, ...D)
        System.out.println("longNumber = " + longNumber);
        System.out.println("Minimum value of data type long: " + Long.MIN_VALUE);
        System.out.println("Maximum value of data type long: " + Long.MAX_VALUE);

        /*
            float primitive data types: float (32 bits), double (64 bits)
            Note: the float or double data type can store larger numbers due to exponential notation (...e1 or ...E1)
         */
        float floatNumber = (float) 3.4028236E38D; // float data type literal (...f or ...F) or (float)10.0;
        System.out.println("floatNumber = " + floatNumber); // Infinity - Indeterminate (loss of precision)
        System.out.println("Minimum value of data type float: " + Float.MIN_VALUE);
        System.out.println("Maximum value of data type float: " + Float.MAX_VALUE);

        double doubleNumber = 1.7976931348623157E308;
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("Minimum value of data type double: " + Double.MIN_VALUE);
        System.out.println("Maximum value of data type double: " + Double.MAX_VALUE);

        /*
            char is a primitive data type (16 bits)
            Note: List of Unicode characters. For more information: https://en.wikipedia.org/wiki/List_of_Unicode_characters
         */
        char myChar = 'a';
        System.out.println("myChar = " + myChar);

        char charByCode = '\u0021'; // ! By code
        System.out.println("charByCode = " + charByCode);

        char charByDecimal = 33; // ! By decimal
        System.out.println("charByDecimal = " + charByDecimal);

        char charByGlyph = '!';
        System.out.println("charByGlyph = " + charByGlyph);

        // Define a data type var - infers the char data type by special character
        var charByCode1 = '\u0021'; // ! By code
        System.out.println("charByCode1 = " + charByCode1);

        // Define a data type var - infers the char data type by type conversion
        var charByDecimal1 = (char) 33; // ! By decimal
        System.out.println("charByDecimal1 = " + charByDecimal1);

        // Define a data type var - infers the char data type by single quote and unique character
        var charByGlyph1 = '!';
        System.out.println("charByGlyph1 = " + charByGlyph1);

        // A char data type can be converted to and integer data type
        // It's converted to the decimal code associated with the symbol
        int integerWithSymbol = '!';
        System.out.println("integerWithSymbol = " + integerWithSymbol); // 33

        int letterA = 'a';
        System.out.println("letterA = " + letterA);

        /*
            boolean is a primitive data type (values: true or false, false is default)
         */
        boolean myBooleanVariable = true;
        System.out.println("myBooleanVariable = " + myBooleanVariable);

        // ifelse control structure
        if (myBooleanVariable) { // (myBooleanVariable) equals (myBooleanVariable == true)
            System.out.println("The flag is true");
        } else {
            System.out.println("The flag is flase");
        }

        // Sample
        var age = 21;
        var isAdult = age >= 18;

        if (isAdult) {
            System.out.println("You're of age");
        } else {
            System.out.println("You're a minor");
        }

        // Conversion from string data type to int data type
        // var number = "20";
        var number = Integer.parseInt("20");
        System.out.println("number = " + (number + 1));

        // Conversion from string data type to double data type
        var pi = Double.parseDouble("3.1416");
        System.out.println("pi = " + pi);

        // Conversion an input to an int data type
//        var scanner = new Scanner(System.in);
//        System.out.println("Provide a number: ");
//        number = Integer.parseInt(scanner.nextLine());
//        System.out.println("number = " + number);
        // Conversion from int data type to string data type
        var stringNumber = String.valueOf(number);
        System.out.println("stringNumber = " + stringNumber);

        // Retrieve a char from the string
        var character = "Hello".charAt(0);
        System.out.println("character = " + character);

        // Conversion an input to a char data type
//        var scanner = new Scanner(System.in);
//        System.out.println("Provide a character:");
//        character = scanner.nextLine().charAt(0);
//        System.out.println("character = " + character);
        var scanner = new Scanner(System.in);

        // Sample
        System.out.println("Provide the name:");
        String bookName = scanner.nextLine();

        System.out.println("Provide the id:");
        int bookId = Integer.parseInt(scanner.nextLine());

        System.out.println("Provide the price:");
        double bookPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Provide free shipping (true or false):");
        boolean freeShipping = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(bookName + " #" + bookId);
        System.out.println("Price: " + '\u0024' + bookPrice);
        System.out.println("Free shipping: " + freeShipping);
    }
}
