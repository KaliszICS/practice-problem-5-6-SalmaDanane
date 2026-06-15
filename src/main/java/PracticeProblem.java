/*

	Author - Salma Danane
	Date created - june 14 2026
	Date last modified - june 15, 2026
	File name - parallel arrays
	

*/ 


public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int getAge(String[] nameslist, int[] age, String name) {
		
		for (int i = 0; i < nameslist.length; i++) {
			
			if (nameslist[i].equalsIgnoreCase(name)) {
				
				return age[i];
			}
		}
		return 0;
	}

	public static int[] createLengthArray(String[] arr) {
		
		int arr2[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr2[i] = arr[i].length();
		}
		return arr2;
	}

	public static void swapPeople(String[] names, int[] ages, String name1, String name2) {
		
		int bob = 0;
		int john = 0; 
		
		for (int i = 0; i < names.length; i++) {
			
			if (names[i].equalsIgnoreCase(name1)) {
				
				bob = i;
				i = names.length;
				
			}
		}

		
		for (int i2 = 0; i2 < names.length; i2++) {
	
			if (names[i2].equalsIgnoreCase(name2)) {
				
				john = i2;
				i2 = names.length;
				
			}
			
		names[bob] = name2;
		names[john] = name1;
		int daage = ages[bob];
		ages[bob] = ages[john];
		ages[john] = daage;
			
		}
		
		
		



	}


}

