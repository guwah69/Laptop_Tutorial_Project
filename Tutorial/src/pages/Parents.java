package pages;

import org.testng.annotations.Test;

public class Parents {
	
	
  @Test
  public void f() {
	  System.out.print("I navigate to facebook page");
	  
	  //To Use a Method from another class use the following:
	  //MethodsObjects.methodname
	  
	  Methodss m=new Methodss();
	  m.GoToFacebook();
	  
	  System.out.println("I'm now on the facebookpage");
	  
  }
}
