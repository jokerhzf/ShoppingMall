package com.hzf.mall.tiny.controller;

import com.hzf.mall.tiny.mbg.model.PmsBrand;
import com.hzf.mall.tiny.service.PmsBrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author：010980380
 * @date:2020-4-2
 * @verison:1.0.0
 * @description：品牌管理Controller
 */

@Controller
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService demoService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrand.class);

}
