package day01;
import java.util.*;
import java.io.*;
public class ReferenceTest {
	public static void main(String ar[]){
		String str1=new String("123");
		String str2=new String("123");
		if(str1==str2){
			System.out.println("true");
		}
		
		if(str1!=str2){
			System.out.println("ffffalse!!"); //객체는 주소값 같은 개념이라서 힙스택 영역에 설정됨. new --> 힙에 영역할당.
		}
		
		if(str1.equals(str2)){  // 스트링 글자 자체를 바교하는놈 equals
			System.out.println("true");
		}
		
	
		//리터럴 문법 --> ?? 
		str1="안녕";           //이렇게 하면 메소드 영역(Static)의 런타임 상수 풀에 들어감. 메모리 영역상의 상수풀에 들어가기 때문임. 
		str2="안녕";				// 오직하나로써 같은 영역에 들어가게 됨. 
		
		if(str1==str2){
			System.out.println("true");
		}
		
		if(str1!=str2){
			System.out.println("ffffalse!!"); //객체는 주소값 같은 개념이라서 힙스택 영역에 설정됨. new --> 힙에 영역할당. 
		}
		
		// Q.2 쉬는 시간에 물어봐야지 s도 객체인데 그럼 객체인데도 안값을 비교한다는건가. 난 왜 에러뜨는거지 ㅡㅡ? 
		// Q.1
		
		
		
		
		
	}
}
