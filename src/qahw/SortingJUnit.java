package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortingJUnit {
//單元測試
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void exchange_sort() {
		Sorting s=new Sorting();
		int a[]={5,2,4,3,1}; //任意陣列
		int expect[]={1,2,3,4,5}; //預設結果
		int result[]=s.exchangeSort(a,true); //實際結果
				
		assertArrayEquals(expect, result);//驗證陣列內容


		//fail("Not yet implemented");
	}

}
