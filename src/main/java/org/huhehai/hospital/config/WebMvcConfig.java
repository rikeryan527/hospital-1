package org.huhehai.hospital.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // 设置允许跨域的源，这里替换为你的前端地址
                .allowedOrigins("http://10.3.112.10:8080")
                // 设置允许的请求方法，添加你后端接口支持的常见请求方法
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                // 设置允许的请求头，这里用*表示允许所有请求头，你也可以按需指定具体的请求头
                .allowedHeaders("*")
                // 设置是否允许跨域请求携带凭证，比如Cookie等，根据实际需求决定
                .allowCredentials(true);
    }
}