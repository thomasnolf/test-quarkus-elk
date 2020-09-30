package fr.tnolf.quarkus;

import org.jboss.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path( "/movies" )
@Consumes( MediaType.APPLICATION_JSON )
@Produces( MediaType.APPLICATION_JSON )
public class MovieResource {

    private static final Logger L = Logger.getLogger(MovieResource.class.getName());

    @GET
    public List<Movie> getAll(){
        List<Movie> movies = Movie.listAll();
	for(Movie m in movies) {
        	L.info(m);
	}
        return movies;
    }

}
