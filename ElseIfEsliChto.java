
public class ElseIfEsliChto {

	public static void main(String[] args) {
		System.out.println(min(10,20,30));			 
		System.out.println(min(13,404,4));           
		System.out.println(min(2438095,1342,13244)); 
		System.out.println(min(1997,2006,1985)); 
	}
		
      	
		static int min(int a, int b, int c){     
			int result = a; 					 
			if (b < result){                     
			result = b;	
		} else if ( c!= a){
			System.out.println(b);
		}else if (b==c){
			System.out.println(c);
		}else if (c > a){
			System.out.println(a);
		}else{
			System.out.println("else");
		}
			
	    return a;	
	}

}
