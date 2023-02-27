package com.hdfc.readingdata;

public class ActorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Actors actors = new Actors(51, "Pawan Kalyan", 27, "AMIA");
		System.out.println(actors.getAge()+" "+actors.getName()+ " "+actors.getNumberOfMovies()+ " "+actors.getFirstMovie());
		System.out.println(actors.toString());
		Actors actors1 = new Actors(47, "Mahesh Babu", 28, "RajaKumarudu");
		System.out.println(actors1.getAge()+" "+actors1.getName()+ " "+actors1.getNumberOfMovies()+ " "+actors1.getFirstMovie());
		//System.out.println(actors1.toString());
		Actors actors2 = new Actors(43, "Prabhas", 20, "Eshwar");
		System.out.println(actors2.getAge()+" "+actors2.getName()+ " "+actors2.getNumberOfMovies()+ " "+actors2.getFirstMovie());
		//System.out.println(actors2.toString());
		Actors actors3 = new Actors(37, "RamCharan", 14, "Chirutha");
		System.out.println(actors3.getAge()+" "+actors3.getName()+ " "+actors3.getNumberOfMovies()+ " "+actors3.getFirstMovie());
		
		
		
		
		
		
		

	}

}
