package kr.hs.study.beans;

public class Owner {
    String name;
    String addr;

    public Owner(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public void onData() {
        System.out.println("name : " + name);
        System.out.println("addr : " + addr);
    }
}