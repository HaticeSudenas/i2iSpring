package com.i2iSystems.SpringClientServer.Configuariton;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // İzin verilecek URL kalıpları burada belirtilir
                .allowedOrigins("http://localhost:63342") // İzin verilen kaynak (origin)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // İzin verilen HTTP metodları
                .allowedHeaders("*"); // İzin verilen istemci başlıkları
    } // Max age (saniye cinsinden), tarayıcı tarafından yapılan "preflight" isteklerinin önbellekte tutulma süresi
}
