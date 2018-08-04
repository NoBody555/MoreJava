
public class ChildDome extends Parentdome {
	String name =   "amjapa";
	
	public ChildDome() {
		
		super();//it must be always in the first line
		System.out.println("child constructor without any arguments");
	}
	public void getName() {
		
		System.out.println(" Child's local method "+name);
		System.out.println(super.name);
		super.getName();
	}
	// uncommentto see the example of runtime polymorphism
	/*public void getScore() {
		System.out.println("new score is child dome");
	} 
	*/
	public static void main(String[] args) {
		  //cannot instantiate parentdome since it declared as an abstract remove comment from below step and see
		//Parentdome pdc = new Parentdome();
		//ChildDome cd = new ChildDome();
		//cd.getName();
		Parentdome pd = new ChildDome();
		pd.getName();
		pd.getScore();
		
	}

}
