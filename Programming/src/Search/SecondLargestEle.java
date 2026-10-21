package Search;

public class SecondLargestEle {

	public static void main(String[] args) { 
		int ar[] = {156, 999, 999, 392, 122};
		System.out.print(secondLargest(ar));
	}
	
	static int secondLargest(int ar[]) {
		int fl=Integer.MIN_VALUE, sl=Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>fl) {
				sl=fl;
				fl=ar[i];
			}else if(ar[i]>sl && sl!=fl) {
				sl=ar[i];
			}
		}
		return sl;
	}

}
