package com.learn.ArrayDeque;

import java.util.*;
public class program1 {
	public static void main(String [] args)
	{
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20.5);
		ad.add("JAVA");
		ad.add(true);
		ad.add('K');
		System.out.println(ad);
	}
}
