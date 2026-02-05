package Lec11_Encapsulation.StaticMethod;

public class Processor {
    int number = 40; // non-static

    public static void main(String[] args) {
        System.out.println(number); // ❌ Compile Time Error
    }
}
