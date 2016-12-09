package test;

import java.util.regex.Pattern;


/**
 * -----------------------------------------
 * @文件: Test.java
 * @作者: 範宗雲
 * @邮箱: fancyzero@yeah.net
 * @时间: 2012-6-10
 * @描述: 测试正则表达式
 * -----------------------------------------
 */
public class Test {

	public static void main(String[] args) {
		String url = "http://health.voc.com.cn/list.asp?Ftype=InNews&page=?pindao=75";
		String 	newsId = url.substring(0,url.lastIndexOf("?"));
		String pindaoName =url.substring(url.lastIndexOf("=")+1);
		//String domain = url.substring(0, url.indexOf("&page"));
		//String	PublishTime=newsId.substring(0,4)+"-"+newsId.substring(4, 6)+"-"+newsId.substring(6, 8)+" "+newsId.substring(8, 10)+":"+newsId.substring(10, 12)+":"+newsId.substring(12, 14);
		//String[] hh=str.indexOf("[");
		//http://ent.voc.com.cn/mobile/article/201610/201610091711147428.html
		//http://h.voc.com.cn/article/201610/201610130751372762.html
		//^/article/([0-9]+)/([0-9]+).html
		//System.out.println(str.matches("(.*)/article/([0-9]+)/([0-9]+).html$"));
		System.out.println("newsId:"+newsId+" | pindaoName:"+pindaoName);
		/*String[] dataArr = { "google", "gooogle", "gooooogle", "goooooogle","ggle"};
		for (String str : dataArr) {
		String patternStr = "g(o{2,5})gle";
		boolean result = Pattern.matches("goo", str);
		if (result) {
		System.out.println("字符串" + str + "匹配模式" + patternStr + "成功");
		} else {
		System.out.println("字符串" + str + "匹配模式" + patternStr + "失败");
		}
		} */
	}
}
