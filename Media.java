package application;

	
	public abstract class  Media extends MediaRental implements Comparable<Media> {
		  private String code;
		private String title;
		   private int numOfCopies;

		 
		   public Media(String code ,String title, int numOfCopies) {
			   this.code=code;
		       this.title = title;
		       this.numOfCopies = numOfCopies;
		   }

		   public String getCode() {
			return code;
		}

		public String getTitle() {
		       return title;
		   }

		 
		   public int getNumOfCopies() {
		       return numOfCopies;
		   }

		  
		   public void setTitle(String title) {
			this.title = title;
		}

		public void setNumOfCopies(int numOfCopies) {
			this.numOfCopies = numOfCopies;
		}
		   /**
		    * compares the media by their codes
		    */
		@Override
		   public int compareTo(Media o) {
		          if (this.code.compareTo(o.code) >0)

		        	 
	                    return 1;

	            else if (this.code.compareTo(o.code) <0)

	                    return -1;

	            return 0;
		   }

		@Override
		public abstract String toString() ;

		
		     
		   
		}


