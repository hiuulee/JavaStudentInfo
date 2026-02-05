package Lec11_Encapsulation.JavaAccessModifier.test1;

public class AccessModifier4 {
// Can not access private members
    public void display() {
        AccessModifier1 object = new AccessModifier();
        System.out.println(object.pvt);
        System.out.println(object.df);
        System.out.println(object.pro);
        System.out.println(object.pbl);
    }
}
