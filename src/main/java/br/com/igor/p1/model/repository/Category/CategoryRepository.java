package br.com.igor.p1.model.repository.Category;

import br.com.igor.p1.model.entity.Category;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class CategoryRepository {

    private JdbcTemplate jdbcTemplate;

    public CategoryRepository(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public ArrayList<Category> searchCategory(Integer id, String image_url, String name, String description) throws Exception {
        String sql = "SELECT * FROM categoria";
        ArrayList<Category> query = (ArrayList<Category>) jdbcTemplate.query(
            sql,
            new Object[]{id, image_url, name, description},
            new CategoryMapper()
        );

        if(query.size() > 0) {
            return (ArrayList<Category>) jdbcTemplate.query(sql, new Object[]{id, image_url, name, description}, new CategoryMapper());
        }

        throw new Exception("Category not found");
    }

    public Category insert(Category category) throws Exception {
        String sql = "INSERT INTO category(image_url, name, description) VALUES (?, ?, ?)";
        int insert = jdbcTemplate.update(
            sql,
            category.getId(),
            category.getImage_url(),
            category.getName(),
            category.getDescription()
        );

        if(insert == 1) {
            return category;
        }

        throw new Exception("Category not found");
    }

    public ArrayList<Category> searchById(Integer id) throws Exception {
        String sql = "SELECT * FROM category WHERE id = ?";
        ArrayList<Category> search = (ArrayList<Category>) jdbcTemplate.query(sql, new CategoryMapper(), id);

        if (search.size() > 0) {
            return (ArrayList<Category>) jdbcTemplate.query(sql, new Object[]{id}, new CategoryMapper());
        }

        throw new Exception("No categories found with this id");
    }

}
