package day01;

public class AdvancededForExample {
public static void main(String ar[]){
	int[] scores={10,20,30,40,50,60};
	int sum=0;
	
	
	//for-each�� 
	for(int score: scores){
		sum=sum+score;        //���� for ���� scores �ȿ��ִ� �༮���� score�� �����϶�� ��.
	}
	
	/*for(int i=0;i<scores.length;i++)
	{
		int score=scores[i];
		sum+=score; 
	}*/
	
	System.out.println(sum);
	System.out.println((double)sum/scores.length);
	
}
}
