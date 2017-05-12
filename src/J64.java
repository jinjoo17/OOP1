
public class J64 {
	public static void main(String[] args) {
		
		String[] s=new String[3];
		s[0]=new String("사과");
		s[1]="바나나";
		s[2]="포도";
		for(int i=0;i<s.length;i++){
			System.out.println(s[i].toString());
		}
		
		String str=new String("APPLE");
		System.out.println(str.toString());
		
		String[] f={"사과","바나나","오랜지","귤","포도"};
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		
		String[] ap={"apple","orange","grape","banana"};
		//모두 대문자 과일이름으로 출력하시오
		for (int i = 0; i < ap.length; i++) {
			System.out.println(ap[i].toUpperCase());//ap[i].toString().toUpperCase()
			
		}
		
	}
}
