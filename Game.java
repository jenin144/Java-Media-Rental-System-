package application;

public class Game extends Media {

	private String Weight;

	public Game(String code ,String title, int numOfCopies,String Weight) {
		super(code,title, numOfCopies);
		this.Weight=Weight;
	}

	public String getWeight() {
		return Weight;
	}


	public void setWeight(String Weight) {
		this.Weight = Weight;
	}

	@Override
	public String toString() {
		return "Game [  code =" + getCode()   + ",Title =" + getTitle()   + ", NumOfCopies=" +  getNumOfCopies() + " Weight=" + Weight + "]";
	}

	

}
