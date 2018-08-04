
public class Complexnumbers {

	
	int x;
	int y;
	Complexnumbers(){}
	
	Complexnumbers(int x, int y){
		
		this.x =x;
		this.y=y;
		
	}
	
	Complexnumbers addcomplexno(Complexnumbers o, Complexnumbers p) {
		
		
		Complexnumbers cn2 = new Complexnumbers();
		
	                 cn2.x=o.x+p.x; 
	                  cn2.y=o.y+p.y;
		
		return cn2;
		
		
		
	}
	      
	
	public static void main(String[] args) {
		
	

		
        Complexnumbers cn = new Complexnumbers(5,9);
		Complexnumbers cn1 = new Complexnumbers(9,9);
		//cn.addcomplexno(cn, cn1);
		//Complexnumbers cn2 = new Complexnumbers();
		//cn2 = cn2.addcomplexno(cn, cn1);
		//System.out.println(cn2.x+ "  "+ cn2.y+" imaginery");
		
		//cn1=cn1.addcomplexno(cn, cn1);
		//System.out.println(cn1.x+ " " + cn1.y+ " imaginery");
		cn= cn.addcomplexno(cn, cn1);
		
		System.out.println(cn.x+ " " + cn.y+ " imaginery");
	}
}
