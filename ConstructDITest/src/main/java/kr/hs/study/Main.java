package kr.hs.study;

import kr.hs.study.beans.Cat;
import kr.hs.study.beans.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Cat c = ctx.getBean("c1", Cat.class);
        c.catData();
        c.eat();
        c.go();

        System.out.println("-------------------------");

        Dog d = ctx.getBean("d1", Dog.class);
        d.dogData();
        d.eat();
        d.go();

        ctx.close();
    }
}