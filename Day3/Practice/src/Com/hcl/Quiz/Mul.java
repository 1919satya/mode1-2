package Com.hcl.Quiz;

public class Mul { 
		
		private static final String and = null;


		static String intToNumber(int num) 
		{ 
			String m[] = {" ", "thousand", "twothousand", "threethousand",
					"fourthousand","fivethousand","sixthousand","seventhousand",
					"eightthousand","ninethousand","tenthousand"}; 
			String t[] = {" "," oneHundred","twohundred","threehundred","fourhundred"
					,"fivehundred","sixhundred","sevenhundred ","eighthundred",
					"ninehundred "}; 
            String r[] = {" ","ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", 
					"eighty", "ninty"}; 
			String i[] = {" "," one ", " two ", " three ", " four "," five "," six "," seven "," eigth ",
					" nine "}; 
			
			
			String thousands = m[num/1000]; 
			String hundereds = t[(num%1000)/100]; 
			String tens = r[(num%100)/10]; 
			String ones = i[num%10]; 
				
			String ans = thousands+" " + hundereds +" "+ tens + ones; 
				
			return ans; 
		} 
		
		
		public static void main(String []args) 
		{ 
			int number = 127;
					
			System.out.println(intToNumber(number)); 
			
		} 

	} 


