package clases;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;

/**
 * Endpoint del servicio Rest:
 * 		http://localhost:8080/WebServiceRest/restService/InfoService/getCurso/id=1
 * 		http://localhost:8080/WebServiceRest/restService/InfoService/getAllCursos
 * 
 * @author sangello
 *
 */

@Path("InfoService") //esta ruta indica la clase a la que se accedera
public class Service {
	CursoDao cursoDao;
	
	@GET 	//se indica el tipo del metodo que determina como se recibe la informacion en este caso es get
	@Path("/getCurso/id={id}")	//la ruta que se indica para llamar al metodo y la estructura para mandar los parametros
	@Produces(MediaType.APPLICATION_JSON)
	public String getCurso (@PathParam("id") int id){
		cursoDao = new CursoDao();
		Gson gson = new Gson();
	        
		return gson.toJson(cursoDao.getIdCurso(id+1));
	}
	
	@GET 	//se indica el tipo del metodo que determina como se recibe la informacion en este caso es get
	@Path("/getAllCursos")	//la ruta que se indica para llamar al metodo y la estructura para mandar los parametros
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllCursos (){
		cursoDao = new CursoDao();
		Gson gson = new Gson();
		
	        
		return gson.toJson(cursoDao.getAllCursos());
	}

	/**
	 * otro ejemplo que se puede utilizar
		@GET
		@Path("/suma/n1={valorn1}&n2={valorn2}")
		@Produces(MediaType.TEXT_XML)
		public String suma(@PathParam("valorn1") int n1,@PathParam("valorn2") int n2){
			return "El suma de "+n1 +"+"+n2+" es "+(n1+n2);
		}
	*/
}
