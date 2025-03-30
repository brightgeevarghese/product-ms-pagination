package com.bright.pms.service.impl;

import com.bright.pms.dto.request.ProductRequestDto;
import com.bright.pms.dto.response.ProductResponseDto;
import com.bright.pms.model.Product;
import com.bright.pms.repository.ProductRepository;
import com.bright.pms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Optional<ProductResponseDto> createProduct(ProductRequestDto dto) {
        Product product = new Product(dto.name(), dto.price());
        Product savedProduct = productRepository.save(product);
        ProductResponseDto productResponseDto = new ProductResponseDto(savedProduct.getName(), savedProduct.getPrice());
        return Optional.of(productResponseDto);
    }

    @Override
    public List<ProductResponseDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product -> new ProductResponseDto(product.getName(), product.getPrice()))
                .toList();
    }

    @Override
    public Optional<ProductResponseDto> getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return Optional.of(new ProductResponseDto(product.get().getName(), product.get().getPrice()));
        }
        return Optional.empty();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<ProductResponseDto> searchProducts(int pageNo, int pageSize, String sortBy, String sortDirection) {

//        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
//        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        PageRequest pageRequest = PageRequest.of(
                pageNo,  //Specifies which page of data to retrieve
                pageSize,//Specifies how many items should be on that page.
                Sort.Direction.fromString(sortDirection),// Specifies whether the data should be sorted in ascending or descending order
                sortBy  //Specifies the field or property to sort by
        );
        Page<Product> products = productRepository.findAll(pageRequest.next());
        return products.map(product -> new ProductResponseDto(product.getName(), product.getPrice()));
    }
}
