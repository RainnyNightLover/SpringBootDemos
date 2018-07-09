


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xihuanyuye.run.Application;
import com.xihuanyuye.utils.CacheUtils;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BaseTest {

    @Test
    public void test() throws Exception {

        CacheUtils.hashSet("test", "xihuanyuye", "www.xihuanyuye.com");

        System.out.println(CacheUtils.hashGet("test", "xihuanyuye"));
    }

}
