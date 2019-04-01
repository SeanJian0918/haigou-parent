package cn.seanjian.haigou.service.impl;

import cn.seanjian.haigou.query.BrandQuery;
import cn.seanjian.haigou.service.IBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: Sean Jian
 * @Description: cn.seanjian.haigou.service.impl
 * @Date: 2019/3/30 23:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandServiceImplTest {
    @Autowired
    private IBrandService service;

    @Test
    public void selectList() {
        System.out.println(service.selectList(null));
    }

    @Test
    public void selectPage() {
        System.out.println(service.selectPageList(new BrandQuery()));
    }

    @Test
    public void testcount()throws Exception{

    }
}