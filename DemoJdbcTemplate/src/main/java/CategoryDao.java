import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by 陈敬 on 2017/6/6.
 */
public class CategoryDao {
    private JdbcTemplate jdbcTemplate;

    public CategoryDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int add(Category category) {
        String sql = "INSERT INTO category(id,name)VALUES(?,?)";
        return jdbcTemplate.update(sql, category.getCateId(), category.getCateName());
    }

    public int update(Category category) {
        String sql = "UPDATE Category SET Name=? WHERE Id=?";
        return jdbcTemplate.update(sql, category.getCateName(), category.getCateId());
    }

    public int delete(int id) {
        String sql = "DELETE FROM Category WHERE Id=?";
        return jdbcTemplate.update(sql, id);
    }

    public int count(){
        String sql="SELECT COUNT(0) FROM Category";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    public Category getById(int id) {
        String sql = "SELECT Id,Name FROM Category WHERE Id=?";
        return jdbcTemplate.queryForObject(sql, (ResultSet rs, int rowNumber) -> {
            Category category = new Category();
            category.setCateId(rs.getInt("Id"));
            category.setCateName(rs.getString("Name"));
            return category;
        }, id);
    }

    public List<Category> getAll(){
        String sql="SELECT Id,Name FROM Category";

        List<Category> result=jdbcTemplate.query(sql, (resultSet, i) -> {
            Category category = new Category();
            category.setCateId(resultSet.getInt("Id"));
            category.setCateName(resultSet.getString("Name"));
            return category;
        });

        return result;
    }
}
