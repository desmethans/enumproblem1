package enumproblem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) 
@ContextConfiguration("classpath:application.xml")
public class BeanTest {
	@Autowired
	MyBean myBean;
	@Test
	public void test() {
		
	}
}
