/* Rule 3 same package non sub class
*  
default protected public
*/
package Lec11_Encapsulation.JavaAccessModifier.test1;

public class AccessModifier3 {

    private int pvt = 1;
    int df = 2;            // default
    protected int pro = 3;
    public int pbl = 4;

    // Methods here can access all variables
    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
