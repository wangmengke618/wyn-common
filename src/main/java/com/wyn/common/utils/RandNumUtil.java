package com.wyn.common.utils;

import java.util.HashSet;
import java.util.Random;

public class RandNumUtil {

	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
		public static int[] subRandom (int min, int max, int subs){
			//存放返回的随机数
			int[] x=new int[subs];
			
			HashSet<Integer> set = new HashSet<Integer>();
			
			while (set.size()!=subs) {
				int i=random(min, max);
				set.add(i);
			}
			//遍历set 放入数组
			int k=0;
			for (Integer value : set) {
				x[k]=value;
				k++;
			}
			return x;
		}
		
		
		//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
		public static int random(int min, int max){
			
			Random r = new Random();
			
			int i = r.nextInt(max-min+1)+min;
			
			return i;
		}
}
