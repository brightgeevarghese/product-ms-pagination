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
            ProductRequestDto productRequestDto1 = new ProductRequestDto("Comfortable Jeans", new BigDecimal("49.50"));
            ProductRequestDto productRequestDto2 = new ProductRequestDto("Stylish Sneakers", new BigDecimal("79.95"));
            ProductRequestDto productRequestDto3 = new ProductRequestDto("Warm Winter Coat", new BigDecimal("129.00"));
            ProductRequestDto productRequestDto4 = new ProductRequestDto("Elegant Leather Bag", new BigDecimal("99.75"));
            ProductRequestDto productRequestDto5 = new ProductRequestDto("Classic Baseball Cap", new BigDecimal("15.50"));
            ProductRequestDto productRequestDto6 = new ProductRequestDto("Sporty Running Shoes", new BigDecimal("89.99"));
            ProductRequestDto productRequestDto7 = new ProductRequestDto("Cozy Knit Sweater", new BigDecimal("39.99"));
            ProductRequestDto productRequestDto8 = new ProductRequestDto("Durable Backpack", new BigDecimal("59.00"));
            ProductRequestDto productRequestDto9 = new ProductRequestDto("Smartwatch Pro", new BigDecimal("199.00"));
            ProductRequestDto productRequestDto10 = new ProductRequestDto("Wireless Headphones", new BigDecimal("149.50"));
            ProductRequestDto productRequestDto11 = new ProductRequestDto("Portable Bluetooth Speaker", new BigDecimal("69.99"));
            ProductRequestDto productRequestDto12 = new ProductRequestDto("Stainless Steel Water Bottle", new BigDecimal("22.75"));
            ProductRequestDto productRequestDto13 = new ProductRequestDto("Organic Cotton Socks (3 pairs)", new BigDecimal("18.00"));
            ProductRequestDto productRequestDto14 = new ProductRequestDto("UV Protection Sunglasses", new BigDecimal("35.00"));
            ProductRequestDto productRequestDto15 = new ProductRequestDto("Digital Kitchen Scale", new BigDecimal("29.99"));
            ProductRequestDto productRequestDto16 = new ProductRequestDto("Ceramic Coffee Mug", new BigDecimal("12.50"));
            ProductRequestDto productRequestDto17 = new ProductRequestDto("Non-Stick Frying Pan", new BigDecimal("45.00"));
            ProductRequestDto productRequestDto18 = new ProductRequestDto("Soft Throw Blanket", new BigDecimal("38.99"));
            ProductRequestDto productRequestDto19 = new ProductRequestDto("Scented Candle Set", new BigDecimal("28.50"));
            ProductRequestDto productRequestDto20 = new ProductRequestDto("Wooden Cutting Board", new BigDecimal("32.00"));
            ProductRequestDto productRequestDto21 = new ProductRequestDto("Ergonomic Office Chair", new BigDecimal("249.00"));
            ProductRequestDto productRequestDto22 = new ProductRequestDto("Adjustable Laptop Stand", new BigDecimal("42.50"));
            ProductRequestDto productRequestDto23 = new ProductRequestDto("External Hard Drive (1TB)", new BigDecimal("59.99"));
            ProductRequestDto productRequestDto24 = new ProductRequestDto("Mechanical Gaming Keyboard", new BigDecimal("119.00"));
            ProductRequestDto productRequestDto25 = new ProductRequestDto("Wireless Mouse", new BigDecimal("27.75"));
            ProductRequestDto productRequestDto26 = new ProductRequestDto("Plant-Based Protein Powder", new BigDecimal("55.00"));
            ProductRequestDto productRequestDto27 = new ProductRequestDto("Reusable Grocery Bags (set of 5)", new BigDecimal("16.99"));
            ProductRequestDto productRequestDto28 = new ProductRequestDto("Natural Beeswax Lip Balm", new BigDecimal("7.50"));
            ProductRequestDto productRequestDto29 = new ProductRequestDto("Bamboo Toothbrush (pack of 4)", new BigDecimal("10.99"));
            ProductRequestDto productRequestDto30 = new ProductRequestDto("Herbal Chamomile Tea (20 bags)", new BigDecimal("6.00"));
            ProductRequestDto productRequestDto31 = new ProductRequestDto("Gourmet Dark Chocolate Bar", new BigDecimal("4.75"));
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
