package soa.jaxrslabs.booktrainrestwebserviceexcercice2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "bookTrain")
public class BookTrain {
	
	private String numBook;
	private Train currentTrain;
	private int numberPlaces;
	
	public String getNumBook() {
		return numBook;
	}
	public void setNumBook(String numBook) {
		this.numBook = numBook;
	}
	public Train getCurrentTrain() {
		return currentTrain;
	}
	public void setCurrentTrain(Train currentTrain) {
		this.currentTrain = currentTrain;
	}
	public int getNumberPlaces() {
		return numberPlaces;
	}
	public void setNumberPlaces(int numberPlaces) {
		this.numberPlaces = numberPlaces;
	}

}
