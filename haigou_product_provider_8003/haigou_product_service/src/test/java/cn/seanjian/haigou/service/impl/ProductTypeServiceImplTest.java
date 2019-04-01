package cn.seanjian.haigou.service.impl;

import cn.seanjian.haigou.service.IProductTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: Sean Jian
 * @Description: cn.seanjian.haigou.service.impl
 * @Date: 2019/3/31 14:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTypeServiceImplTest {
    @Autowired
    private IProductTypeService productTypeService;
    @Test
    public void treeData() {
        System.out.println(productTypeService.treeData());
    }

    @Test
    public void selectOne() {
        System.out.println(productTypeService.selectList(null));
    }
}