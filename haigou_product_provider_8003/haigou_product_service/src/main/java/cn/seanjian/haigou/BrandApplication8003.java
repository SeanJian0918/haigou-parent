package cn.seanjian.haigou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: Sean Jian
 * @Description: cn.seanjian.haigou
 * @Date: 2019/3/30 22:52
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.seanjian.haigou.mapper")
public class BrandApplication8003 {
    public static void main(String[] args) {
        SpringApplication.run(BrandApplication8003.class);
    }
}
