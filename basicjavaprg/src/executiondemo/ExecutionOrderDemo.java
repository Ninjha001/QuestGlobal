package executiondemo;

public class ExecutionOrderDemo {
    
    // Static variable
    static String staticVariable;

    // Static block
    static {
        staticVariable = "Static Variable Value";
        System.out.println("Static block executed.");
        System.out.println("Static variable initialized to: " + staticVariable);
    }

    // Instance variable
    String instanceVariable;

    // Instance initialization block
    {
        instanceVariable = "Instance Variable Value";
        System.out.println("Instance initialization block executed.");
        System.out.println("Instance variable initialized to: " + instanceVariable);
    }

    // Constructor
    public ExecutionOrderDemo() {
        System.out.println("Constructor executed.");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method executed.");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method executed.");
    }

    // Main method to test the flow of execution
    public static void main(String[] args) {
        System.out.println("Main method started.");
        
        // Call the static method
        staticMethod();
        
        // Create an instance of the class
        ExecutionOrderDemo demo = new ExecutionOrderDemo();
        
        // Call the instance method
        demo.instanceMethod();
        
        System.out.println("Main method ended.");
    }
}
