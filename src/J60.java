import bit.edu.MovieVO;

public class J60 {

	public static void main(String[] args) {
		// 정수-int
		int a;
		a=10;
		//영화-MovieVO
		MovieVO v;
		v=new MovieVO("보스",15000,"보스",12);
		// 문자열- "String" : 내부API(SUN), 외부API
//		String s;
//	    s=new String("apple");
		
		String s="apple";
		//"apple"->조작                            - String -
	    
		//1. 길이?=5  ------------------------------>Method
	    System.out.println(s.length());
		//2. 모두 대문자?="APPLE"   ---------------->Method
	    System.out.println(s.toUpperCase());
		//3. 부분문자열만 가져오기?"PP"  ----------->Method
	    System.out.println(s.substring(1, 3));
		//4. p를 @로 변경?"a@@le"   ---------------->Method
	    System.out.println(s.replaceAll("p","@"));
		//5. pl이라는 부분문자열의 위치를?=2  ------>Method
	    System.out.println(s.indexOf("plp"));
	    
		
		
		
			}

}
