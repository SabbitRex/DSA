interface WebDriver {
	
	void getElement();
	
	void selectElement();
	
}

class ChromeDriver implements WebDriver {

	@Override
	public void getElement() {
		
		System.out.println("Get Element : Chrome Driver");
	}

	@Override
	public void selectElement() {
		
		System.out.println("Select Element : Chrome Driver");
	}
	
	
}

class FireFoxDriver {
	
	public void findElement() {
		
		System.out.println("Find Element : FireFox Driver");
	}
	
	public void chooseElement() {
		
		System.out.println("Choose Element : FireFox Driver");
	}
}

class WebDriverAdapter implements WebDriver {
	
	private FireFoxDriver fireFoxDriver;
	
	public WebDriverAdapter(FireFoxDriver fireFoxDriver) {
		
		this.fireFoxDriver = fireFoxDriver;
	}
	
	@Override
	public void getElement() {
		
		this.fireFoxDriver.findElement();
	}

	@Override
	public void selectElement() {
		
		this.fireFoxDriver.chooseElement();
	}
	
}

public class AdapterDesignPattern {
	
	public static void main(String[] args) {
		
		WebDriver driver1 = new ChromeDriver();
		driver1.getElement();
		driver1.selectElement();
		
		WebDriver driver2 = new WebDriverAdapter(new FireFoxDriver());
		driver2.getElement();
		driver2.selectElement();
	}
}
