package assessments;

public class AutomationClass extends MultipleLangauge implements Language , TestTool  {
	
	public void selenium() {
		System.out.println("Selenium method is from TestTool Interface");
	}

	public void java() {
		System.out.println("java method is from TestTool Interface");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby is the abstract method from abstract class Multi language");
		
	}
	public static void main(String[] args) {
		
		AutomationClass testcase = new AutomationClass();
		
		testcase.selenium();
		testcase.java();
		testcase.python();
		testcase.ruby();
		
		
	}

	

}
