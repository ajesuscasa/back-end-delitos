package co.edu.iudigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.Caso;

@Repository
public interface ICasoRepository extends JpaRepository<Caso, Long>{

}
