
public class J67 {
	public static void main(String[] args) {
		String s="���#�ٳ���#������#����#��";
		//#�� �������� ���ڿ��� �и��Ͽ� �����̸��� ������������ �����Ͽ� ���
		String[]sp=s.split("#");
		String tmp;
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(sp[i].compareTo(sp[j])<0){
					tmp=sp[i];
					sp[i]=sp[j];
					sp[j]=tmp;
				}
			}
		}
		for (int i = 0; i < s.length(); i++) {
			System.out.println(sp[i]);
			
		}
	}
}
