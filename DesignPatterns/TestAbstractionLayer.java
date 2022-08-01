interface TestContext {
	
	String getTestName();
	
	String getTestId();
}

abstract class AbstractContext implements TestContext {
	
	String testCompany;
	
	protected AbstractContext(String testCompany) {
		
		this.testCompany = testCompany;
	}
	
	public boolean isAmazon() {
		
		if (this.testCompany == "Amazon") {
			
			return true;
		}
		
		return false;
	}
}

class DefaultTestContext extends AbstractContext {

	public DefaultTestContext(String testCompany) {
		
		super(testCompany);
	}

	@Override
	public String getTestName() {
		
		if (this.testCompany == "Amazon") {
			
			return "SDE1";
		}
		
		return "SDE2";
	}

	@Override
	public String getTestId() {
		
		if (this.testCompany == "Amazon") {
			
			return "111";
		}
		
		return "222";
	}
}

public class TestAbstractionLayer {
	
	public static void main(String[] args) {
		
		TestContext context1 = new DefaultTestContext("Amazon");
		System.out.println(context1.getTestName());
		System.out.println(context1.getTestId());
		
		AbstractContext aContext1 = new DefaultTestContext("Amazon");
		System.out.println(aContext1.isAmazon());
		
		TestContext context2 = new DefaultTestContext("Google");
		System.out.println(context2.getTestName());
		System.out.println(context2.getTestId());
		
		AbstractContext aContext2 = new DefaultTestContext("Google");
		System.out.println(aContext2.isAmazon());
	}
}
