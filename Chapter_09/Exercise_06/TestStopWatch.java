public class TestStopWatch {	
	public static void main(String[] args) {
		int[] unsorted = new int[100000];
		for (int i = 0; i < unsorted.length; i++) {
			unsorted[i] = (int) (Math.random() * 10000) + 1;
		}
		StopWatch sw = new StopWatch();
		sw.start();
		selectionSort(unsorted);
		sw.stop();
		System.out.println("It took " + sw.getElapsedTime() + " ms to sort an array of 100000 elements.");
		
	}
	
	public static void selectionSort(int[] arr) {
	    int n = arr.length;

	    for (int i = 0; i < n - 1; i++) {	        
	        int minIdx = i;
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] < arr[minIdx]) {
	                minIdx = j;
	            }
	        }
	        
	        int temp = arr[minIdx];
	        arr[minIdx] = arr[i];
	        arr[i] = temp;
	    }
	}
}


class StopWatch {
	private long startTime;
	private long endTime;
	
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}
	
	public long getStartTime() {
	    return startTime;
	}

	public long getEndTime() {
	    return endTime;
	}
}
