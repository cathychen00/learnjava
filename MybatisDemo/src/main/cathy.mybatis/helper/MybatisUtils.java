package helper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by 陈敬 on 2017/2/20.
 */
public class MybatisUtils {
    private static final String CONFIG_PATH = "config/mybatis-config.xml";

    public static SqlSession getSqlSession() {
        SqlSession session = null;
        try {
            InputStream stream = Resources.getResourceAsStream(CONFIG_PATH);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                    .build(stream);
            session = factory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return session;
    }

    public static void closeSession(SqlSession session) {
        session.close();
    }
}
