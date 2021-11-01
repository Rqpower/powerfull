package com.example.market.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class AutoBrower {
    //    @EventListener({ApplicationReadyEvent.class})
//    void applicationReadyEvent() {
//        System.out.println("应用已经准备就绪 ... 启动浏览器");
//        // 这里需要注url:端口号+测试类方法名
//        String url = "http://localhost:8080/toshow";
//        Runtime runtime = Runtime.getRuntime();
//        try {
//            runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//JSON格式 全局日期转换器配置
//    @Bean
//    public MappingJackson2HttpMessageConverter getMappingJackson2HttpMessageConverter() {
//        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
//        //设置日期格式
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setDateFormat(StringToDateConvertor.instance);
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        mappingJackson2HttpMessageConverter.setObjectMapper(objectMapper);
//        //设置中文编码格式
//        List<MediaType> list = new ArrayList<MediaType>();
//        list.add(MediaType.APPLICATION_JSON_UTF8);
//        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(list);
//        return mappingJackson2HttpMessageConverter;
//    }

    //表单格式 全局日期转换器
    @Bean
    @Autowired
    public ConversionService getConversionService(StringToDateConvertor stringToDateConvertor){
        ConversionServiceFactoryBean factoryBean = new ConversionServiceFactoryBean();
        Set<Converter> converters = new HashSet<>();
        converters.add(stringToDateConvertor);
        factoryBean.setConverters(converters);
        return factoryBean.getObject();
    }
}