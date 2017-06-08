import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Set;

/**
 * Created by 陈敬 on 2017/6/8.
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class testRedis {
    @Resource
    private JedisPool jedisPool;

    @Test
    public void TestRedis() {
        Jedis jedis = jedisPool.getResource();

        String key = "a";
        jedis.set(key, "111");

        String data = jedis.get(key);

        System.out.println(data);

    }

    @Test
    public  void testList(){
        Jedis jedis=jedisPool.getResource();

        String key="articles";

        jedis.lpush(key,"文章1");
        jedis.lpush(key,"文章2");
        jedis.lpush(key,"文章3");

        List<String> articles=jedis.lrange(key,0,3);
        for(String article:articles){
            System.out.println(article);
        }
    }

    @Test
    public void testSet(){
        Jedis jedis=jedisPool.getResource();

        String key="tags";
        jedis.sadd(key,"宝马");
        jedis.sadd(key,"豪车");
        jedis.sadd(key,"SUV");
        jedis.sadd(key,"SUV");

        Set<String> tags=jedis.smembers(key);
        for(String tag:tags){
            System.out.println(tag);
        }
    }
}
