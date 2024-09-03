package pe.edu.upc.proyectogrupo1.serviceinterfaces;

import pe.edu.upc.proyectogrupo1.entities.ZonaAlerta;

import java.util.List;

public interface IZonaAlertaService {
    public List<ZonaAlerta> list();
    public void insert(ZonaAlerta za);
    public void update(ZonaAlerta za);
    public void delete(int id_ZonaAlerta);
}