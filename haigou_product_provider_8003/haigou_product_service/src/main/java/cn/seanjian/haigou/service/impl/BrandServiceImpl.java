package cn.seanjian.haigou.service.impl;

import cn.seanjian.haigou.domain.Brand;
import cn.seanjian.haigou.mapper.BrandMapper;
import cn.seanjian.haigou.query.BrandQuery;
import cn.seanjian.haigou.service.IBrandService;
import cn.seanjian.haigou.util.BaseQuery;
import cn.seanjian.haigou.util.LetterUtil;
import cn.seanjian.haigou.util.PageList;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author SeanJian
 * @since 2019-03-30
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Override
    public PageList<Brand> selectPageList(BrandQuery query)  {
        //查出一共多少条数据
        long total = brandMapper.QueryCount(query);
        if (total == 0){
            return new PageList<>();
        }else{
            //查出对应页的数据
            List<Brand>  list = brandMapper.queryPageList(query);
//     封装成PageList
            PageList<Brand> pageList = new PageList<>(total,list);
            return pageList;
        }
    }

    @Override
    public boolean insert(Brand entity) {
        //设置创建时蹇
        entity.setCreateTime(new Date().getTime());
        //设置首字母
        entity.setFirstLetter(LetterUtil.getFirstLetter(entity.getName()).toUpperCase());
        return super.insert(entity);
    }

    @Override
    public boolean updateById(Brand entity) {
        //设置更新的时间
        entity.setUpdateTime(new Date().getTime());
        //设置首字母
        entity.setFirstLetter(LetterUtil.getFirstLetter(entity.getName()).toUpperCase());
        return super.updateById(entity);
    }
}
