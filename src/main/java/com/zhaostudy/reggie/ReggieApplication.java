package com.zhaostudy.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @author coder_hook丶
 * @date 2022/12/6
 * @project com.zhaostudy.reggie
 * @description http:www.cnblogs.com/zhaostudy
 */

@Slf4j
@ServletComponentScan
@EnableTransactionManagement
@SpringBootApplication
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
        log.info("ReggieApplication项目启动成功...");
    }
}
