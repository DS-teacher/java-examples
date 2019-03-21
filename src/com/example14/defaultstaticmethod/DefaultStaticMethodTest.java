package com.example14.defaultstaticmethod;

public class DefaultStaticMethodTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("-------default method --------");
        getDefaultMethod();
        System.out.println("-------static method in interface --------");
        getStaticMethod();
    }

    private static void getDefaultMethod() {
        Learnable under = new Undergraduate();
        under.study();
        Learnable post = new Postgraduate();
        post.study();

    }

    private static void getStaticMethod() {
        System.out.println(Learnable.getLeftTime(12));
    }
}
