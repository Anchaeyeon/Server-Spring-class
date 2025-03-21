package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("t2")
public class TestBean2 {
    @Autowired
    private DataBean2 data1;

    public DataBean2 getData1() {
        return data1;
    }
}
