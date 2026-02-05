package Lec11_Encapsulation.FinalKeyword.FinalClass;

final class Bike {

    void run() {
        System.out.println("running");
    }
}

class Honda extends Bike { // ❌ Compile Time Error

    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.run();
    }
}
