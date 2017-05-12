import bit.edu.MovieVO;

public class J66 {
	public static void main(String[] args) {
             MovieVO[] v=new MovieVO[3];
             v[0]=new MovieVO("보스",12000,"보스",12);
             v[1]=new MovieVO("명량",11000,"명량",10);
             v[2]=new MovieVO("비트",10000,"비트",15);
             //영화제목을 기준으로 오름차순 정렬하여 출력하시오.
             
             MovieVO tmp;
            	
     				for (int i = 0; i < v.length-1; i++) {
     					for (int j = i+1; j < v.length; j++) {
     						if((v[i].getTitle()).compareTo(v[j].getTitle())>0){
     							 tmp=v[i];
     							 v[i]=v[j];
     							 v[j]=tmp;
            }
         }
     }
               for(int i=0;i<v.length;i++){
             	 System.out.println(v[i]); 
     }
               String title="보스";//영화제목을 검색(이진검색)하면 가격을 출력하도록
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
               }//while`                       	
               if(index!=-1){
            	   System.out.println(title+"의 가격은" +v[index].getPrice());
            	   
               }else{
            	   System.out.println("검색실패");
         
                        }
               }

     
             
		
	}


