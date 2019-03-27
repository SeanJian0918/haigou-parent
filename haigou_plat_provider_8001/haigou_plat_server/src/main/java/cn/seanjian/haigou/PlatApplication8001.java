package cn.seanjian.haigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: Sean Jian
 * @Description: cn.seanjian.haigou
 * @Date: 2019/3/26 17:34
 */
@SpringBootApplication
@EnableEurekaClient
public class PlatApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatApplication8001.class);
    }
}
