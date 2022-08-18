package com.nackwon.sb.sbstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @SpringBootAppication
 * Spring Boot 설정 및 Bean 읽기 쓰기가 자동으로 설정
 */
@SpringBootApplication
@EnableJpaAuditing
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

/**
 * run() : 내부 WAS 를 통해 애플리케이션을 실행 시킬 수 있음.
 */
