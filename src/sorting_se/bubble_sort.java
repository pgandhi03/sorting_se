package sorting_se;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {28,6,9,1,3,5,12,13};
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int swap = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = swap;
				}
			}
		}
		
		for(int k=0;k<n;k++) {
			System.out.println(arr[k]);
		}
		

	}
	
}
