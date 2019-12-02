package main;

public class Heapmemory {
	/**
	 * 
	 * @author krishna date04-Nov-2019
	 
	 */
	public static void main(String[] args) {
		
		long heapSize= Runtime.getRuntime().totalMemory();
		
		
		
		long heapMaxSize = Runtime.getRuntime().maxMemory();
		
		long heapFreeSize = Runtime.getRuntime().freeMemory();
		
		System.out.println(heapSize/1024);
		System.out.println(heapMaxSize/1024);
		System.out.println(heapFreeSize/1024);
	}
	
	
//	public static String formatSize(long v) {
//		if(v<1024) return v+" B";
//		int z = (63-Long.numberOfLeadingZeros(v))/10;
//		return String.format("%.lf %sB", (double)v / (1L << (z*10))," KMGTPE".charAt(z));
//	}
}
