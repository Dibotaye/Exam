package question4;
import java.util.Scanner;

public class mergsort {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements in the array:");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        mergesort(arr, 0, n-1);
	        System.out.print("Enter the number to be searched:");
	        int target = scanner.nextInt();
	       
	        int firstIndex = findFirstIndex(arr, target);
	        int lastIndex = findLastIndex(arr, target);
	        int count = lastIndex - firstIndex + 1;
	        if (count > 0) {
	            System.out.println(target + " is present in the array " + count + " times.");
	        } else {
	            System.out.println(target + " is not present in the array.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static void mergesort(int[] arr, int l, int r) {
	        if (l < r) {
	            int mid = (l + r) / 2;
	            mergesort(arr, l, mid);
	            mergesort(arr, mid + 1, r);
	            merge(arr, l, mid, r);
	        }
	    }
	    
	    public static void merge(int[] arr, int l, int mid, int r) {
	        int n1 = mid - l + 1;
	        int n2 = r - mid;
	        
	        int[] left = new int[n1];
	        int[] right = new int[n2];
	        
	        for (int i = 0; i < n1; i++) {
	            left[i] = arr[l + i];
	        }
	        for (int j = 0; j < n2; j++) {
	            right[j] = arr[mid + 1 + j];
	        }
	        
	        int i = 0, j = 0, k = l;
	        while (i < n1 && j < n2) {
	            if (left[i] <= right[j]) {
	                arr[k] = left[i];
	                i++;
	            } else {
	                arr[k] = right[j];
	                j++;
	            }
	            k++;
	        }
	        
	        while (i < n1) {
	            arr[k] = left[i];
	            i++;
	            k++;
	        }
	        
	        while (j < n2) {
	            arr[k] = right[j];
	            j++;
	            k++;
	        }
	    }
	    
	    public static int findFirstIndex(int[] arr, int target) {
	        int low = 0;
	        int high = arr.length - 1;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return low;
	    }
	    
	    public static int findLastIndex(int[] arr, int target) {
	        int low = 0;
	        int high = arr.length - 1;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] <= target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return high;
	 
		

	}

}
