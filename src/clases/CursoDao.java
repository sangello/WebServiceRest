package clases;

import java.util.ArrayList;

public class CursoDao {
	
	private ArrayList<Curso> listaCursos = new ArrayList<Curso>();
	
	private Curso curso1 = new Curso(1, "Java Desde 0", "https://edteam-media.s3.amazonaws.com/courses/original/50668a3f-3a6e-4e24-80ff-dd5bea441559.jpg", "12", "AA");
	private Curso curso2 = new Curso(2, "PHP Desde 0", "https://edteam-media.s3.amazonaws.com/courses/original/50668a3f-3a6e-4e24-80ff-dd5bea441559.jpg", "120", "BB");
	private Curso curso3 = new Curso(3, "GO Desde 0", "https://edteam-media.s3.amazonaws.com/courses/original/50668a3f-3a6e-4e24-80ff-dd5bea441559.jpg", "1200", "CC");
	private Curso curso4 = new Curso(4, "SEO Desde 0", "https://edteam-media.s3.amazonaws.com/courses/original/50668a3f-3a6e-4e24-80ff-dd5bea441559.jpg", "1300", "DD");
	
	/**
	 * Devuelve todos los cursos
	 * @return ArrayList<Curso>
	 */
	public ArrayList<Curso> getAllCursos() {
		
		listaCursos = new ArrayList<Curso>();
		
		listaCursos.add(curso1);
		listaCursos.add(curso2);
		listaCursos.add(curso3);
		listaCursos.add(curso4);
		
		return listaCursos;
		
	}
	
	/**
	 * 	Devuelve un curso
	 * 
	 * @param id
	 * @return Curso
	 */
	public Curso getIdCurso(int id) {
		Curso curs= null;
		
		ArrayList<Curso> lc = getAllCursos();
		for (Curso curso : lc) {
			if (id==curso.getId()) {
				curs = curso;
			}
		}
		
		return curs;
	}
	
}
