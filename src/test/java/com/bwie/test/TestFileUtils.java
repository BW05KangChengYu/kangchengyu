package com.bwie.test;

import java.util.Properties;

import org.junit.Test;

import com.kangchengyu.common.utils.FileUtils;


public class TestFileUtils {
	
	@Test
	public void testDel() {
		FileUtils.delFilePath("D:\\ec4 - ¸±±¾");
	}
	
	
	@Test
	public void TestPro() {
		
		Properties properties = System.getProperties();
		
		properties.forEach((key,value)->{
			System.out.println("key is : " + key);
			System.out.println("value is : " + value);
		});
	}
	
}
