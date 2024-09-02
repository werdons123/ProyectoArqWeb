package pe.edu.upc.proyectogrupo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.proyectogrupo1.entities.Alerta;

@Repository

public interface IAlertaRepository extends JpaRepository<Alerta,Integer> {
}
