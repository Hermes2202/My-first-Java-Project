
public class TankiMoiKoordinati {

	public static void main(String[] args) {
		System.out.println(getQuadrantXY("a","1"));
		System.out.println(getQuadrantXY("a","2"));
		
		System.out.println(getQuadrantXY("b","2"));
		System.out.println(getQuadrantXY("d","5"));
		
		System.out.println(getQuadrantXY("f","8"));
		System.out.println(getQuadrantXY("i","9"));
	//risuem koordinaty	
		System.out.println(printCoordinatesXY("a","1"));
		System.out.println(printCoordinatesXY("a","2"));
		
		System.out.println(printCoordinatesXY("b","2"));
		System.out.println(printCoordinatesXY("d","5"));
		
		System.out.println(printCoordinatesXY("f","8"));
		System.out.println(printCoordinatesXY("i","9"));
	}
	static String printCoordinatesXY(String v, String h){
int har = Integer.valueOf(h);
		
		int vert =1;
		if (v.equals("b")){
			vert = 2;
		}else if(v.equals("c")){
			vert = 3;
		}else if(v.equals("d")){
			vert = 4;
		}else if(v.equals("e")){
			vert = 5;
		}else if(v.equals("f")){
			vert = 6;
		}else if(v.equals("g")){
			vert = 7;
		}else if(v.equals("h")){
			vert = 8;
		}else if(v.equals("i")){
			vert = 9;	
			}
		
		return (vert-1) * 64 +"_"  + (har-1) * 64;	
		}
		
	static String getQuadrantXY(String v,String h) {
		int har = Integer.valueOf(h);
		
		int vert =1;
		if (v.equals("b")){
			vert = 2;
		}else if(v.equals("c")){
			vert = 3;
		}else if(v.equals("d")){
			vert = 4;
		}else if(v.equals("e")){
			vert = 5;
		}else if(v.equals("f")){
			vert = 6;
		}else if(v.equals("g")){
			vert = 7;
		}else if(v.equals("h")){
			vert = 8;
		}else if(v.equals("i")){
			vert = 9;	
			}
		
		return (vert-1) * 64 +"_"  + (har-1) * 64;	


	}

}
