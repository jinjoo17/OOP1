
public class J64 {
	public static void main(String[] args) {
		
		String[] s=new String[3];
		s[0]=new String("���");
		s[1]="�ٳ���";
		s[2]="����";
		for(int i=0;i<s.length;i++){
			System.out.println(s[i].toString());
		}
		
		String str=new String("APPLE");
		System.out.println(str.toString());
		
		String[] f={"���","�ٳ���","������","��","����"};
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		
		String[] ap={"apple","orange","grape","banana"};
		//��� �빮�� �����̸����� ����Ͻÿ�
		for (int i = 0; i < ap.length; i++) {
			System.out.println(ap[i].toUpperCase());//ap[i].toString().toUpperCase()
			
		}
		
	}
}
