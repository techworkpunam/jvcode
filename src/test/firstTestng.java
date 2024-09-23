package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class firstTestng 
{
	@Test
	public void day1()
	{
		System.out.println();
	}
	
	@Parameters({"URL","URLZ"})
	@Test(groups= {"cogs"})
	public void day2(String url,String urlz)
	{
		System.out.println("cog");
		System.out.println(url);
		System.out.println(urlz);
	}
	
	
	
	
}
