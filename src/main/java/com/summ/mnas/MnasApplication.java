package com.summ.mnas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.summ.mnas.mapper")
public class MnasApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MnasApplication.class, args);
    }

}
