package com.bright.pms;

import com.bright.pms.dto.request.ProductRequestDto;
import com.bright.pms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@RequiredArgsConstructor
public class PmsApplication {

    private final ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(PmsApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            ProductRequestDto productRequestDto = new ProductRequestDto("p1", new BigDecimal(10));
            ProductRequestDto productRequestDto1 = new ProductRequestDto("p2", new BigDecimal(20));
            ProductRequestDto productRequestDto2 = new ProductRequestDto("p3", new BigDecimal(30));
            ProductRequestDto productRequestDto3 = new ProductRequestDto("p4", new BigDecimal(40));
            ProductRequestDto productRequestDto4 = new ProductRequestDto("p5", new BigDecimal(50));
            ProductRequestDto productRequestDto5 = new ProductRequestDto("p6", new BigDecimal(60));
            ProductRequestDto productRequestDto6 = new ProductRequestDto("p7", new BigDecimal(70));
            ProductRequestDto productRequestDto7 = new ProductRequestDto("p8", new BigDecimal(80));
            ProductRequestDto productRequestDto8 = new ProductRequestDto("p9", new BigDecimal(90));
            ProductRequestDto productRequestDto9 = new ProductRequestDto("p10", new BigDecimal(90));
            ProductRequestDto productRequestDto10 = new ProductRequestDto("p11", new BigDecimal(90));
            ProductRequestDto productRequestDto11 = new ProductRequestDto("p12", new BigDecimal(90));
            ProductRequestDto productRequestDto12 = new ProductRequestDto("p13", new BigDecimal(90));

            ProductRequestDto productRequestDto13 = new ProductRequestDto("p14", new BigDecimal(90));
            ProductRequestDto productRequestDto14 = new ProductRequestDto("p15", new BigDecimal(90));
            ProductRequestDto productRequestDto15 = new ProductRequestDto("p16", new BigDecimal(90));
            ProductRequestDto productRequestDto16 = new ProductRequestDto("p17", new BigDecimal(90));
            ProductRequestDto productRequestDto17 = new ProductRequestDto("p18", new BigDecimal(90));
            ProductRequestDto productRequestDto18 = new ProductRequestDto("p19", new BigDecimal(90));
            ProductRequestDto productRequestDto19 = new ProductRequestDto("p20", new BigDecimal(90));
            ProductRequestDto productRequestDto20 = new ProductRequestDto("p21", new BigDecimal(90));
            ProductRequestDto productRequestDto21 = new ProductRequestDto("p22", new BigDecimal(90));
            ProductRequestDto productRequestDto22 = new ProductRequestDto("p23", new BigDecimal(90));
            ProductRequestDto productRequestDto23 = new ProductRequestDto("p24", new BigDecimal(90));
            ProductRequestDto productRequestDto24 = new ProductRequestDto("p25", new BigDecimal(90));
            ProductRequestDto productRequestDto25 = new ProductRequestDto("p26", new BigDecimal(90));
            ProductRequestDto productRequestDto26 = new ProductRequestDto("p27", new BigDecimal(90));
            ProductRequestDto productRequestDto27 = new ProductRequestDto("p28", new BigDecimal(90));
            ProductRequestDto productRequestDto28 = new ProductRequestDto("p29", new BigDecimal(90));
            ProductRequestDto productRequestDto29 = new ProductRequestDto("p30", new BigDecimal(90));
            ProductRequestDto productRequestDto30 = new ProductRequestDto("p31", new BigDecimal(90));
            productService.createProduct(productRequestDto);
            productService.createProduct(productRequestDto1);
            productService.createProduct(productRequestDto2);
            productService.createProduct(productRequestDto3);
            productService.createProduct(productRequestDto4);
            productService.createProduct(productRequestDto5);
            productService.createProduct(productRequestDto6);
            productService.createProduct(productRequestDto7);
            productService.createProduct(productRequestDto8);
            productService.createProduct(productRequestDto9);
            productService.createProduct(productRequestDto10);
            productService.createProduct(productRequestDto11);
            productService.createProduct(productRequestDto12);

            productService.createProduct(productRequestDto13);
            productService.createProduct(productRequestDto14);
            productService.createProduct(productRequestDto15);
            productService.createProduct(productRequestDto16);
            productService.createProduct(productRequestDto17);
            productService.createProduct(productRequestDto18);
            productService.createProduct(productRequestDto19);
            productService.createProduct(productRequestDto20);
            productService.createProduct(productRequestDto21);
            productService.createProduct(productRequestDto22);
            productService.createProduct(productRequestDto23);
            productService.createProduct(productRequestDto24);
            productService.createProduct(productRequestDto25);
            productService.createProduct(productRequestDto26);
            productService.createProduct(productRequestDto27);
            productService.createProduct(productRequestDto28);
            productService.createProduct(productRequestDto29);
            productService.createProduct(productRequestDto30);
        };
    }
}
