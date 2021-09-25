package br.com.igor.p1.controller;

import br.com.igor.p1.model.entity.Category;
import br.com.igor.p1.model.entity.Product;
import br.com.igor.p1.model.repository.Product.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(JdbcTemplate jdbcTemplate) {
        productRepository = new ProductRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Product insert(@RequestBody Product product) throws Exception {
        return productRepository.insert(product);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public ArrayList<Product> searchProduct(@RequestParam String name, @RequestParam Float minValue, @RequestParam Float maxValue) throws Exception {
        return productRepository.searchFilteredProduct(name, minValue, maxValue);
    }
}

