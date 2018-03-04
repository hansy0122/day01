package day01;
import java.util.*;

public class EnuWekekExample {
		public static void main(String ar[]){
			Week today=null;
			Calendar cal= Calendar.getInstance();
			int week=cal.get(Calendar.DAY_OF_WEEK);
			
			
			switch(week){
			case 1: 
				today = Week.SUNDAY;
				break;
			case 2: today = Week.MONDAY;break;
			case 3: today =Week.TUESDAY;break;
			case 4: today =Week.WENDESDAY;break;
			case 5: today =Week.THURSDAY;break;
			case 6: today =Week.FRIDAY;break;
			}
			
			
			if(today==Week.SUNDAY){
				System.out.println("soccer");
			}else{
				System.out.println("java");                                   
			}
			// 참고로 틀려도 안될때는 버그가 있음 ....--> clean기능을 사용 project에 있음. 
			
			
			
				
				Week weekDay=Week.valueOf("SATURDAY");
				if(weekDay==Week.SATURDAY||weekDay==Week.SUNDAY){
					System.out.println("주말입니다");
				}else{System.out.println("평일입니다");
				}
			
			
			
		}

}
