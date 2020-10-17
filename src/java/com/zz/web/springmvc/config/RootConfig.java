package com.zz.web.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author lidongy
 * @version 10.0
 * Created by lidongy on 2020/10/17
 */
@Configuration
@ComponentScan(basePackages = {"com.zz.web.springmvc"},
        excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
}
