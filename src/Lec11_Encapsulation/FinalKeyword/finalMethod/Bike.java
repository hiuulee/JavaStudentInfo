
package Lec11_Encapsulation.FinalKeyword.finalMethod;


class Bike {
    final void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {
    void run() { // ❌ Compile Time Error
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.run();
    }
}

