package Javashuzu;

import org.testng.annotations.Test;

public class shuzulianxi {
	@Test
//求这个日期是一年的第多少天
	/*public  void dijitian() {
		int year = 2017;
		int month = 5;
		int day = 31; 
		//输入每个月的天数，创建一个数组
		int[] ms = {31,28,31,30,31,30,31,31,30,31,30,31};
		//先判断本年是不是闰年 如果闰年二月是二十九天
		if(year%4==0 && year%100!=0 || year%400==0) {
			ms[1]=29;//把第二个元素换成29
		}
		int sum = 0;
		for(int i=0;i<month-1;i++) {
			sum = sum+ms[i];//累计month前的所有天数
		}
		sum = sum+day;//之前几个月的天数加上本月过了多少天
		//字符串命名  字符+ "汉字"
		System.out.println(year+"年 "+month+"月 "+day+"日 是这一年的第"+sum+"天");
	}*/
//找出数组中的一个最大值
	/*public void max() {
		int [] aa= {1,2,3,4,5};
		//假设aa[0]即第一个元素是最大的
		int max = aa[0];
		for(int i=1;i<aa.length;i++) {
			if(aa[i]>max) {
				//把比较后的较大值重新赋给max
				max = aa[i];
			}
		}
		
		System.out.println(max);
	}*/

		
	

}
