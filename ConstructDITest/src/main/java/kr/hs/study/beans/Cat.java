package kr.hs.study.beans;

public class Cat implements Animal {
    private Owner owner;
    private String color;
    private int leg;

    @Override
    public void eat() {
        System.out.println("고양이가 먹다.");
    }
    @Override
    public void go() {
        System.out.println("고양이가 걷다.");
    }

    public Cat(String color, int leg, Owner owner) {
        this.color = color;
        this.leg = leg;
        this.owner = owner;
    }

    public void catData() {
        System.out.println("color : " + color);
        System.out.println("leg : " + leg);
        System.out.println("Owner : " + owner);
        owner.onData();
    }
}
