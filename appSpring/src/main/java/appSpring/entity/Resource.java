package appSpring.entity;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Resource {

	public interface Basic {}

	public interface ResoType {}

	public interface Genr {}

	public interface ResoCopy {}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonView(Basic.class)
	private Integer id;

	@JsonView(Basic.class)
	private String title;
	@JsonView(Basic.class)
	private String author;
	@JsonView(Basic.class)
	private String editorial;
	@JsonView(Basic.class)
	private String picture;
	@JsonView(Basic.class)
	private ArrayList<String> noReservedCopies;
	@JsonView(Basic.class)
	private Boolean avaiblereserve;

	@Column(length = 1024)
	@JsonView(Basic.class)
	private String description;

	@OneToOne
	@JsonView(ResoType.class)
	private ResourceType resourceType;

	@JsonIgnore
	@ManyToOne
	@JsonView(Genr.class)
	private Genre genre;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resource")
	@JsonView(ResoCopy.class)
	private List<ResourceCopy> copies = new ArrayList<ResourceCopy>();

	protected Resource() {
	}

	public Resource(String title, String author, String editorial, String description) {
		this.title = title;
		this.author = author;
		this.editorial = editorial;
		this.description = description;
		noReservedCopies = new ArrayList<String>();
		avaiblereserve = new Boolean(true);
	}

	public Resource(String title, String author, String editorial, String description, String picture) {
		this.title = title;
		this.author = author;
		this.editorial = editorial;
		this.description = description;
		this.picture = picture;
		noReservedCopies = new ArrayList<String>();
		avaiblereserve = new Boolean(true);
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

	public String getAutor() {
		return author;
	}

	public void setAutor(String autor) {
		this.author = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ResourceType getProductType() {
		return resourceType;
	}

	public void setProductType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<ResourceCopy> getResourceCopies() {
		return copies;
	}

	public void setResourceCopies(List<ResourceCopy> copies) {
		this.copies = copies;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public ArrayList<String> getNoReservedCopies() {
		return noReservedCopies;
	}

	public void setNoReservedCopies(ArrayList<String> noReservedCopies) {
		this.noReservedCopies = noReservedCopies;
	}

	public Boolean getAvaibleReserve() {
		return this.avaiblereserve;
	}

	public void setAvaibleReserve(Boolean avaiblereserve) {
		this.avaiblereserve = avaiblereserve;
	}

}
