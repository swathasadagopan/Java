
public class StringTask {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Hello World";
		String s3=" Hello Everyone ";
		String s4="HappyWorld";		
		String s5="Happy everyone happy worldy";
		String s6="happy/world/happy";
		String s7="Happy birthday Tom";
		String s8="hello";
		
		StringTask st=new StringTask();
		System.out.print("Reverse String: ");
		st.getreverse("Tomjerry");
		
		
//compare 2 strings
		if(s1.equals(s2)){
			System.out.println("");
		 	System.out.println("The String is equal");
		}
		 	else 
		 	{
		 		System.out.println("The String is not equal");
		 	}
		
//Remove spaces
		System.out.print("Remove spaces: ");
		System.out.println(s3.trim().replace(" ",""));
	

//To print the 1st and last character of the word
		int s =s4.length();
		System.out.print("The first word is :");
		System.out.println(s4.charAt(0));
		System.out.print("The last word is :");
		System.out.println(s4.charAt(s-1));
		
//verify the word in a sentence
		System.out.print("The word contains :");
		System.out.println(s2.contains("World"));
		
//SubString
		System.out.print("Substring: ");
		System.out.println(s3.substring(s3.indexOf("Everyone"),s3.length()));
//Index (-1)
		System.out.print("Index: ");
		System.out.println(s5.indexOf("hello")); 
//3rd 'y' of a string

		int s0=s5.indexOf("y",s5.indexOf("y")+1);
		System.out.print("3rd Occurrence :");
		System.out.println(s5.indexOf('y',s0+1));
		
//split
		String d[]= s6.split("/");
		System.out.print("Split: ");
		for(int i=0;i<d.length;i++) {
			System.out.print( d[i]);
		}
//Print the middle word
		System.out.println("");
		System.out.print("Middle word :");
		System.out.print(s7.split(" ")[1]);
	}
//Method to reverse name
	
		public void getreverse(String n) 
		{
			
			for(int i=n.length()-1;i>=0;i--) {
				System.out.print(n.charAt(i));
			}
	
			
	}

	}
	

