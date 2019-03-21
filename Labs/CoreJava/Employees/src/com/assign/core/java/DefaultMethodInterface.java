package com.assign.core.java;

public interface DefaultMethodInterface {
  public void appraise();
  default void Test() {
	  System.out.println("Default Method With Implementation in an Interface");
	  
  }
	
}
