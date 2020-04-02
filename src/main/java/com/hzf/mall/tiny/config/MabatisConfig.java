package com.hzf.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author：010980380
 * @date:2020-4-2
 * @verison:1.0.0
 * @description：
 */
@Configuration
@MapperScan("com.macro.mall.tiny.mbg.mapper")
public class MabatisConfig {
}
