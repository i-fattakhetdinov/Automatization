package com.company;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeClassTest {
	@Test
	public void factorialTest1 () { 
		Assert.assertEquals(6, SomeClass.factorial(3));
	}
	@Test
	public void factorialTest2 () { 
		Assert.assertEquals(24, SomeClass.factorial(4));
	}
	@Test
	public void sumTest1 () { 
		Assert.assertEquals(6, SomeClass.sum(2, 4));
	}
	@Test
	public void sumTest2 () { 
		Assert.assertEquals(13, SomeClass.sum(4, 9));
	}
	@Test
	public void sumMoreThan10Test1 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(1, 10));
	}
	@Test
	public void sumMoreThan10Test2 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(1, 11));
	}
	@Test
	public void sumMoreThan10Test3 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(2, 10));
	}
	@Test
	public void sumMoreThan10Test4 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(2, 11));
	}
	@Test
	public void sumMoreThan10Test5 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(3, 10));
	}
	@Test
	public void sumMoreThan10Test6 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(3, 11));
	}
	@Test
	public void sumMoreThan10Test7 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(4, 10));
	}
	@Test
	public void sumMoreThan10Test8 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(4, 11));
	}
	@Test
	public void sumMoreThan10Test9 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(5, 10));
	}
	@Test
	public void sumMoreThan10Test10 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(5, 11));
	}
	@Test
	public void sumMoreThan10Test11 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(6, 10));
	}
	@Test
	public void sumMoreThan10Test12 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(6, 11));
	}
	@Test
	public void sumMoreThan10Test13 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(7, 10));
	}
	@Test
	public void sumMoreThan10Test14 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(7, 11));
	}
	@Test
	public void sumMoreThan10Test15 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(8, 10));
	}
	@Test
	public void sumMoreThan10Test16 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(8, 11));
	}
	@Test
	public void sumMoreThan10Test17 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(9, 10));
	}
	@Test
	public void sumMoreThan10Test18 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(9, 11));
	}
	@Test
	public void sumMoreThan10Test19 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(10, 10));
	}
	@Test
	public void sumMoreThan10Test20 () { 
		Assert.assertEquals(true, SomeClass.sumMoreThan10(10, 11));
	}
	@Test
	public void sumMoreThan10Test21 () { 
		Assert.assertEquals(false, SomeClass.sumMoreThan10(1, 1));
	}
	@Test
	public void sumMoreThan10Test22 () { 
		Assert.assertEquals(false, SomeClass.sumMoreThan10(1, 2));
	}
	@Test
	public void sumMoreThan10Test23 () { 
		Assert.assertEquals(false, SomeClass.sumMoreThan10(1, 3));
	}
	@Test
	public void sumMoreThan10Test24 () { 
		Assert.assertEquals(false, SomeClass.sumMoreThan10(1, 4));
	}
	@Test
	public void sumMoreThan10Test25 () { 
		Assert.assertEquals(false, SomeClass.sumMoreThan10(1, 5));
	}
	@Test
	public void sumMoreThan10Test26 () { 
		Assert.assertEquals(false, SomeClass.sumMoreThan10(2, 1));
	}
	@Test
	public void sumMoreThan10Test27 () { 
		Assert.assertEquals(false, SomeClass.sumMoreThan10(2, 2));
	}
	@Test
	public void sumMoreThan10Test28 () { 
		Assert.assertEquals(false, SomeClass.sumMoreThan10(2, 3));
	}
	@Test
	public void sumMoreThan10Test29 () { 
		Assert.assertEquals(false, SomeClass.sumMoreThan10(2, 4));
	}
	@Test
	public void sumMoreThan10Test30 () { 
		Assert.assertEquals(false, SomeClass.sumMoreThan10(2, 5));
	}
	@Test
	public void isSummerMonthTest1 () { 
		Assert.assertEquals(true, SomeClass.isSummerMonth("June"));
	}
	@Test
	public void isSummerMonthTest2 () { 
		Assert.assertEquals(false, SomeClass.isSummerMonth("October"));
	}
}