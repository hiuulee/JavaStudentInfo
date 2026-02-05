package Lec11_Encapsulation.JavaAccessModifier.test1;

public class AccessModifier2 extends
        AccessModifier1 {

    @Override
    public void display() {

        // System.out.println(pvt);//ko truy cập đc
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
