
public class TestClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		boolean bool1=true;
		boolean bool2=false;
		boolean bool=false;
		bool = (bool2 & method1("1"));
		bool = (bool2 && method1("2"));
		bool = (bool1 | method1("3"));
		bool = (bool1 || method1("4"));
		
	}
		public static boolean method1(String str)
		{
			System.out.println(str);
			return true;
		}
}
