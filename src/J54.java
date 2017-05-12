import bit.edu.MovieVO;

public class J54 {//클래스->객체->인스턴스(사용)

	public static void main(String[] args) {
		//Q)영화(Data) 1편을 저장할 [변수를 선언]하시오.
		
		MovieVO v;//객체변수
		v=new MovieVO();//인스턴스변수, 생성자메서즈 호출
		v.setTitle("보스베이비");
		v.setPrice(150000);
		v.setMajor("보스");
		v.setLevel(12);
		System.out.println(v.toString());
//		System.out.println(v.getMajor()+"\t"+v.getPrice());
	}

}
