package com.example.demo;

import com.example.demo.services.Calculate;
import com.example.demo.services.UsingLamdas;

public class Application {
	
	public static Runnable getLambda(int start,int end)
	{
		Runnable target= ()->
		{
			for(int j=start;j<end;j++)
				System.out.println(j);
		};
		return target;
	}
public static void main(String[] args)
{
	UsingLamdas.usingAnnonymousClass();
	UsingLamdas.usingLambda();
	Runnable target=() ->
	{
		for(int j=10;j<15;j++)
			System.out.println(j);
	};
	UsingLamdas.passingLambda(target);
	Runnable target2=getLambda(20,25);
	UsingLamdas.passingLambda(target2);
	Calculate<Double, Double> lambda =(dlrAmt)-> dlrAmt*100;
	System.out.println(lambda.apply(450d));
	System.out.println(lambda.offer());
}
}
