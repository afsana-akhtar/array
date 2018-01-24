package com.bit.test;

import org.testng.annotations.Test;

import com.bit.BaseTest;
import com.bit.Core;
import com.bit.Utility;

public class SmokeTest extends BaseTest {
  @Test
  public void test1 () {
 
  Utility u=new Utility(driver);  //Base er driver pass
  u.catagery();
  
  
  //Core c= new Core(driver);
  
  
  
  
  
  }
}
