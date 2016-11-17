import com.yinrong.redis.RedisClientTemplate;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by yinrong on 2016/11/14.
 */
public class RedisTest {
    @Ignore
    @Test
    public void testSet(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:/config/applicationContext.xml");
        RedisClientTemplate redisClient = (RedisClientTemplate)applicationContext.getBean("redisClientTemplate");
        redisClient.set("a", "abc");
        System.out.println(redisClient.get("a"));

    }
}
