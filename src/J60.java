import bit.edu.MovieVO;

public class J60 {

	public static void main(String[] args) {
		// ����-int
		int a;
		a=10;
		//��ȭ-MovieVO
		MovieVO v;
		v=new MovieVO("����",15000,"����",12);
		// ���ڿ�- "String" : ����API(SUN), �ܺ�API
//		String s;
//	    s=new String("apple");
		
		String s="apple";
		//"apple"->����                            - String -
	    
		//1. ����?=5  ------------------------------>Method
	    System.out.println(s.length());
		//2. ��� �빮��?="APPLE"   ---------------->Method
	    System.out.println(s.toUpperCase());
		//3. �κй��ڿ��� ��������?"PP"  ----------->Method
	    System.out.println(s.substring(1, 3));
		//4. p�� @�� ����?"a@@le"   ---------------->Method
	    System.out.println(s.replaceAll("p","@"));
		//5. pl�̶�� �κй��ڿ��� ��ġ��?=2  ------>Method
	    System.out.println(s.indexOf("plp"));
	    
		
		
		
			}

}
