package cn.seanjian.haigou.service.impl;

import cn.seanjian.haigou.domain.ProductType;
import cn.seanjian.haigou.mapper.ProductTypeMapper;
import cn.seanjian.haigou.service.IProductTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author SeanJian
 * @since 2019-03-31
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {
    @Autowired
    private ProductTypeMapper mapper;
    @Override
    public List<ProductType> treeData() {
        //查询所有的类型
        List<ProductType> productTypes = mapper.selectList(null);
        //将每一个对象存在map中
        Map<Long,ProductType> map = new HashMap();
        //遍历所有的对象
        for (ProductType productType : productTypes) {
            map.put(productType.getId(),productType);
        }
        List<ProductType> list = new ArrayList<>();
        //遍历所以有的对象 添加到list中
        for (ProductType productType : productTypes) {
            //判断如果是顶级父类就添加到list
            if (productType.getPid() == 0) {
                list.add(productType);
            } else {
//                获取到父类
                ProductType parent = map.get(productType.getPid());
                //将对象添加到父对象中
                parent.getChildren().add(productType);
            }
        }

        return list;
    }
}
