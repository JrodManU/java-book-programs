package com.jrodmanu.dice;

import java.util.Random;

public class Dice {
	
	public static void main(String[] args) {
		Dice dice = new Dice();
		System.out.println(dice.streeeeeeeeeek(100000));
		System.out.println(dice.streeeeeeeeeek(200));
	}

	private int streeeeeeeeeek(int numOfRolls) {
		int current = 0;
		int last = 0;
		int streak = 1;
		int highestStreak = 0;
		Random rand = new Random();
		
		for(int i = 0; i < numOfRolls; i++) {
			current = rand.nextInt(6) + 1;
			if(current == last) {
				streak++;
				if(streak > highestStreak) {
					highestStreak = streak;
				}
			} else {
				streak = 1;
			}
			last = current;
		}
		return highestStreak;
	}
	
}
