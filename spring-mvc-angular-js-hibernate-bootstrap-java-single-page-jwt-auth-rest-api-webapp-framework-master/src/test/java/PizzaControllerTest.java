import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lazybakers.controller.PizzaController;
import lazybakers.model.entity.Pizza;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
        "classpath:config/spring/appContext-interceptor.xml",
        "classpath:config/spring/appContext-repository.xml",
        "classpath:config/spring/appContext-jdbc-test.xml",
        "classpath:config/spring/appContext-service.xml",
        "classpath:config/spring/appContext-servlet.xml",
        "classpath:config/spring/appContext-ywp2.xml"
})
@WebAppConfiguration
public class PizzaControllerTest {
	
	@Autowired
	PizzaController pizzaController;
	

	@Test
	public void test() {
		Pizza pizza= pizzaController.getpizzabyid(1);
		assertNotNull(pizza);
	}

}
