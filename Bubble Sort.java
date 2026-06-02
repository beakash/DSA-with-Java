
public class bubblesort {

	public static void main(String[] args) {
		int[] array = { 24,56,34,57};
		int n = array.length;
		for(int i = 0; i < n- 1;i++) {
			for(int j = 0; j < n - i - 1;j++) {
				if(array[j]>array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j+1]= temp;
				}
			}
		}
		System.out.print("Sorted Array : ");
		for(int i = 0; i<n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

}
