package application;

import java.util.ArrayList;

public interface MediaRentalInt {
	
	   public void addCustomer(String id ,String name, String mobile, String address, String plan);
	   public void deleteCustomer(String id ,String name,String mobile , String address, String plan) ;
	   public ArrayList<String> searchCustomer(String id ) ;
	   public void deleteMedia(String code ) ;


	   public void addMovie(String code ,String title, int copiesAvailable, String rating);
	  
	  
	
	   public void addAlbum(String code ,String title, int copiesAvailable, String artist, String songs);
	  
	  
	  
	   void addGame(String code ,String title, int copiesAvailable,String Weight);

	 
	   public void setPlanLimit(int value);
	  
	  
	 
	   public String getAllCustomersInfo();
	  
	 
	   public String getAllMediaInfo();
	  
	  
	   
	   public boolean addTocart(String id, String code);
	  
	  
	   
	   public boolean removeFromcart(String id, String code);
	  
	  
	   public void processRequests();// kant String w ghetrha l void .
	  
	  
	   public boolean returnMedia(String customerName, String mediaTitle);
	  
	 
	   public ArrayList<String> searchMedia( String code);
	   public   ArrayList<String>  print(String id,int selection );

	
}
