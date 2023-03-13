package org.tes;

import org.testng.annotations.Test;

public class A {

	@Test(dataProvider="Amazon data",dataProviderClass = A.class)
	private void tc33(String data) {
		System.out.println(data);

	}
	@Test
	private void tc11() {
		System.out.println("Test Case 11");

	}
	@Test
	private void tc22() {
		System.out.println("Test Case 22");

	}

}
