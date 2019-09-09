package com.kangchengyu.common.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author apple
 *
 */
public class StrUtils {
	
	/**
	 *  1.判空
	 * 	判断是不是空字符串
	 */
	public static boolean isNull(String str) {
		/**
		 * 如果是null 或者 “” 或者 “   ” 结果为true
		 * (注:trim()----去除空格)
		 */
		return (null==str||"".equals(str.trim()));
	}
	
	/**
	 * 	2.是否有值
	 *	 判断字符串是否有值，空引号和空格也算没值
	 */
	public static boolean isHasValue(String str) {
		/**
		 * 	两种方法是等价的
		 * 	 ！(str = null || "".equals(str.trim()));
		 */
		return	(str != null && !"".equals(str.trim()));
	}
	
	/**
	 * 	3.验证手机号
	 * 	运用正则表达式验证是不是电话号码
	 */
	public static boolean isTelephone(String str) {
		String phone="^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		return str.matches(phone);
	}
	
	/**
	 * 	4.验证邮箱
	 * 	运用正则表达式验证是不是邮箱
	 */
	public static boolean isEmail(String str) {
		String email="^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(email);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	
	/**
	 * 	5.验证全为字母
	 */
	public static boolean isLetter(String str) {
		String letter="^[a-zA-Z]+$";
		return str.matches(letter);
	}
	
	/**
	 * 	6.获取n位随机英文字符串
	 */
	public String getRandomStr (int n) {
		if (n<=0) {
			return "";
		}
		
		/**
		 * String 每次往里添加的时候都是重新new了一个对象 所以往里添加的时候费时间
		 * StringBuffer 是一个线程安全的对象 所以往里添加的时候费时间
		 * StringBuilder 是一个线程不安全的对象 在函数内部的 不会涉及到线程安全问题 在往里添加的时候比以上两个节省一点时间 
		 */
		Random random =new Random();
		
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < n; i++) {
			char letter = (char)('A'+random.nextInt(26));
			sb.append(letter);
		}
		return sb.toString();
	}
	
	/**
	 * 	7.获取n位随机英文和数字字符串
	 */
	public String getRandomStrNum(int n) {
		char[] chars= {'1','2','3','4','5','6','7','8','9','0',
				'a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L',
				'q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P',
				'z','x','c','v','b','n','m','Z','X','C','V','B','N','M'};
		Random random =new Random();
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < n; i++) {
			
			/**
			 * 	随机的到一个下标为	random.nextInt(chars.length)
			 * 	根据下标从数组中获取值 拼接到字符串上
			 */
			sb.append(chars[random.nextInt(chars.length)]);
		}
		return sb.toString();
	}
	
	/**
	 * 	8.随机获取n个随机中文字符串
	 */
	public static String getRandomCnStr(int n) {
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(getOneCn());
		}
		return sb.toString();
	}
	
	/**
	 * 	8.1 随机获取一个中文汉字
	 */
	private static String getOneCn() {
		String str = "";
		int hightPos; //
		int lowPos;
		
		Random random = new Random();

		hightPos = (176 + Math.abs(random.nextInt(39)));
		lowPos = (161 + Math.abs(random.nextInt(93)));

		byte[] b = new byte[2];
		b[0] = (Integer.valueOf(hightPos)).byteValue();
		b[1] = (Integer.valueOf(lowPos)).byteValue();

		try {
			str = new String(b, "GBK");
		} catch (Exception e) {
		    e.printStackTrace();
		    System.out.println("错误");
		}

		return str;

	}
	
	/**
	* 	9.方法功能：根据正则在字符串提取一段值，用于后面在url地址里提取ID值。
	* 例如在“http://news.cnstock.com/news,yw-201908-4413224.htm”把“4413224”提取出来。
	*/
	public static String getPlaceholderValue(String src, String regex){
		//TODO 实现代码
        Pattern pattern = Pattern.compile(regex);// 匹配的模式  
        Matcher m = pattern.matcher(src);  
        boolean find = m.find();
        if(find) {
        	String group = m.group(0);
        	 return group.substring(1,group.lastIndexOf('.'));
        }
        return "";
	}
	
	//测试工具包中isNumber()，
	/**
	 * 	10.是否是数字
	 */
	public static boolean isNumber(String src) {
		//String regix="[0-9]{1,}(\\.?|[0-9]*)";
		String regix="[0-9]{1,}\\.?[0-9]*";
		return src.matches(regix);
		
		
	}
	
	/**
	 * 11.测试工具包中hasText()，该方法是过滤String参数空格后判断是否有值，
	 * 如果你有该功能方法，但不是这个方法名不扣分。如果没有该方法，必须现在编写该方法
	 */
	public static boolean hasText(String src) {
		String string = src.replaceAll("\\s", "");
		return (!"".equals(string));
	}
	
	/**
	 * 	12.测试工具包中hasText()，该方法是过滤String参数空格后判断是否有值，
	 * 如果你有该功能方法，但不是这个方法名不扣分。如果没有该方法，必须现在编写该方法
	 * 	1.\n\r替换成\n
	 * 	2.将单个\r 使用<br/>标签替换
	 * 	3.将\n改为<p></p>标签
	 */
	public static String toHtml(String src) {
		String string = src.replaceAll("\\\\n\\r","\n");
		string = src.replaceAll("\\\r", "<br/>");
		String[] strings = string.split("\\\n");
		
		StringBuilder sb =new StringBuilder();
		for (int i = 0; i <  strings.length ;i++) {
			sb.append("<p>").append(strings[i]).append("</p>");
		}
		return sb.toString();
	}
	
	
}
