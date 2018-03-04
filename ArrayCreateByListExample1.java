package day01;

public class ArrayCreateByListExample1 {
	public static void main(String ar[]){
		//배열 리터럴 --> 객체 
		int scores[]={83,90,110};
		// int ma[]=new int[3]
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		//배열이 있으면 거의 for문이 있음. 
		
		int sum=0;
		for (int i=0;i<scores.length;i++){
			sum+=scores[i];
		}
		System.out.println("totol="+sum);
		double avg=sum/3.0;
		System.out.println("av="+avg);
		
		//System.arryaycopy ;;;;;; --> 나중에 설명 !~!
		//shallowcopy ,deepcopy --> 인터넷 검색해보면 좋음.
		//향상된 for 
		
		
		
		
		
	}
}
