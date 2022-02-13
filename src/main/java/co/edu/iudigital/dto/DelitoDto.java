package co.edu.iudigital.dto;

import co.edu.iudigital.model.Delito;
import lombok.Builder;
import lombok.Data;

@Builder // crear, construir un objeto
@Data //getteres y setteres
public class DelitoDto {
	

/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
private Long id;
private String nombre;
private String descripcion;

	
	
	

}
