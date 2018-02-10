package testNG_framework;

import org.testng.annotations.Test;

public class ExpectedException {
	@Test(/*expectedExceptions =ArrayIndexOutOfBoundsException.class,*/invocationTimeOut = 1000)
	public void test_data(){
		int a[] = {10,20,30,40,50};
		int i =0;
		while( i == 0){
			System.out.println(a[i]);
		}
	}

}
