package br.com.igor.p1.model.repository.Category;

import br.com.igor.p1.model.entity.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet resultSet, int i) throws SQLException {
        Category category = new Category();
        category.setId(resultSet.getInt("id"));
        category.setImage_url(resultSet.getString("image_url"));
        category.setName(resultSet.getString("name"));
        category.setDescription(resultSet.getString("description"));

        return category;
    }
}
