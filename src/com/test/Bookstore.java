package com.test;

class Bookstore {

	public static Categories categories;

// Define this recursive function
	public static int countBooks(Categories categories) {
		int c = 0;
		for (Category category : categories) {
			c += category.numberOfBooks;
			c += countBooks(category.subCategories);
		}
		return c;
	}

	public static void main(String[] args) {
// Call this recursive function
		Category c1 = new Category();
		c1.numberOfBooks = 3;
		Category c2 = new Category();
		c2.numberOfBooks = 2;
		Category c3 = new Category();
		c3.numberOfBooks = 10;
		Categories subc1 = new Categories();
		subc1.add(c3);
		c1.subCategories = subc1;

		categories = new Categories();
		categories.add(c1);
		categories.add(c2);

		int numberOfBooks = countBooks(Bookstore.categories);
		System.out.println("The bookstore has " + numberOfBooks + " books");
	}
//git test change
}

