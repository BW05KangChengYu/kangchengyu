package com.bwie.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.kangchengyu.common.utils.DateUtils;


public class TestDateUtils {
	@Test
	public void testLastDate() throws ParseException {
		
		Date end = DateUtils.getMonthEnd(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(" end is " + end );
		System.out.println(" end is " + format.format(end) );
		
	}
}
