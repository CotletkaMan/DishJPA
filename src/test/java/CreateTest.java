import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import server.CreateDish;
import server.SelectDishLikeName;
import shared.Dish;

import static org.testng.Assert.assertEquals;

/**
 * Created by cotletkaman on 12.01.16.
 */
@ContextConfiguration("../webapp/WEB-INF/springConfig.xml")
public class CreateTest extends AbstractTestNGSpringContextTests{
    private Dish dish;

    @BeforeTest
    public void createDish(){
        dish = Cooker.createBasicDish();
    }

    @Test
    public void createDishTest() {
        new CreateDish().setDish(dish).perform();
        Dish jpaDish = new SelectDishLikeName().setName("Tasty").perform();
        assertEquals(jpaDish , dish);
    }
}
