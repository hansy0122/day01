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
			System.out.println("ffffalse!!"); //��ü�� �ּҰ� ���� �����̶� ������ ������ ������. new --> ���� �����Ҵ�.
		}
		
		if(str1.equals(str2)){  // ��Ʈ�� ���� ��ü�� �ٱ��ϴ³� equals
			System.out.println("true");
		}
		
	
		//���ͷ� ���� --> ?? 
		str1="�ȳ�";           //�̷��� �ϸ� �޼ҵ� ����(Static)�� ��Ÿ�� ��� Ǯ�� ��. �޸� �������� ���Ǯ�� ���� ������. 
		str2="�ȳ�";				// �����ϳ��ν� ���� ������ ���� ��. 
		
		if(str1==str2){
			System.out.println("true");
		}
		
		if(str1!=str2){
			System.out.println("ffffalse!!"); //��ü�� �ּҰ� ���� �����̶� ������ ������ ������. new --> ���� �����Ҵ�. 
		}
		
		// Q.2 ���� �ð��� ��������� s�� ��ü�ε� �׷� ��ü�ε��� �Ȱ��� ���Ѵٴ°ǰ�. �� �� �����ߴ°��� �Ѥ�? 
		// Q.1
		
		
		
		
		
	}
}
