package main;

import java.util.Arrays;

import main.animals.Pig;
import main.service.FileService;

public class FarmerAlBaryardInventoryApplicationTwo {

	public static void main(String[] args) {
		
		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile();
		String[] pigNames = new String[4];
		
		// not in alphabetical order
		pigNames[0] = "Corkey";
		pigNames[1] = "Penny";
		pigNames[2] = "Bartholomew";
		pigNames[3] = "Rocky";
		
		// CANNOT SORT YET //
		
//		// for testing
//		 for (Pig pig : pigs) {
//			System.out.println(pig.getName());
//			System.out.println(pig.getStatus());
//		}
//		//
		
		
		for (int i = 0; i <= 3; i++) {
			pigNames[i] = pigs[i].getName();
		}
		
		// NOW WE CAN //
		
		Arrays.sort(pigs);
		for (Pig pig : pigs) {
			System.out.println(pig.getName());
		}
		// The Pig objects have been sorted in the manner described and
		// their names retrieved in ascending order! Exercise complete!
	}

}
