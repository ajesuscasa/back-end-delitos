package co.edu.iudigital.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.validator.constraints.Length;



@Entity
@Table
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message = "Email es obligatorio")
	@Email(message = "debe ingresar un email valido")
	@Column(unique = true, length = 120)
	private String username;
	
	@Column(length = 120)
	private String passwork;
	
	@NotEmpty(message = "nombre es obligatorio")
	@Column(nullable = false, length =120)
	private String nombre;
	
	
	@NotEmpty(message = "apellido es obligatorio")
	@Length(min = 1, max = 120)
	@Column(nullable = false)
	private String apellido;
	
	@Column(name = "fechaNacimiento")
	private LocalDate fecha_nacimiento;
	
	private Boolean enable;
	
	@Column(name = "red_social")
	private Boolean redSocial;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "roles_usuarios",
	joinColumns = {@JoinColumn(name = "usuarios_id")},
	inverseJoinColumns = {@JoinColumn(name = "roles_id")})
	private List<Role> roles;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the passwork
	 */
	public String getPasswork() {
		return passwork;
	}

	/**
	 * @param passwork the passwork to set
	 */
	public void setPasswork(String passwork) {
		this.passwork = passwork;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the fecha_nacimiento
	 */
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	/**
	 * @param fecha_nacimiento the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	/**
	 * @return the enable
	 */
	public Boolean getEnable() {
		return enable;
	}

	/**
	 * @param enable the enable to set
	 */
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * @return the redSocial
	 */
	public Boolean getRedSocial() {
		return redSocial;
	}

	/**
	 * @param redSocial the redSocial to set
	 */
	public void setRedSocial(Boolean redSocial) {
		this.redSocial = redSocial;
	}

	/**
	 * @return the roles
	 */
	public List<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	

}
