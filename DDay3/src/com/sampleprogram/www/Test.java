package com.sampleprogram.www;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		char[] array = {'A','B','C'};
		List arrayList = new ArrayList<>();
		for(char element : array ) {
			arrayList.add(element);
		}
		for(Object element : arrayList) {
			System.out.println(element);			
		}
	}

}
