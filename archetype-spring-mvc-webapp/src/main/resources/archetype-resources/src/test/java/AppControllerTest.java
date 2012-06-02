package ${package};

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.Model;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class AppControllerTest {
	AppController instance;

	@Before
	public void setUp() {
		instance = new AppController();
	}

	@Test
	public void testGetRoot() throws Exception {
		Model model = mock(Model.class);
		String result = instance.getRoot(model);
		assertEquals("index", result);
	}
}