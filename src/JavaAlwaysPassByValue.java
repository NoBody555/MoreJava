
public class JavaAlwaysPassByValue {
	
	
		
			
		
		public static void main(String[] args) {
			
			Person pr = new Person("John", 21); //pr holds the address of the actual data(john,21) not the value itself.
			//we passed actual data here is (john,21) suppose it'a address is 1234
			//pr  stores address i.e 1234 of actual data(john,21) we passed as  its value,for example address 1234(stores inside it as a value, value = 1234)...
			//... so the address that stored in pr as a value pointing to the actual data. in short, it pointing to the data by storing it address as its value
			
			
			Person pr2;
			//pr2 =pr : means pr2 now also stores the value of the pr (i.e 1234) as  its value inside it, thus both pr and pr2 store same address  as their values
			//pointing to the same data(john,21).  note pr2 is not pointing to pr1,but rather to where the actual data is. 
			//changes made to the data will reflect in the both,pr and pr2.
			pr2 = pr;
		   pr2.changeDetails("Alex",99);// data is changed in both and not their values(1234 i.e address of actual data).
			System.out.println(pr);
			System.out.println(pr2);
			
		
		
	}

}
