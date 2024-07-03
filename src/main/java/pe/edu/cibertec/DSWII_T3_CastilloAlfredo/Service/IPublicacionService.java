package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Publicacion;

import java.util.List;
import java.util.Optional;

public interface IPublicacionService {
    List<Publicacion> lisPublicacions();
    Optional<Publicacion> publicacionxID(Integer id);
    Publicacion agregarpublicaciom(Publicacion publicacion);
}
