package Search;
//SpanOfArray - Span = max - minimum
public class SpanOfArray {
	public static void main(String[] args) { 
		int ar[] = {150, 89, 99, 32, 122};
		System.out.print(span(ar));
	}
	
	static int span(int ar[]) {
		int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		for (int a : ar) {
			if(a>max) {
				max=a;
			}
			if(a<min)
				min=a;				
		}
		return max-min;
	}
}
