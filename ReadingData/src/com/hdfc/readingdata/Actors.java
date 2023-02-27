package com.hdfc.readingdata;

public class Actors {
	private int age;
	private String name;
	private int numberOfMovies;
	private String firstMovie;

	public Actors(int age, String name, int numberOfMovies, String firstMovie) {
		super();
		this.age = age;
		this.name = name;
		this.numberOfMovies = numberOfMovies;
		this.firstMovie = firstMovie;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfMovies() {
		return numberOfMovies;
	}

	public void setNumberOfMovies(int numberOfMovies) {
		this.numberOfMovies = numberOfMovies;
	}

	public String getFirstMovie() {
		return firstMovie;
	}

	public void setFirstMovie(String firstMovie) {
		this.firstMovie = firstMovie;
	}

	@Override
	public String toString() {
		return "Actors [age=" + age + ", name=" + name + ", numberOfMovies=" + numberOfMovies + ", firstMovie="
				+ firstMovie + "]";
	}

	
	

}
