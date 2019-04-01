package cn.seanjian.haigou.service;

import cn.seanjian.haigou.domain.Brand;
import cn.seanjian.haigou.query.BrandQuery;
import cn.seanjian.haigou.util.PageList;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author SeanJian
 * @since 2019-03-30
 */
public interface IBrandService extends IService<Brand> {

    PageList<Brand> selectPageList(BrandQuery query);
}
