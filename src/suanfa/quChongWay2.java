package suanfa;

import java.util.ArrayList;
import java.util.List;

public class quChongWay2 {
	public static void main(String[] args) {
		int[] arr1={1,11,11,3,5,3,5,7,8,9};
		List<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++){
			if(isChong(i,arr1)){
				list.add(arr1[i]);
			}
		}
		System.out.println(list);
		
	}
	//判断某个值和数组其他数字是否重复
	public static boolean isChong(int position,int[] arr){
		boolean flag = true;//初始化为不重复
		for(int i=0;i<arr.length;i++){
			//除掉某个值,与其他值比较
			if(i!=position){
				if(arr[position]==arr[i]){
					flag = false;//只要有一个相同，即有在该数组中有相同的值,即为false
					continue;
				}
				
			}
		}
		return flag;	
	}

}
