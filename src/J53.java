import bit.edu.BookVO;

public class J53 {

	public static void main(String[] args) {
		// 책1권을 저장할 [객체를 생성}하시오.
        // [객체를 생성] => new생성자메서드();
		
		BookVO vo=new BookVO();
		vo.setTitle("자바");
		vo.setPrice(20000);
		vo.setCompany("이지스퍼블리싱");
		vo.setPage(600);
		System.out.println(vo);
		
		
	}

}
