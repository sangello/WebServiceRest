package clases;
import com.google.gson.Gson;

public class Prueba {

	private static Curso cursos;

	public static void main(String[] args) {
		
		//String jsonAll = "{'id':1,'title':'Java Desde 0','image':'https://edteam-media.s3.amazonaws.com/courses/original/50668a3f-3a6e-4e24-80ff-dd5bea441559.jpg','price':'120 USD','profesor':'juan Alberto'}";
		 
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
		System.out.println("gsonString:"+gsonString);
		Curso c = gson.fromJson( gsonString,Curso.class);
		System.out.println("c:"+c);
	}
	

}
