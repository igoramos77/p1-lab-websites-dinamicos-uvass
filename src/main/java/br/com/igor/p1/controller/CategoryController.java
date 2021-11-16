package br.com.igor.p1.controller;

import br.com.igor.p1.model.entity.Category;
import br.com.igor.p1.model.entity.Product;
import br.com.igor.p1.model.repository.Category.CategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryRepository categoryRepository;

    public CategoryController(JdbcTemplate jdbcTemplate) {
        categoryRepository = new CategoryRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Category insert(@RequestBody Category category) throws Exception {
        return categoryRepository.insert(category);
    }

    @CrossOrigin("*")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/")
    public ArrayList<Category> searchAll() throws Exception {
        return categoryRepository.searchAll();
    }

    @CrossOrigin("*")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ArrayList<Category> searchById(@PathVariable Integer id) throws Exception {
        return categoryRepository.searchById(id);
    }

    @CrossOrigin("*")
    @GetMapping("/{id}/product")
    public List<Product> searchProductsForCategory(@PathVariable int id, @RequestParam(required = false) String name, Float minValue, Float maxValue) {
        return categoryRepository.searchProductsForCategory(id, name, minValue, maxValue);
    }

    @CrossOrigin("*")
    @GetMapping("/{slug}/products")
    public List<Product> searchProductsForSlug(@PathVariable String slug) {
        return categoryRepository.searchProductsForSlug(slug);
    }
}