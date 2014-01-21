package objectstructures;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;

/**
 * 
 * @author Alexander H�st, Ind�k, Undass TDT4100/TDT4102, Spring 2009
 * 
 */

public class PartnerTest extends TestCase {

	private Partner partner1, partner2, partner3, partner4;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		partner1 = new Partner("1");
		partner2 = new Partner("2");
		partner3 = new Partner("3");
		partner4 = new Partner("4");
	}

	public void testPartner() {
		assertEquals("1", partner1.getName());
		testPartner(partner1, null);
	}
	
	private void testPartner(Partner partner1, Partner partner2) {
//		System.out.println("Testing that partner of " + partner1 + " is " + partner2);
		assertEquals(partner2, partner1.getPartner());
	}
	
	public void testSetPartner(Partner partner1, Partner partner2) {
		Partner oldPartner1Partner = partner1.getPartner();
		Partner oldPartner2Partner = (partner2 != null ? partner2.getPartner() : null);
		partner1.setPartner(partner2);
		testPartner(partner1, partner2);
		if (partner2 != null) {
			testPartner(partner2, partner1);
		}
		if (oldPartner1Partner != null) {
			testPartner(oldPartner1Partner, null);
		}
		if (oldPartner2Partner != null) {
			testPartner(oldPartner2Partner, null);
		}
	}
	
	public void testSetPartner() {
		testSetPartner(partner1, partner2);
	}
	
	public void testSetPartnerTwice() {
		testSetPartner(partner1, partner2);
		testSetPartner(partner3, partner4);
		testSetPartner(partner1, partner3);
		testSetPartner(partner2, partner4);
	}
	
	public void testResetPartner() {
		testSetPartner(partner1, partner2);
		testSetPartner(partner1, null);
	}
}
