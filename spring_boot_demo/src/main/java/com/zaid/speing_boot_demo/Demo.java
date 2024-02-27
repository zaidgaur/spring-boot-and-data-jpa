package com.zaid.speing_boot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Autowired
	Demo2 demo;
	public void m1() {
		demo.m2();
		System.out.println("m1 method of demo class starts executing");
	}

}
