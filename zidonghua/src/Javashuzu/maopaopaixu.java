package Javashuzu;

import org.testng.annotations.Test;

/*排序：选择排序、冒泡排序、希尔排序、快速排序
 * 冒泡排序（BubbleSort）相邻的两个数分别比较
 * 如果前面的大于后面的交换位置 是冒泡升序排列
 */
public class maopaopaixu {
	@Test
	public void BubbleSort() {
	//升序（从小到大）或者降序排列（从大到小）
		int [] aa= {5,2,1,7,9,8,2};
	//按照升序排列 第一次排序后的结果是（ 2 5 1 7 9 8 2）（2 1 5 7 9 8 2）（2 1 5 7 9 8 2）（2 1 5 7 8 9 2）（2 1 5 7 8 2 9）
	//每次排序都是大数沉底
	   for(int k=0;k<aa.length-1;k++) {//外层循环排的是（数组元素-1）次
		  // for(int i=0;i<aa.length-1-k;i++)效率最高的冒泡排序内层循环
		  //外层循环走一次内层循环少走一次
		   for(int i=0;i<aa.length-1;i++) {
	    	//内层循环一次是一次冒泡排序，相邻的两个数比较
	    	//第一次内层循环最大数沉底
			if(aa[i]>aa[i+1]) {//交换两个数
	    		int temp = aa[i];
	    		aa[i]=aa[i+1];
	    		aa[i+1]=temp;
	    	 }
	    }
	   }	
	}
	

}
