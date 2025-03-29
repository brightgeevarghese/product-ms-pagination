package com.bright.pms.controller;

import com.bright.pms.dto.request.ProductRequestDto;
import com.bright.pms.dto.response.ProductResponseDto;
import com.bright.pms.model.Product;
import com.bright.pms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDto> createSSD(@RequestBody ProductRequestDto productRequestDto) {
        Optional<ProductResponseDto> productResponseDto = productService.createProduct(productRequestDto);
        if (productResponseDto.isPresent()) {
            return ResponseEntity.status(HttpStatus.CREATED).body(productResponseDto.get());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

//    @GetMapping
//    public ResponseEntity<List<ProductResponseDto>> getAllProducts() {
//        return ResponseEntity.ok(productService.getAllProducts());
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping
    public ResponseEntity<Page<ProductResponseDto>> getProductPage(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "ASC") String sortDirection
    ) {
        Page<ProductResponseDto> productResponseDtoPage = productService.searchProducts(pageNo, pageSize, sortBy, sortDirection);
        return ResponseEntity.ok(productResponseDtoPage);
    }
}
