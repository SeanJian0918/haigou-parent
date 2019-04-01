package cn.seanjian.haigou.service.impl;

import cn.seanjian.haigou.domain.Product;
import cn.seanjian.haigou.mapper.ProductMapper;
import cn.seanjian.haigou.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author SeanJian
 * @since 2019-03-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
