package B;

public class A extends com.company.A {

    public void hello()
    {
        int a = this.a;
    }
}

class b
{
    com.company.A aa = new com.company.A();
    public void hello()
    {
        int a = aa.getA();
    }

}


