import bit.edu.MovieVO;

public class J61 {

	public static void main(String[] args) {
		MovieVO v=new MovieVO("보스", 15000,"보스",15);
		//"I am a boy"라는 문자열(객체)를 저장할 [변수를 선언]하시오.
		//                   0123456789
		String s=new String("I am a boy");
		System.out.println(s.length());
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}
	    
		String[] sp=s.split(" ");//공백을 기준으로 자른다 특정구분자로 자르고 배열형태로 받는다.
		for(int i=0;i<sp.length;i++){
			System.out.println(sp[i]);
		}

	}

}
