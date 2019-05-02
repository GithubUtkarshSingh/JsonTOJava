package com.nt.Prat;

import org.codehaus.jackson.map.ObjectMapper;

public class Test 
{
	public static void main(String[] args)
	{
		
		String json="{\"empId\":10,\"empName\":\"AVG\",\"empSal\":2.3}";		
	try
	{
		ObjectMapper om=new ObjectMapper();
		Demo d=om.readValue(json,Demo.class);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
