package day01;

public class ArrayCreateByListExample1 {
	public static void main(String ar[]){
		//�迭 ���ͷ� --> ��ü 
		int scores[]={83,90,110};
		// int ma[]=new int[3]
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		//�迭�� ������ ���� for���� ����. 
		
		int sum=0;
		for (int i=0;i<scores.length;i++){
			sum+=scores[i];
		}
		System.out.println("totol="+sum);
		double avg=sum/3.0;
		System.out.println("av="+avg);
		
		//System.arryaycopy ;;;;;; --> ���߿� ���� !~!
		//shallowcopy ,deepcopy --> ���ͳ� �˻��غ��� ����.
		//���� for 
		
		
		
		
		
	}
}
