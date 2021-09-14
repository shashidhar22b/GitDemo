package coreJavaTraning;

public class ExceptionDemo {
	
	//one try can followed by multiple catch block

	public static void main(String[] args) {
		int a =4;
		int b=7;
		int c=0;
		
		try 
		{
			//int k=b/c;
			int arr[] = new int[5];
			
				System.out.println(arr[7]);
			
			
		}
		
		catch(ArithmeticException ed)
		{
			System.out.println("i catch Arithmetic Exception");
		}
		
		
		catch(IndexOutOfBoundsException ef)
		{
			System.out.println("Index Out Of Bounds Exception");
		}
		
		//irrespective of exception thrown or not
		finally
		{
			System.out.println("delete cookies");
		}
		// TODO Auto-generated method stub

	}

}
