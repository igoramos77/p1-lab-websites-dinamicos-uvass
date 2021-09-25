package br.com.igor.p1.model.repository.Product;

import br.com.igor.p1.model.entity.Product;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class ProductRepository {

    private JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public ArrayList<Product> searchFilteredProduct(String name, Float minValue, Float maxValue) throws Exception {
        String sql = "SELECT * FROM product WHERE name = ? AND unity_value >= ? AND unity_value <= ?";
        ArrayList<Product> search = (ArrayList<Product>) jdbcTemplate.query(sql, new Object[]{name, minValue, maxValue}, new ProductMapper());

        if(search.size() > 0) {
            return (ArrayList<Product>) jdbcTemplate.query(sql, new Object[]{name, minValue, maxValue}, new ProductMapper());
        }

        throw new Exception("Product not found.");
    }

    public Product insert(Product product) throws Exception {
        String sql = "INSERT INTO product(id, name, description, image_url, created_at, hour_create_at, update_at, unity_value) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(
                sql,
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getImage_url(),
                product.getCreated_at(),
                product.getHour_create_at(),
                product.getUpdate_at(),
                product.getUnity_value()
        );

        if(insert == 1) {
            return product;
        }

        throw new Exception("Product not inserted.");
    }

}

