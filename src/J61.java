import bit.edu.MovieVO;

public class J61 {

	public static void main(String[] args) {
		MovieVO v=new MovieVO("����", 15000,"����",15);
		//"I am a boy"��� ���ڿ�(��ü)�� ������ [������ ����]�Ͻÿ�.
		//                   0123456789
		String s=new String("I am a boy");
		System.out.println(s.length());
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}
	    
		String[] sp=s.split(" ");//������ �������� �ڸ��� Ư�������ڷ� �ڸ��� �迭���·� �޴´�.
		for(int i=0;i<sp.length;i++){
			System.out.println(sp[i]);
		}

	}

}
