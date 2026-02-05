package Lec11_Encapsulation.JavaAccessModifier.test2;

import test1.AccessModifier1;

public class AccessModifier2 extends
        AccessModifier1 {
    // Can not access default private members

    @Override
    public void display() {
        AccessModifier1 object = new AccessModifier1();
        System.out.println(object.pvt); //error
        System.out.println(object.df); //error
        System.out.println(pro);
        System.out.println(object.pb);
    }
}
