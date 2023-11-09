package com.coderscampus.arraylist;


public class CustomArrayListApp {

	public static void main(String[] args) {
		CustomList<String> myList = new CustomArrayList<>();
		myList.add("Milk");
		myList.add("Eggs");
		myList.add("Bread");
		myList.add("Butter");
		myList.add("Cheese");
		myList.add("Oranges");
		myList.add("Bananas");
		myList.add("Tomatoes");
		myList.add("Dr.Pepper");
		myList.add("Tea");
		myList.add("Formula");
		myList.add("Diapers");
		myList.add("Wipes");
		myList.add("Onions");
		myList.add("Potatoes");
		myList.add("Cereal");
		myList.add("Lettuce");
		myList.add("Meat");
		myList.add("Sour Cream");
		myList.add("Taco Boats");
		myList.add("Pasta");
		myList.add("Spaghetti Sauce");
		myList.add("Lunchables");
		myList.add("Munchies");
		System.out.println(myList);
		System.out.println(myList.get(21));
		System.out.println(myList.getSize());

	}

}