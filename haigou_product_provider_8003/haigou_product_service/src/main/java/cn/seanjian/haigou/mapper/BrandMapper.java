package cn.seanjian.haigou.mapper;

import cn.seanjian.haigou.domain.Brand;
import cn.seanjian.haigou.query.BrandQuery;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author SeanJian
 * @since 2019-03-30
 */
public interface BrandMapper extends BaseMapper<Brand> {

    long QueryCount(BrandQuery query);

    List<Brand> queryPageList(BrandQuery query);
}
