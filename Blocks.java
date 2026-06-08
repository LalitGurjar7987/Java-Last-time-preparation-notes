//cunstrocyor instance block amnd static block 
/*
instance block use = Suppose you have multiple constructors and all of them need some common initialization code

class Student {
    Student() {
        System.out.println("Database Connected");
    }

    Student(String name) {
        System.out.println("Database Connected");
    }
}
*/
/*
Constructor

A constructor is used to initialize an object with values provided by the caller.

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
 */

/*
 Q when class is load into the memory
 Ans = A class is loaded when it is first actively used by the JVM.
 
 for ex= A class is loaded when it is first actively used by the JVM, such as creating an object, accessing a static member, calling a static method, or using Class.forName()."

STATIC BLOCK

A static block is used to perform one-time initialization for the class.

It runs:

When the class is loaded into memory
Only once, no matter how many objects are created

use =Suppose your application needs to read a configuration file only once:

class Config {
    static String dbUrl;

    static {
        System.out.println("Loading configuration...");
        dbUrl = "localhost:3306";
    }
}
*/

