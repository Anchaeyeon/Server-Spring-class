package kr.hs.study.beans;

public class Dog implements Animal {
    private Owner owner;
    private String color;
    private int leg;

    @Override
    public void eat() {
        System.out.println("강아지가 먹다.");
    }
    @Override
    public void go() {
        System.out.println("강아지가 걷다.");
    }

    public Dog(String color, int leg, Owner owner) {
        this.color = color;
        this.leg = leg;
        this.owner = owner;
    }

    public void dogData() {
        System.out.println("color : " + color);
        System.out.println("leg : " + leg);
        owner.onData();
    }
}