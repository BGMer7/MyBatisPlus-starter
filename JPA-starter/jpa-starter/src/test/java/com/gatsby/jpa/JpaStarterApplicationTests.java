package com.gatsby.jpa;

import com.gatsby.jpa.constant.DeptInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaStarterApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testEnum() {
        System.out.println(DeptInfo.FINANCE.getCode());
    }
}
