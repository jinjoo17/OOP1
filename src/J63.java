 
public class J63 {

	public static void main(String[] args) {
		String s1=new String("ABC");
		String s2=new String("ABC");
		//����, ���, 0
//		if(s1.compareTo(s2)==0){
		if(s1.equals(s2)){
			System.out.println("s1==s2");
		}else{
			System.out.println("s1!=s2");
			
		}
		
		String s3="DDD";
		String s4="DDD";
		if(s3.equals(s4)         ){
			System.out.println("s3==s4");
			
		}else{
			System.out.println("s3!=s4");
		}
		
		
		
		//String s5="GHE";//���ڿ����(literal:���ͷ�)
		//int a=10;//����(���=���Ҽ�����)
		

	}

}
