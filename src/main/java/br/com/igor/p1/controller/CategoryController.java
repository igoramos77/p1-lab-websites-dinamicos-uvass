package br.com.igor.p1.controller;

import br.com.igor.p1.model.entity.Category;
import br.com.igor.p1.model.repository.Category.CategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ArrayList<Category> searchById(@PathVariable Integer id) throws Exception {
        return categoryRepository.searchById(id);
    }
}