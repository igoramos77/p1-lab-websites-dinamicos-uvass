package br.com.igor.p1.model.repository.Product;

import br.com.igor.p1.model.entity.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setName(resultSet.getString("name"));
        product.setDescription(resultSet.getString("description"));
        product.setImage_url(resultSet.getString("image_url"));
        product.setCreated_at(resultSet.getDate("created_at").toLocalDate());
        product.setUpdate_at(resultSet.getTimestamp("update_at"));
        product.setUnity_value(resultSet.getFloat("unity_value"));

        return product;
    }
}
