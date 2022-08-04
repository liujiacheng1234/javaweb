import com.cheng.service.impl.BlogServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void TestBlog(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlogServiceImpl blog = context.getBean("blogServiceImpl", BlogServiceImpl.class);
        System.out.println(blog.queryAllBlog());

    }
}
