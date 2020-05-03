package clases;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Path("InfoService") //esta ruta indica la clase a la que se accedera
public class Service {

	@GET 	//se indica el tipo del metodo que determina como se recibe la informacion en este caso es get
	@Path("/saludo/name={nombre}")	//la ruta que se indica para llamar al metodo y la estructura para mandar los parametros
	@Produces(MediaType.APPLICATION_JSON)
	public String saludo (@PathParam("nombre") String nombre){
		//ArrayList<Curso> ListaCursos = new ArrayList<Curso>();
		Curso curso1 = new Curso(1, "Java Desde 0", "https://edteam-media.s3.amazonaws.com/courses/original/50668a3f-3a6e-4e24-80ff-dd5bea441559.jpg", "120", "AA");
		Curso curso2 = new Curso(2, "PHP Desde 0", "https://edteam-media.s3.amazonaws.com/courses/original/50668a3f-3a6e-4e24-80ff-dd5bea441559.jpg", "120", "BB");
		Curso curso3 = new Curso(3, "GO Desde 0", "https://edteam-media.s3.amazonaws.com/courses/original/50668a3f-3a6e-4e24-80ff-dd5bea441559.jpg", "120", "CC");
		Curso curso4 = new Curso(4, "SEO Desde 0", "https://edteam-media.s3.amazonaws.com/courses/original/50668a3f-3a6e-4e24-80ff-dd5bea441559.jpg", "1211", "DD");
		//ListaCursos.add(curso1 );
		//ListaCursos.add(curso2);
		//ListaCursos.add(curso3);
		//ListaCursos.add(curso4);
		Gson gson = new Gson();
		String gsonString = gson.toJson(curso1);
		//Curso c = gson.fromJson( gsonString,Curso.class);
		//String json = new Gson().toJson(curso1);
	        
		return gsonString;
	}
	

	@GET
	@Path("/suma/n1={valorn1}&n2={valorn2}")
	@Produces(MediaType.TEXT_XML)
	public String suma(@PathParam("valorn1") int n1,@PathParam("valorn2") int n2){
		return "El suma de "+n1 +"+"+n2+" es "+(n1+n2);
	}
}
