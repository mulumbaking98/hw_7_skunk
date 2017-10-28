import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 */

/**
 * @author maya5348
 *
 */
public class SkunkAppTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void test() {
		fail("My first failure");
	}
	
	@Test
	public void new_dice_can_be_created(){
		Dice d = new Dice();
		assertTrue("??", d!=null);
	}
	
	@Test
	public void new_dice_will_roll_double_skunk_(){
		Dice d = new Dice(new int[] {1}, new int[] {1});
		d.roll();
		assertEquals("first die is not 1",1, d.getDie1Roll());
		assertEquals("first die is not 2",2, d.getDie2Roll());
		
		
	}
	
	

}
