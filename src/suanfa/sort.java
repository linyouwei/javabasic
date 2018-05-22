package suanfa;

public class sort {
	public static void main(String[] args) {
		//冒泡排序
		int [] arr = {2,5,2,3,1};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>arr[i]){//交换位置
					int temp;
					temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
