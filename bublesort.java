package question4;

public class bublesort {

	    public static void main(String[] args) {
	        char[] arr = { 'd', 'i', 'b', 'o', };

	        bubbleSort(arr);

	        System.out.println("Sorted Array:");
	        printArray(arr);
	    }

	    public static void bubbleSort(char[] arr) {
	        int n = arr.length;
	        char temp;
	        for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	                if (arr[j] > arr[j+1]) {
	                    temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }
	    }

	    public static void printArray(char[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	

	}

