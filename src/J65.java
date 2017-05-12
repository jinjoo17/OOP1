

public class J65 {

	public static void main(String[] args) {
        int[]a={4,3,1,2,5};
        int tmp;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					 tmp=a[i];
					 a[i]=a[j];
					 a[j]=tmp;
					
				}
					
				}
			}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+"\t");
		}
		
        String tmp1;
       	String[] s={"사과","바나나","오렌지","포도","귤"};
				for (int i = 0; i < s.length-1; i++) {
					for (int j = i+1; j < s.length; j++) {
						if(s[i].compareTo(s[j])>0){
							 tmp1=s[i];
							 s[i]=s[j];
							 s[j]=tmp1;
						
}

}
}
          for(int i=0;i<s.length;i++){
        	 System.out.println(s[i]); 
}}

}