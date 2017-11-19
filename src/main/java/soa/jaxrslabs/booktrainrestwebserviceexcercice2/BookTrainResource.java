package soa.jaxrslabs.booktrainrestwebserviceexcercice2;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/books")
public class BookTrainResource {

	public BookTrainResource() {
	}
	
	@GET
	@Produces("application/xml")
	public Response getBookTrains() {
		return Response
				.status(Status.OK)
				.entity("<books>" + BookTrainBD.getBookTrains() + "</books>")
				.build();
	}
	
	@POST
	//@Produces("application/xml")
	public Response createBookTrain(@QueryParam("numTrain") String numTrain, @QueryParam("numberPlaces") int numberPlaces) {
		Train train = Train.getTrainByNumTrain(numTrain);
		
		BookTrain bookTrain = new BookTrain();
		bookTrain.setCurrentTrain(train);
		bookTrain.setNumberPlaces(numberPlaces);
		bookTrain.setNumBook(Long.toString(System.currentTimeMillis()));
		
		if (train != null && numberPlaces != 0) {
			BookTrainBD.getBookTrains().add(bookTrain);
		}
		
		return Response
				.status(Status.OK)
				.entity(bookTrain.getNumBook())//.entity("<books> Book number : " + bookTrain.getNumBook() + ", Train : " + bookTrain.getCurrentTrain().getNumTrain() + ", Nombre de places : " + bookTrain.getNumberPlaces() + "</books>")
				.build();
	}
	
	

}
