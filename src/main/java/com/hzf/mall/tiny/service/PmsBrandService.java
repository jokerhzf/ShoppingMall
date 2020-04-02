package com.hzf.mall.tiny.service;

import com.hzf.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author：010980380
 * @date:2020-4-2
 * @verison:1.0.0
 * @description：品牌管理Service
 */

public interface PmsBrandService {
    List<PmsBrand> listAllBrand();
    int createBrand(PmsBrand pmsBrand);
    int updateBrand(Long id ,PmsBrand pmsBrand);
    int deleteBrand(Long id);
    List<PmsBrand> listBrand(int pageNum,int pageSize);
    PmsBrand getBrand(Long id);

}
