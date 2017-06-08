package demoJPA.dao;

import demoJPA.entity.Category;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by 陈敬 on 2017/6/7.
 */
public interface CategoryDao extends Repository<Category, Integer> {
    void save(Category category);

    Category findOne(int id);

    Iterable<Category> findAll();

    long count();

    void delete(int id);
}
