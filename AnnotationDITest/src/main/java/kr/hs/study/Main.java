package kr.hs.study;

import kr.hs.study.beans.Member;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config_annotation.xml");

        Member m = ctx.getBean("m1", Member.class);
        System.out.print(m.getName() + ", ");
        System.out.print(m.getNickName() + ", ");
        System.out.print(m.getAddr() + ", ");
        System.out.print(m.getHobby().getHobby_name());

        ctx.close();
    }
}