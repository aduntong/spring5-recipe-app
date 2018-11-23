package guru.springframework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring5RecipeAppApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test void test2(){
		assertTrue(true);
	}
}
