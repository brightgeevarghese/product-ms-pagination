package com.bright.pms.service;

import com.bright.pms.dto.request.ProductRequestDto;
import com.bright.pms.dto.response.ProductResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<ProductResponseDto> createProduct(ProductRequestDto dto);
    List<ProductResponseDto> getAllProducts();
    Optional<ProductResponseDto> getProductById(Long id);
    void deleteProduct(Long id);
    Page<ProductResponseDto> searchProducts(int pageNo, int pageSize, String sortBy, String sortDirection);
}
