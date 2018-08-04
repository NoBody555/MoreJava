
public class Mycrap {
	
	public static void main(String[] args) {
		
		/*String [][][] listOfWords=
              { { { "Random" }, { "Classic" }, { "Nice" }, { "Outcast" } },
			  { { "Temper" }, { "Vex" }, { "Prejudice" }, { "Pessimistic" } } ,
			    { { "weight" }, { "light" }, { "Dim" }, { "Tempo" }},
			    { { "Single" }, { "Unit" }, { "Nature" }, { "While" }
			    
			    }};
		int [][] a = new int[10][10];
		for(int i=0; i<10;i++){

		    for(int j=0; j<10; j++){
		    //System.out.printf("- ",a[i][j]);
            System.out.printf(" - "+ "\t");
           // System.out.printf("-"+"\t");
		      }
		    System.out.println("");
		}*/
		
		String[][][] arrayName = { { { "000" }, { "100" }, { "200" }, { "300" } },
			     { { "010" }, { "110" }, { "210" }, { "310" } }, 
				 { { "020" }, { "120" }, { "220" }, { "320" } }};
		
		for(int i = 0; i < arrayName.length; i++)
		{
			for(int j = 0; j < arrayName[i].length; j++)
			{
				
				for(int k = 0; k < arrayName[i][j].length; k++)
				{
					System.out.print("| " + arrayName[i][j][k] + " ");
					
				}
			}
			
			System.out.println("|");
			
		}
	}

}
