import bit.edu.MovieVO;

public class J54 {//Ŭ����->��ü->�ν��Ͻ�(���)

	public static void main(String[] args) {
		//Q)��ȭ(Data) 1���� ������ [������ ����]�Ͻÿ�.
		
		MovieVO v;//��ü����
		v=new MovieVO();//�ν��Ͻ�����, �����ڸ޼��� ȣ��
		v.setTitle("�������̺�");
		v.setPrice(150000);
		v.setMajor("����");
		v.setLevel(12);
		System.out.println(v.toString());
//		System.out.println(v.getMajor()+"\t"+v.getPrice());
	}

}
