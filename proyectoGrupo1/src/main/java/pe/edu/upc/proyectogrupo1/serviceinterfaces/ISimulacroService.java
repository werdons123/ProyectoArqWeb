package pe.edu.upc.proyectogrupo1.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.proyectogrupo1.entities.Simulacro;

import java.util.List;

public interface ISimulacroService {
    public List<Simulacro> list();
    public void insert(Simulacro s);
    public Simulacro listId(int id);
    public void update(Simulacro s);
    public void delete(int id);
    public List<Simulacro> buscarPorNombre(@Param("nombre") String nombre);
}
