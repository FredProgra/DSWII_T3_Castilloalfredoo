package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Autor;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Domicilio;

import java.util.List;
import java.util.Optional;

public interface IDomicilioService {
    List<Domicilio> domicilioslista();
    Optional<Domicilio> buscarDomicilioXiD(Integer id);
    Domicilio agregarDomicilio(Domicilio domicilio);
}
