package suanfa;

import java.util.ArrayList;
import java.util.List;

public class quChongWay4 {
	public static void main(String[] args) {
		//重复的只保留一个
//		int[] arr1={1,11,11,3,5,3,5,7,8,9};
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i=0;i<arr1.length;i++){
//			if(isChong(i,arr1)){
//				list.add(arr1[i]);
//			}	
//		}
//		System.out.println(list);
		int[] arr1={1,11,11,3,5,3,5,7,8,9};
		//使用数组会多出0
		int[] arr2 = new int[arr1.length];
		int j = 0;
		for(int i=0;i<arr1.length;i++){
			if(isChong(i,arr1)){
				arr2[j]= arr1[i];
				j++;
			}	
		}
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		
		
	}
	//判断某个值A和比A位置小的数 是否重复
	public static boolean isChong(int position,int[] arr){
		boolean flag = true;//初始化为不重复
		for(int j=0;j<position;j++){
			//除掉某个值,与其他值比较
				if(arr[position]==arr[j]){
					flag = false;//只要有一个相同，即有在该数组中有相同的值,即为false
					continue;
				}
		}
		return flag;	
	}

}
