package sorting_se;

public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {28,6,9,1,3,5,12,13};
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int temp = arr[i];
			int j=i-1;
			while((j>=0)&&(arr[j]>temp)) {
				arr[j+1] = arr[j];
				j--;
			}
				arr[j+1] = temp;
			
		}
		
		for(int m=0;m<n;m++) {
			System.out.println(arr[m]);
		}


	}

}
