package com.hzf.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.hzf.mall.tiny.mbg.mapper.PmsBrandMapper;
import com.hzf.mall.tiny.mbg.model.PmsBrand;
import com.hzf.mall.tiny.mbg.model.PmsBrandExample;
import com.hzf.mall.tiny.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author：010980380
 * @date:2020-4-2
 * @verison:1.0.0
 * @description：
 */

public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand pmsBrand) {
        return brandMapper.insertSelective(pmsBrand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand pmsBrand) {
        pmsBrand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
