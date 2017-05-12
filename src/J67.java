
public class J67 {
	public static void main(String[] args) {
		String s="사과#바나나#오렌지#포도#귤";
		//#을 기준으로 문자열을 분리하여 과일이름을 내림차순으로 정렬하여 출력
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
