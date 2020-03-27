package com.qiaochengjie.util;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
	boolean b = StringUtil.hasLength("");
	System.out.println(b);
	}

	@Test
	public void testHasText() {
  boolean b = StringUtil.hasText("44");
  System.out.println(b);
	}

	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
        String string = StringUtil.randomChineseString();
        System.out.println(string);
	}
	
	
	@Test
	public void randomChineseStrings() throws UnsupportedEncodingException {
    String string = StringUtil.randomChineseStrings(5);
    System.out.println(string);
	}
	
	@Test
	public void testGenerateChineseName() throws UnsupportedEncodingException {
	   String name = StringUtil.generateChineseName();
	   System.out.println(name);
	}

}
