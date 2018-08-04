
class Printer {
	public void print(Paper p) {
	
	p.setText("get lost");
}
}

class Paper{
	String text;
	public void setText(String t) {
		t= text;
		
	}
	public String getText() {
		
		return "text";
	}
	
}



public class MainClass {
 public static void main(String[] args) {
	 Paper p = new Paper();
	 p.setText("crapcrap");
  System.out.println(p.getText());
	 Printer pr = new Printer();
	 pr.print(p);
	 System.out.println(p.getText());
	
}

}
