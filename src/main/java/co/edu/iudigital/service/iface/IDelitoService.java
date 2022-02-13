package co.edu.iudigital.service.iface;


import java.util.List;

import co.edu.iudigital.dto.DelitoDto;
import co.edu.iudigital.model.Delito;

public interface IDelitoService {
	
	public List<DelitoDto> finfAll();
	
	public Delito findById(Long id);
	
	public Delito save(Delito delito);
	
	public void delete(Long id);
	
	

}
