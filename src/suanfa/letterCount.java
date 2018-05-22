package suanfa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCount {
	public static void main(String[] args) {
		//统计字母的个数
		char[] arr1={'A','C','C','D'};
		Map<Character ,Integer>  map = new HashMap<Character ,Integer>();
		int j = 0;
		for(int i=0;i<arr1.length;i++){
			if(map.containsKey(arr1[i])){
				map.put(arr1[i],map.get(arr1[i])+1);
			}else{
				map.put(arr1[i],1);
			}
		}
		System.out.println(map);
			
		
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
