package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //java
        //TestBean1의 객체 생성하고 data1, data2, data3 출력
        TestBean1 tb1 = new TestBean1();
        tb1.prData();

        System.out.println("======================");

        //spring
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        //오버로딩
        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        obj1.prData();

        TestBean1 obj2 = ctx.getBean("t1", TestBean1.class);
        obj2.prData();

        TestBean1 obj3 = ctx.getBean("t2", TestBean1.class);
        obj3.prData();

        TestBean1 obj4 = ctx.getBean("t3", TestBean1.class);
        obj4.prData();

        ctx.close();
    }
}