package com.wax.sql;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.math.BigDecimal;

@SpringBootTest
class ParseApplicationTests {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ParseApplicationTests.class);
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        LOGGER.info("数据源:{}", dataSource);
    }

    @Test
    void testBigdecimal() {
        BigDecimal bigDecimal = new BigDecimal(10);
        BigDecimal bigDecimal2 = new BigDecimal(1);
        BigDecimal[] bigDecimals = bigDecimal.divideAndRemainder(bigDecimal2);
        System.out.println(bigDecimals[0]);
        System.out.println(bigDecimals[1]);
        if (bigDecimals[1].compareTo(new BigDecimal(0)) != 0) {
            System.out.println("不被整除");
        }
        if (bigDecimal2.compareTo(bigDecimal) < 0) {
            System.out.println(bigDecimal2 + "小于" + bigDecimal.doubleValue());
        }

    }

    @Test
    void testAnnotation() {

    }

    @Test
    void testInterface() {
        //BeanUtils.instantiateClass()
    }

}
