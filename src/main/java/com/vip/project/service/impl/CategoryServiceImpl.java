package com.vip.project.service.impl;

import com.vip.project.domain.vo.CategoryVo;
import com.vip.project.mapper.ICategoryMapper;
import com.vip.project.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@Service("CategoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Resource
    ICategoryMapper categoryMapper;

    @Override
    public List<CategoryVo> AllCate() {
        List<CategoryVo> cate = categoryMapper.findAllCate();
            return cate;
    }
}
