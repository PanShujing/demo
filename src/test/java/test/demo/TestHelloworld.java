package test.demo;

/**
 * 测试case
 * @author shujpan
 *
 */

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestHelloworld {
  @Test
  public void testEmailGenerator() {

      RandomEmailGenerator obj = new RandomEmailGenerator();
      String email = obj.generate();

      Assert.assertNotNull(email);
      Assert.assertEquals(email, "feedback@yiibai.com");

  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("b");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("a");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after");
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
