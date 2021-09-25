package br.com.igor.p1.model.repository.Product;

import br.com.igor.p1.model.entity.Category;
import br.com.igor.p1.model.entity.Product;
import br.com.igor.p1.model.repository.Category.CategoryMapper;
import org.springframework.data.relational.core.sql.In;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public ArrayList<Product> searchFilteredProduct(String name, Float minValue, Float maxValue) throws Exception {
        String sql = "SELECT * FROM product WHERE name LIKE ? AND unity_value >= ? AND unity_value <= ?";
        ArrayList<Product> search = (ArrayList<Product>) jdbcTemplate.query(sql, new ProductMapper(), "%" + name + "%", minValue, maxValue);

        if(search.size() > 0) {
            return (ArrayList<Product>) jdbcTemplate.query(sql, new Object[]{name, minValue, maxValue}, new ProductMapper());
        }

        throw new Exception("Product not found.");
    }

    public Product insert(Product product) throws Exception {
        String sql = "INSERT INTO product(id, name, description, image_url, created_at, update_at, unity_value) VALUES (?, ?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(
                sql,
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getImage_url(),
                product.getCreated_at(),
                product.getUpdate_at(),
                product.getUnity_value()
        );

        if(insert == 1) {
            for(Category category: product.getCategoryList()) {
                jdbcTemplate.update("INSERT INTO productcategory(id, product_id, category_id) VALUES (?, ?, ?)",
                    3,
                    product.getId(),
                    category.getId()
                );
            }

            List<Category> categoryList = jdbcTemplate.query(
            "SELECT c.* FROM category c, product p, productCategory pc " +
                "WHERE p.id = pc.product_id AND " +
                "c.id = pc.category_id AND " +
                "product_id = ?",
                new CategoryMapper(),
                product.getId()
            );

            product.setCategoryList(categoryList);

            return product;
        }

        throw new Exception("Product not inserted.");
    }

}

