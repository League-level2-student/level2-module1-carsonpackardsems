package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> mounts = new ArrayList<String>();
		//2. Add five Strings to your list
		mounts.add("Taco");
		mounts.add("Jumbo");
		mounts.add("Quakko");
		mounts.add("Makko");
		mounts.add("Epona");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < mounts.size(); i++) {
			System.out.println(mounts.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String s : mounts) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int ii = 0; ii < mounts.size(); ii++) {
			if(ii%2 <= 0) {
				System.out.println(mounts.get(ii));
			}
		}
		//6. Print all the Strings in reverse order.
		for(int iii = 0; iii < mounts.size(); iii++) {
			int retainer = iii + 1;
			int reverse = mounts.size() - retainer;
			System.out.println(mounts.get(reverse));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println(mounts.get(4));
	}
}

