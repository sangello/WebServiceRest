package clases;

public class Curso {

	private Integer id;
	private String title;
	private String image;
	private String price;
	private String profesor;

	public Curso(Integer id, String title, String image, String price, String profesor) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.price = price;
		this.profesor = profesor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", title=" + title + ", image=" + image + ", price=" + price + ", profesor="
				+ profesor + "]";
	}

}
