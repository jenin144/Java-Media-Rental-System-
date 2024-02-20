package application;

import java.util.ArrayList;

import java.util.*;

public class MediaRental implements MediaRentalInt {
	private ArrayList<Customer> customers;
	private ArrayList<Media> media;

	public MediaRental() {
		this.customers = new ArrayList<Customer>();
		this.media = new ArrayList<Media>();

	}

	public void addCustomer(String id, String name, String mobile, String address, String plan) {
		int counter = 0;
		for (Customer c : customers) {
			if (c.getId().equals(id))
				counter++;
		}
		if (counter == 0)
			customers.add(new Customer(id, name, mobile, address, plan));
	}

	public void deleteCustomer(String id, String name, String mobile, String address, String plan) {
		for (Customer c : customers) {

			if (c.getId().equalsIgnoreCase(id)) {

				customers.remove(c);

			}
		}

	}

	public void deleteMedia(String code) {
		for (Media m : media) {
			if (m.getCode().equalsIgnoreCase(code)) {

				media.remove(m);
			}
		}
	}

	public void addMovie(String code, String title, int copiesAvailable, String rating) {
		int counter = 0;
		for (Media c : media) {
			if (c.getCode().equals(code))
				counter++;
		}
		if (counter == 0)
			media.add(new Movie(code, title, copiesAvailable, rating));
	}

	public void addGame(String code, String title, int copiesAvailable, String Weight) {
		int counter = 0;
		for (Media c : media) {
			if (c.getCode().equals(code))
				counter++;
		}
		if (counter == 0)

			media.add(new Game(code, title, copiesAvailable, Weight));

	}

	public void addAlbum(String code, String title, int copiesAvailable, String artist, String songs) {
		int counter = 0;
		for (Media c : media) {
			if (c.getCode().equals(code))
				counter++;
		}
		if (counter == 0)
			media.add(new Album(code, title, copiesAvailable, artist, songs));
	}

	public void setPlanLimit(int value) {
		for (Customer c : customers) {

			c.setMediaLimit(value);
		}
	}

	public String getAllCustomersInfo() {

		Collections.sort(customers);
		String customerInfo = " Customers' Information \n";
		for (int i = 0; i < customers.size(); i++) {
			customerInfo += customers.get(i).toString() + "\n";
		}

		return customerInfo;
	}

	public String getAllMediaInfo() {
		String mediaInfo = "";
		Collections.sort(media);

		for (int i = 0; i < media.size(); i++) {
			mediaInfo += media.get(i).toString() + "\n";
		}

		return mediaInfo;
	}

	public boolean addTocart(String id, String code) {

		for (Media m : media) {
			if (m.getCode().equals(code)) {

				for (Customer c : customers) {
					if (c.getId().equals(id)) {
						if (c.getinterestedcart().contains(code)) {
							return false;
						} else {
							c.getinterestedcart().add(code);
							c.getinterestedcart2().add(" Media code:  " + code + " Media title :  " + m.getTitle());

							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean removeFromcart(String id, String code) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getId() == id) {
				customers.get(i).getinterestedcart().remove(code);
				return true;
			}
		}

		return false;

	}

	public boolean returnMedia(String id, String code) {
		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				for (Media m : media) {
					if (m.getCode().equals(code)) {
						c.getRented().remove(code);
						c.setMediaLimit(c.getMediaLimit() + 1);
						m.setNumOfCopies(m.getNumOfCopies() + 1);

						return true;
					}
				}
			}
		}
		return false;
	}

	public void processRequests() {

		Collections.sort(customers);

		Collections.sort(customers);
		for (Customer c : customers) {
			for (Media m : media) {

				if (c.getPlan().equalsIgnoreCase("unlimited")) {

					if (c.getinterestedcart().contains(m.getCode())) {
						if (m.getNumOfCopies() > 0) {
							c.getRented().add(m.getCode());
							m.setNumOfCopies(m.getNumOfCopies() - 1);
							c.getRented().add(" Sending " + m.getTitle() + " to " + c.getName() + "\n");
						}
					}
				}

				else if (c.getPlan().equalsIgnoreCase("limited")) {
					if (c.getinterestedcart().contains(m.getCode())) {

						if (c.getMediaLimit() > 0) {
							if (m.getNumOfCopies() > 0) {

								c.getRented().add(m.getCode());
								m.setNumOfCopies(m.getNumOfCopies() - 1);
								c.setMediaLimit(c.getMediaLimit() - 1);
								c.getRented().add(" Sending " + m.getTitle() + " to " + c.getName() + "\n");

							}
						}
					}
				}

			}
		}

	}

	public ArrayList<String> searchMedia(String code) {

		ArrayList<String> sorted = new ArrayList<java.lang.String>();
		for (Media m : media) {
			if (m.getCode().equalsIgnoreCase(code)) {

				if (m instanceof Movie) {

					sorted.add(m.getCode());
					sorted.add(m.getTitle());
					sorted.add(Integer.toString(m.getNumOfCopies()));
					sorted.add(((Movie) m).getRating());

				} else if (m instanceof Game) {

					sorted.add(m.getCode());
					sorted.add(m.getTitle());
					sorted.add(Integer.toString(m.getNumOfCopies()));
					sorted.add(((Game) m).getWeight());

				}

				else {

					sorted.add(m.getCode());
					sorted.add(m.getTitle());
					sorted.add(Integer.toString(m.getNumOfCopies()));
					sorted.add(((Album) m).getArtist());
					sorted.add(((Album) m).getSongs());

				}

			}
		}

		return sorted;

	}

	public ArrayList<String> searchCustomer(String id) {
		ArrayList<String> s = new ArrayList<>();

		for (Customer c : customers) {

			if (c.getId().equalsIgnoreCase(id)) {

				s.add(c.getName());
				s.add(c.getAddress());
				s.add(c.getMobile());
				s.add(c.getPlan());

			}
		}
		return s;

	}

	public String printcusomerinfo(String id) {
		String s = " ";

		for (Customer c : customers) {

			if (c.getId().equalsIgnoreCase(id)) {

				s += c.toString();

			}
		}
		return s;

	}

	public String printmediainfo(String code) {
		String s = " ";

		for (int i = 0; i < media.size(); i++) {
			if (media.get(i).getCode().equalsIgnoreCase(code))
				s += media.get(i).toString() + "\n";
		}

		return s;

	}

	public ArrayList<String> print(String id, int selection) {
		ArrayList<String> s = new ArrayList<>();

		if (selection == 0) {// interested 0
			for (Customer c : customers) {

				if (c.getId().equalsIgnoreCase(id)) {
					s.add(c.getinterestedcart2().toString());

				}
			}
			return s;

		} else {// rented

			for (Customer c : customers) {

				if (c.getId().equalsIgnoreCase(id)) {
					s.add(c.getRented().toString());

				}
			}
			return s;
		}
	}

	public void updatec(String id, String name, String mobile, String address, String plan) {

		for (Customer c : customers) {

			if (c.getId().equalsIgnoreCase(id)) {

				c.setName(name);
				c.setMobile(mobile);
				c.setAddress(address);
				c.setPlan(plan);

			}
		}
	}

	public void updatem(String code, String title, int numberofcopies, String rating, String weight, String artist,
			String songs) {
		for (Media m : media) {

			if (m.getCode().equalsIgnoreCase(code)) {
				m.setTitle(title);
				m.setNumOfCopies(numberofcopies);
				if (m instanceof Movie)
					((Movie) m).setRating(rating);
				if (m instanceof Game)
					((Game) m).setWeight(weight);

				if (m instanceof Album) {

					((Album) m).setSongs(songs);
					((Album) m).setArtist(artist);

				}

			}
		}
	}

}
