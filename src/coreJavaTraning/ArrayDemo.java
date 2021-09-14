package coreJavaTraning;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];//declare an array and allocate memory to that array
		a[0]=1;
		a[1]=22;
		a[2]=3;
		a[3]=42;
		a[4]=51;
		
		int b[]= {10,2,34,54,6};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
