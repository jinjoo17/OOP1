import bit.edu.MovieVO;

public class J68 {

	public static void main(String[] args) {
		MovieVO[] v= new MovieVO[3];
		v[0]=new MovieVO("����",12000,"����",12);
		v[1]=new MovieVO("��",11000,"��",10);
		v[2]=new MovieVO("��Ʈ",10000,"��Ʈ",15);
		
		//��ȭ������ �˻��Ͽ� �������(�����˻�)
		
		String title="����";
		int low=0;
		int high=v.length-1;
		int middle;
		int index=-1;
		
		while(low<=high){
			middle=(low+high)/2;
			if(title.equals(v[middle].getTitle())){
				index=middle;
				break;
			}else if(title.compareTo(v[middle].getTitle())>0){
				low=middle+1;
			}else{
				high=middle-1;
			}
			}
			
		if(index!=-1){
			System.out.println(title+"�� ������"+v[index].getPrice());
			
		}else{
			System.out.println("�˻�����");
		}
		
		
	}
	}


