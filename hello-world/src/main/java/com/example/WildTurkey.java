package com.example;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("WildTurkey: gobble, gobble!");
		
	}

	@Override
	public void fly() {
		System.out.println("I am a flying Wild Turkey!");
	}

}