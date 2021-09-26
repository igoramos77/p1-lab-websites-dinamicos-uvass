package br.com.igor.p1.model.repository.Category;

import br.com.igor.p1.model.entity.Category;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

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

    public List<Category> searchProductsForCategory(Integer id, String name, Float minValue, Float maxValue) {
        if (name == null && minValue == null && maxValue == null) {
            return jdbcTemplate.query(
                "select p.*, pc.category_id FROM product p " +
                "INNER JOIN productCategory pc ON pc.product_id = p.id " +
                "WHERE pc.category_id = ?",
                new CategoryMapper(),
                id
            );
        }

        if (name != null && minValue == null && maxValue == null) {
            return jdbcTemplate.query(
            "select p.* FROM product p " +
                "INNER JOIN productCategory pc ON pc.product_id = p.id " +
                "WHERE pc.category_id = ? AND p.name = ?",
                new CategoryMapper(),
                id,
                name
            );
        }

        if (name == null && minValue != null && maxValue != null) {
            return jdbcTemplate.query(
            "select p.*, pc.category_id FROM product p " +
                "INNER JOIN productCategory pc ON pc.product_id = p.id " +
                "WHERE pc.category_id = ? " +
                "AND p.unity_value >= ? " +
                "AND p.unity_value <= ?",
                new CategoryMapper(),
                id,
                minValue,
                maxValue
            );
        }

        return jdbcTemplate.query(
        "select p.*, pc.category_id FROM product p " +
            "INNER JOIN productCategory pc ON pc.product_id = p.id " +
            "WHERE pc.category_id = ? " +
            "AND p.name LIKE ? " +
            "AND p.unity_value >= ? " +
            "AND p.unity_value <= ?",
            new CategoryMapper(),
            id,
            name,
            minValue,
            maxValue
        );
    }

}
