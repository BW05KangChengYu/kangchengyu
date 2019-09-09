package com.bwie.test;

import org.junit.Test;

import com.kangchengyu.common.utils.StrUtils;


/**
 * 
 * @author apple
 *
 */
public class TestStringUtils {
	@Test
	public void testIsNull() {
		String tel1=" ";
		String tel2="haha";
		boolean tel3 = StrUtils.isNull(tel1);
		boolean tel4 = StrUtils.isNull(tel2);
		System.out.println(tel3);
		System.out.println(tel4);
	}
	@Test
	public void testTel() {
		String tel1="13791603997";
		String tel2="12221212121";
		boolean tel3 = StrUtils.isTelephone(tel1);
		boolean tel4 = StrUtils.isTelephone(tel2);
		System.out.println(tel3);
		System.out.println(tel4);
	}
	@Test
	public void testEmail() {
		String tel1="13791603997@qq.com";
		String tel2="12221212121@mm.a";
		boolean tel3 = StrUtils.isEmail(tel1);
		boolean tel4 = StrUtils.isEmail(tel2);
		System.out.println(tel3);
		System.out.println(tel4);
	}
	@Test
	public void testLetter() {
		String tel1="asdffgdAs";
		String tel2="1csasaA";
		boolean tel3 = StrUtils.isLetter(tel1);
		boolean tel4 = StrUtils.isLetter(tel2);
		System.out.println(tel3);
		System.out.println(tel4);
	}
	@Test
	public void testCn() {
		System.out.println(StrUtils.getRandomCnStr(4));
	}
	
	@Test
	public void testisNumber() {
		System.out.println(" 234 :" + StrUtils.isNumber("234"));
		System.out.println(" 2.34 :" + StrUtils.isNumber("2.34"));
		System.out.println(" . :" + StrUtils.isNumber("."));
		System.out.println(" avc :" + StrUtils.isNumber("abc"));
		
		
	}
	
	@Test
	public void testHastext() {
		
		System.out.println(" 1:" + StrUtils.hasText("   "));
		System.out.println(" 2:" + StrUtils.hasText("  f  f "));
		System.out.println(" 3:" + StrUtils.hasText("  			 "));
		
	}
	
	@Test
	public void test(){
		String news[] = {
				   "外汇局：美国认定中国“汇率操纵”根本站不住脚|http://news.cnstock.com/news,yw-201908-4413224.htm|8|2019-08-08 07:37:32",
				   "二线城市房贷利率接连上调 房贷利率区间波动或成常态|http://news.cnstock.com/news,yw-201908-4413229.htm|5|",
				   "资产负债管理顶层设计亮相 引导险企向高质量发展转型|http://news.cnstock.com/news,yw-201908-4413222.htm||2019-08-08 07:36:50",
				   "泰康在线获泰康集团增资20亿元|http://news.cnstock.com/news,jg-201908-4413369.htm|7|2019-08-08 09:25:53",
				   "人民银行：中国7月外汇储备为3.1037万亿美元|http://news.cnstock.com/news,bwkx-201908-4412982.htm|10|2019-08-07 16:43:13",
				   "百度战略投资有赞 布局电商小程序|http://news.cnstock.com/news,bwkx-201908-4413414.htm||2019-08-08 10:57:59",
				   "MSCI：8只个股将被新增入MSCI中国指数|http://news.cnstock.com/news,bwkx-201908-4413216.htm|9|2019-08-08 07:28:58",
				   "全球三大指数巨头进入“中国时间”|http://stock.cnstock.com/stock/smk_gszbs/201908/4413244.htm|10|2019-08-08 07:47:08",
				   "8月8日沪深两市最新交易提示|http://news.cnstock.com/news,bwkx-201908-4413227.htm||2019-08-08 07:39:05",
				   "华为发布面向2025十大趋势|http://news.cnstock.com/news,bwkx-201908-4413402.htm|8|2019-08-06 10:19:49",
				   "网易第二季度净收入188亿元 创新业务毛利率转正|http://news.cnstock.com/news,bwkx-201908-4413415.htm||2019-08-08 10:58:39",
				   "中欧班列（郑州）开通俄罗斯新线路|http://news.cnstock.com/news,bwkx-201908-4413425.htm|7|2019-08-08 11:15:24",
				   "我国股权投资市场规模突破10万亿元|http://news.cnstock.com/news,yw-201908-4412690.htm|9|2019-08-07 07:59:11",
				   "临港新片区聚焦高端制造 A股公司提前布局|http://news.cnstock.com/news,yw-201908-4412640.htm|2|2019-08-07 07:42:29",
				   "中国人民银行关于美国财政部将中国列为“汇率操纵国”的声明|http://news.cnstock.com/news,yw-201908-4412630.htm|10"
				 };
		
		
	}
	
	
	//(1)	测试StringUtil工具类中toHtml()方法，传一段文本进去，输出带html标签的文本
		@Test
		public void testHtml() {
			String str = "kthsdfkjfs  新\r片区聚\n\r焦高端制造 \n\r A新片区聚 \n\r焦高端制造 A新片区\n\r聚焦高端制造 A新片区聚焦高端制造 A新片区聚焦高端制造 A";
			String html = StrUtils.toHtml(str);
			System.out.println("html is :" + html);
		}
		
		//(2)	测试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法。
		//传一个非法的手机号码测试不通过（4分）。
		@Test
		public void testPhone() {
			String str = "12233232121231312";
			boolean b = StrUtils.isTelephone(str);
			if (b) {
				System.out.println("验证成功");
			}else {
				System.out.println("验证失败");
			}
		}
		
		//传一次合法的手机号码，测试通过（4分）。
		@Test
		public void testPhone2() {
			String str = "13791603997";
			boolean b = StrUtils.isTelephone(str);
			if (b) {
				System.out.println("验证成功");
			}else {
				System.out.println("验证失败");
			}
		}
		
		
		//测试StringUtil工具类中的是否为邮箱isEmail()工具方法。
		//传一个非法的邮箱测试不通过（4分）。
		@Test
		public void testEmail1() {
			String str = "asddasd.com";
			boolean b = StrUtils.isEmail(str);
			if (b) {
				System.out.println("验证成功");
			}else {
				System.out.println("验证失败");
			}
		}
		
		//传一次合法的邮箱，测试通过（4分）。
		@Test
		public void testEmail2() {
			String str = "158692727@qq.com";
			boolean b = StrUtils.isEmail(str);
			if (b) {
				System.out.println("验证成功");
			}else {
				System.out.println("验证失败");
			}
		}
}
