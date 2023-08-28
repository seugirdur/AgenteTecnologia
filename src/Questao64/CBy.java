package Questao64;

public class CBy extends CAx {
    protected int a;
    public CBy() {
        a+=3;
        b+=3;
    }
    public int op2(int x) {
        System.out.println("x é " + x);
        System.out.println("a é " + a);
        return x-a;
    }
    public static int op3(int x) {
        System.out.println("x é " + x);
        return x*3;
    }


}
