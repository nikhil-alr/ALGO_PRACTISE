package com.company;

public class A {

    protected int a = 10;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class B
{
    A aa = new A();

    public void hello()
    {
        int a = aa.a;
    }
}
