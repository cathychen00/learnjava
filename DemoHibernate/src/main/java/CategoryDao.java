import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 陈敬 on 2017/6/6.
 */
public class CategoryDao {
    private SessionFactory sessionFactory;

    public CategoryDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional
    public void save(Category category) {
        currentSession().save(category);
    }

    @Transactional
    public void update(Category category){
        currentSession().update(category);
    }

    @Transactional
    public void delete(int id) {
        Query query = currentSession().createSQLQuery("DELETE FROM category WHERE Id=::ID");
        query.setInteger("::ID", id);
        query.executeUpdate();
    }

    @Transactional
    public int count() {
        return getAll().size();
    }

    @Transactional
    public Category getById(int id) {
        Criteria criteria=currentSession().createCriteria(Category.class);
        criteria.add(Restrictions.eq("id",id));
        return (Category) criteria.uniqueResult();
    }

    @Transactional
    public List<Category> getAll() {
        return currentSession().createCriteria(Category.class).list();
    }
}
