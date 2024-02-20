package  application;

public class Album extends Media  {
		   private String artist;
		   private String songs;

		   public Album(String code ,String title, int numOfCopies, String artist, String songs) {
		       super(code,title, numOfCopies);
		       this.artist = artist;
		       this.songs = songs;
		   }

		   
		   public void setArtist(String artist) {
			this.artist = artist;
		}


		public void setSongs(String songs) {
			this.songs = songs;
		}


		public String getArtist() {
		       return artist;
		   }

		   public String getSongs() {
		       return songs;
		   }


		@Override
		public String toString() {
			return "Album [  code =" + getCode()   + ",Title =" + getTitle()   + ", NumOfCopies=" +  getNumOfCopies() + ", artist =" + artist + ", songs ="
					+ songs + "]";
		}

	


		

		  
		   
		}



