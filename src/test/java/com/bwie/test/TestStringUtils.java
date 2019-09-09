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
				   "���֣������϶��й������ʲ��ݡ�����վ��ס��|http://news.cnstock.com/news,yw-201908-4413224.htm|8|2019-08-08 07:37:32",
				   "���߳��з������ʽ����ϵ� �����������䲨����ɳ�̬|http://news.cnstock.com/news,yw-201908-4413229.htm|5|",
				   "�ʲ���ծ������������� �����������������չת��|http://news.cnstock.com/news,yw-201908-4413222.htm||2019-08-08 07:36:50",
				   "̩�����߻�̩����������20��Ԫ|http://news.cnstock.com/news,jg-201908-4413369.htm|7|2019-08-08 09:25:53",
				   "�������У��й�7����㴢��Ϊ3.1037������Ԫ|http://news.cnstock.com/news,bwkx-201908-4412982.htm|10|2019-08-07 16:43:13",
				   "�ٶ�ս��Ͷ������ ���ֵ���С����|http://news.cnstock.com/news,bwkx-201908-4413414.htm||2019-08-08 10:57:59",
				   "MSCI��8ֻ���ɽ���������MSCI�й�ָ��|http://news.cnstock.com/news,bwkx-201908-4413216.htm|9|2019-08-08 07:28:58",
				   "ȫ������ָ����ͷ���롰�й�ʱ�䡱|http://stock.cnstock.com/stock/smk_gszbs/201908/4413244.htm|10|2019-08-08 07:47:08",
				   "8��8�ջ����������½�����ʾ|http://news.cnstock.com/news,bwkx-201908-4413227.htm||2019-08-08 07:39:05",
				   "��Ϊ��������2025ʮ������|http://news.cnstock.com/news,bwkx-201908-4413402.htm|8|2019-08-06 10:19:49",
				   "���׵ڶ����Ⱦ�����188��Ԫ ����ҵ��ë����ת��|http://news.cnstock.com/news,bwkx-201908-4413415.htm||2019-08-08 10:58:39",
				   "��ŷ���У�֣�ݣ���ͨ����˹����·|http://news.cnstock.com/news,bwkx-201908-4413425.htm|7|2019-08-08 11:15:24",
				   "�ҹ���ȨͶ���г���ģͻ��10����Ԫ|http://news.cnstock.com/news,yw-201908-4412690.htm|9|2019-08-07 07:59:11",
				   "�ٸ���Ƭ���۽��߶����� A�ɹ�˾��ǰ����|http://news.cnstock.com/news,yw-201908-4412640.htm|2|2019-08-07 07:42:29",
				   "�й��������й����������������й���Ϊ�����ʲ��ݹ���������|http://news.cnstock.com/news,yw-201908-4412630.htm|10"
				 };
		
		
	}
	
	
	//(1)	����StringUtil��������toHtml()��������һ���ı���ȥ�������html��ǩ���ı�
		@Test
		public void testHtml() {
			String str = "kthsdfkjfs  ��\rƬ����\n\r���߶����� \n\r A��Ƭ���� \n\r���߶����� A��Ƭ��\n\r�۽��߶����� A��Ƭ���۽��߶����� A��Ƭ���۽��߶����� A";
			String html = StrUtils.toHtml(str);
			System.out.println("html is :" + html);
		}
		
		//(2)	����StringUtil�������е��Ƿ�Ϊ�й������ֻ�����isPhone()���߷�����
		//��һ���Ƿ����ֻ�������Բ�ͨ����4�֣���
		@Test
		public void testPhone() {
			String str = "12233232121231312";
			boolean b = StrUtils.isTelephone(str);
			if (b) {
				System.out.println("��֤�ɹ�");
			}else {
				System.out.println("��֤ʧ��");
			}
		}
		
		//��һ�κϷ����ֻ����룬����ͨ����4�֣���
		@Test
		public void testPhone2() {
			String str = "13791603997";
			boolean b = StrUtils.isTelephone(str);
			if (b) {
				System.out.println("��֤�ɹ�");
			}else {
				System.out.println("��֤ʧ��");
			}
		}
		
		
		//����StringUtil�������е��Ƿ�Ϊ����isEmail()���߷�����
		//��һ���Ƿ���������Բ�ͨ����4�֣���
		@Test
		public void testEmail1() {
			String str = "asddasd.com";
			boolean b = StrUtils.isEmail(str);
			if (b) {
				System.out.println("��֤�ɹ�");
			}else {
				System.out.println("��֤ʧ��");
			}
		}
		
		//��һ�κϷ������䣬����ͨ����4�֣���
		@Test
		public void testEmail2() {
			String str = "158692727@qq.com";
			boolean b = StrUtils.isEmail(str);
			if (b) {
				System.out.println("��֤�ɹ�");
			}else {
				System.out.println("��֤ʧ��");
			}
		}
}
