package Pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 
{
  @Test
  public void f() 
  {
	  Assert.assertTrue(true);
	 System.out.println("Class1 Output");
  }
  @Test
  public void a() 
  {
	  Assert.assertTrue(false);
	 System.out.println("Class1 Output");
  }
  @Test
  public void h() 
  {
	  Assert.assertTrue(true);
	 System.out.println("Class1 Output");
  }
  @Test
  public void t() 
  {
	  Assert.assertTrue(false);
	 System.out.println("Class1 Output");
  }
}