
class Complex
{
int Real,Imag;
Complex()
{}
Complex(int Real1,int Imag1)
{
Real=Real1;
Imag=Imag1;
}
Complex AddComplex(Complex C1,Complex C2)
{
Complex CSum=new Complex();
CSum.Real=C1.Real+C2.Real;
CSum.Imag=C1.Imag+C2.Imag;
return CSum;
}
}
 
/*class Complexmai
{
public static void main(String[] a)
{
Complex C1=new Complex(4,8);
Complex C2=new Complex(5,7);
Complex C3=new Complex();
C3=C3.AddComplex(C1,C2);
System.out.println("Real SUM: " + C3.Real + "Imaginary SUM: " + C3.Imag);
}
}*/