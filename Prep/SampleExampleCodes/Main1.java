package DSA.Prep.SampleExampleCodes;

// Abstract class representing a bank
abstract class Bank {
    abstract void withdraw(double amount); // abstract method
    void checkBalance() {
        System.out.println("Checking balance...");
    }
}

// Concrete class for SBI Bank
class SBI extends Bank {
    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawing ₹" + amount + " from SBI account.");
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {
        Bank myBank = new SBI();  // Abstraction in action
        myBank.checkBalance();   // Calling concrete method
        myBank.withdraw(2000);   // Calling abstract method implementation
    }
}

