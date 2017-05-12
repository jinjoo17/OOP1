import bit.edu.MovieVO;

public class J68 {

	public static void main(String[] args) {
		MovieVO[] v= new MovieVO[3];
		v[0]=new MovieVO("보스",12000,"보스",12);
		v[1]=new MovieVO("명량",11000,"명량",10);
		v[2]=new MovieVO("비트",10000,"비트",15);
		
		//영화제목을 검색하여 가격출력(이진검색)
		
		String title="보스";
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
			System.out.println(title+"의 가격은"+v[index].getPrice());
			
		}else{
			System.out.println("검색실패");
		}
		
		
	}
	}


