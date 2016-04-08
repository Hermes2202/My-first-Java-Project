
public class IsSpringIfElseMonth {

	public static void main(String[] args) {
	 //:)
		
		System.out.println(isSpring(3,4,5)); 
		System.out.println(isSammer(6,7,8));
        System.out.println(isOttoum(9,10,11));
		System.out.println(isWinter(12,1,2));
		System.out.println(isCentury(21));
		
		}
	static int isSpring(int a,int b,int c){
		if (a!=b && b!=c || c!=a){	              // 1 if 
		}
		return 1;
	}

	static int isWinter(int a,int b, int c){
		{
			if (a!=b){	                         //2 ifa
			}
			else if (b!=c && a!=c){
				
			}
		return 0;
		}		
	}
	static int isSammer(int a, int b, int c){
		return 0;
	}                                               // nu i vrode sovsem bez if
	static int isOttoum(int a, int b,int c){
		return 0;
	}static int isCentury(int a){
	    return -1;
	}
}
