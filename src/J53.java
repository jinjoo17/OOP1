import bit.edu.BookVO;

public class J53 {

	public static void main(String[] args) {
		// å1���� ������ [��ü�� ����}�Ͻÿ�.
        // [��ü�� ����] => new�����ڸ޼���();
		
		BookVO vo=new BookVO();
		vo.setTitle("�ڹ�");
		vo.setPrice(20000);
		vo.setCompany("�������ۺ���");
		vo.setPage(600);
		System.out.println(vo);
		
		
	}

}
