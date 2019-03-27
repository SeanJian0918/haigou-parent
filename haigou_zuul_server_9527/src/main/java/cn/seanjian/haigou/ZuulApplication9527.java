package cn.seanjian.haigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Sean Jian
 * @Description: cn.seanjian.haigou
 * @Date: 2019/3/26 17:51
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy //路由网关的代理
public class ZuulApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication9527.class);
    }
}
