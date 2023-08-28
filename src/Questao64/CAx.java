package Questao64;

public class CAx {
    protected int a;
    protected int b;
    public CAx() {
        a*=2;
        b*=3;
    }
    {
        a=1;
        b=2;
    }
    public int op1(int x) {
        System.out.println("x é " + x);
        return op2(x)+op3(x)+b;
    }
    public int op2(int x) {
        System.out.println("x é " + x);
        System.out.println("a é " + a);
        return x+a;
    }
    public static int op3(int x) {
        System.out.println("x é " + x);
        return x*2;
    }
}
