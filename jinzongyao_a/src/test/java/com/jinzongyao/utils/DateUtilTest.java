package com.jinzongyao.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	//测试月初
	@Test
	public void testGetDateByInitMonth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.getDateByInitMonth(new Date());
		System.out.println(df.format(date));
	}
	
	//测试月末
	@Test
	public void testGetDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH,1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		System.out.println(df.format(date));
	}

}
