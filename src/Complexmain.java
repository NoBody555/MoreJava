
public class Complexmain {

	public static void main(String[] a)
	{
	Complex C1=new Complex(4,8);
	Complex C2=new Complex(5,7);
	Complex C3=new Complex();
	C3=C3.AddComplex(C1,C2);
	System.out.println("Real SUM:" + C3.Real +" Imaginary Sum: " + C3.Imag);
	}
	}
	

