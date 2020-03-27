package com.qiaochengjie.util;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
	
	}

	@Test
	public void testGetage() {

	}

	@Test
	public void testGetEndMonth() {
	Calendar c = Calendar.getInstance();
     c.set(2020, 2, 12);
	 Date date = DateUtil.getEndMonth(c.getTime());
	 System.out.println(date);
	}

	@Test
	public void testGetInitMonth() {

	}

}
