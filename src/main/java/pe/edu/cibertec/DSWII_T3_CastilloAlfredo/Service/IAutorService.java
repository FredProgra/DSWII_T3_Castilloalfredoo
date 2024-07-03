package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {
    List<Autor> autoreslista();
    Optional<Autor> buscarAutorXiD(Integer id);
    Autor agregarAutor(Autor autor);
}
