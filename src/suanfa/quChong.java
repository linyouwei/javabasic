package suanfa;

import java.util.ArrayList;
import java.util.List;

public class quChong {
	public static void main(String[] args) {
		int[] arr1={1,11,11,3,5,3,5,7,8,9};
		List<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++){
			boolean flag = true;//初始化为不重复
			for(int position=0;position<arr1.length;position++){
				//除掉某个值,与其他值比较
				if(i!=position){
					if(arr1[position]==arr1[i]){
						flag = false;//只要有一个相同，即有在该数组中有相同的值,即为false
						continue;
					}
					
				}
			}	
			if(flag){
				list.add(arr1[i]);
			}
		}
		System.out.println(list);
		
	}


}
