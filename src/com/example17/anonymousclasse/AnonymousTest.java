package com.example17.anonymousclasse;

public class AnonymousTest {
    public static void main(String[] args) {
        getAnonymous();
    }
    private static void getAnonymous() {
        Student s1 = new Student("BO");
        s1.setLearnable(new Learnable() {
            @Override
            public void read() {
                System.out.println("我要按自己的方式阅读");
            }
        });
        System.out.println(s1.getLearnable());
        s1.getLearnable().read();

        Student s2 = new Student("SUN");
        s2.setLearnable(new Learnable() {
            @Override
            public void read() {
                int number = 10;
                System.out.println("我要读" + number + "本书");
            }
        });
        System.out.println(s2.getLearnable());
        s2.getLearnable().read();
    }
}
