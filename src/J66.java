import bit.edu.MovieVO;

public class J66 {
	public static void main(String[] args) {
             MovieVO[] v=new MovieVO[3];
             v[0]=new MovieVO("����",12000,"����",12);
             v[1]=new MovieVO("��",11000,"��",10);
             v[2]=new MovieVO("��Ʈ",10000,"��Ʈ",15);
             //��ȭ������ �������� �������� �����Ͽ� ����Ͻÿ�.
             
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
               String title="����";//��ȭ������ �˻�(�����˻�)�ϸ� ������ ����ϵ���
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
            	   System.out.println(title+"�� ������" +v[index].getPrice());
            	   
               }else{
            	   System.out.println("�˻�����");
         
                        }
               }

     
             
		
	}


