package UnitTests;


import org.junit.*;


import GeneticAlgorithm.Operators.CrossOver;
import junit.framework.Assert;

public class CrossOverJUnit {
	
	
	private CrossOver crossOver;
	
	@Before
	public void before()
	{
		crossOver = new CrossOver();
	}
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		Assert.assertEquals(crossOver.crossOver(),true);
		Assert.assertTrue(crossOver.check_duplications());
	}

}
