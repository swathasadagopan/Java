
public class StringTest {

	public static void main(String[] args) {
		String test="xXJavaXxXpythonxXrubyxXSelenium";
		String val[] = test.split("xX");
		//System.out.println(val[2]);
		for(int i=0;i<val.length;i++)
		{
			System.out.println(val[i]);
		}
		
		String str = "this is my java code and i am so happy";
		int a=str.indexOf("s", str.indexOf("s")+1);
		System.out.println(a);
		int b = str.indexOf("s",str.indexOf(a)+1);
		System.out.println(str.indexOf("s", a+1));
		int c=str.indexOf("s", a+1);
		System.out.println(c);

	}

}
