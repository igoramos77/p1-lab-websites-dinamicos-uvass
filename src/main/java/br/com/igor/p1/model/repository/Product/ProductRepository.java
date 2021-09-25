package br.com.igor.p1.model.repository.Product;

import br.com.igor.p1.model.entity.Category;
import br.com.igor.p1.model.entity.Product;
import br.com.igor.p1.model.repository.Category.CategoryMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public ArrayList<Product> search(Integer id) throws Exception {
        String sql = "SELECT * FROM product WHERE id = ?";
        ArrayList<Product> search = (ArrayList<Product>) jdbcTemplate.query(sql, new ProductMapper(), id);

        if (search.size() > 0) {
            return (ArrayList<Product>) jdbcTemplate.query(sql, new Object[]{id}, new ProductMapper());
        }
        throw new Exception("Product id not found.");
    }

    public ArrayList<Product> searchFilteredProduct(String name, Float minValue, Float maxValue) throws Exception {
        String sql = "SELECT * FROM product WHERE name LIKE ? AND unity_value >= ? AND unity_value <= ?";
        ArrayList<Product> search = (ArrayList<Product>) jdbcTemplate.query(sql, new ProductMapper(), "%"+name+"%", minValue, maxValue);

        if(search.size() > 0) {
            return (ArrayList<Product>) jdbcTemplate.query(sql, new Object[]{name, minValue, maxValue}, new ProductMapper());
        }

        throw new Exception("Product not found.");
    }

    public Product insert(Product product) throws Exception {
        String sql = "INSERT INTO product(name, description, image_url, created_at, update_at, unity_value) VALUES (?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(
                sql,
                product.getName(),
                product.getDescription(),
                product.getImage_url(),
                product.getCreated_at(),
                product.getUpdate_at(),
                product.getUnity_value()
        );

        if(insert == 1) {
            Integer lastId = jdbcTemplate.queryForObject("select max(id) from product", Integer.class);

            for(Category category: product.getCategoryList()) {
                jdbcTemplate.update("INSERT INTO productcategory(product_id, category_id) VALUES (?, ?)",
                    lastId,
                    category.getId()
                );
            }

            List<Category> categoryList = jdbcTemplate.query(
            "SELECT c.* FROM category c, product p, productCategory pc " +
                "WHERE p.id = pc.product_id AND " +
                "c.id = pc.category_id AND " +
                "product_id = ?",
                new CategoryMapper(),
                lastId
            );

            product.setId(lastId);
            product.setCategoryList(categoryList);

            return product;
        }

        throw new Exception("Product not inserted.");
    }

}

