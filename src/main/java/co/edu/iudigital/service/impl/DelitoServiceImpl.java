package co.edu.iudigital.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.AssociationOverride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.dto.DelitoDto;
import co.edu.iudigital.model.Delito;
import co.edu.iudigital.repository.IDelitoRepository;
import co.edu.iudigital.service.iface.IDelitoService;

@Service
public class DelitoServiceImpl implements IDelitoService{

	@Autowired
	private IDelitoRepository delitoRepository;
	private List<Delito> deltoDto;
	
		
	@AssociationOverride(name = "")
	public List<Delito>delitos  {
		List<Delito> delitos = delitoRepository.findAll();
		List<Delito> delitoDto = new ArrayList<>();
		
		/*for(Delito delito : delitos) {
			DelitoDto delitoDto1 = new DelitoDto();
			((DelitoDto) delitoDto).setId(delito.getId());
			deltoDto.addAll(delitoDto);
		}*/
		
		//segunda forma
		delitos.stream()
		.forEach(d->{
			
				DelitoDto delitoDto1 = new DelitoDto();
				DelitoDto delito = null;
				((DelitoDto) delitoDto).setId(delito.getId());
				delitoDto.addAll(delitoDto);
		}
		);
			
		return delitoDto;
	}

	@Override
	public Delito findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Delito save(Delito delito) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DelitoDto> finfAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
