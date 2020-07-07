public class MyClass {

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod();     // Call the static method

      //  myPublicMethod();

    // Create an object of MyClass
        MyClass myObj = new MyClass();
        myObj.myPublicMethod(); // Call the public method

    }

}
