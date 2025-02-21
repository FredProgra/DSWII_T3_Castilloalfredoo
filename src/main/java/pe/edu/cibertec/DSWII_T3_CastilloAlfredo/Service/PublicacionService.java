package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Publicacion;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Repository.PublicacionRepository;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class PublicacionService implements IPublicacionService {
    private PublicacionRepository publicacionRepository;
    @Override
    public List<Publicacion> lisPublicacions() {
        return publicacionRepository.findAll();
    }

    @Override
    public Optional<Publicacion> publicacionxID(Integer id) {
        Optional<Publicacion> publicacionOptional=publicacionRepository.findById(id);
        if (publicacionOptional.isEmpty()){Optional.empty();}
        return publicacionOptional;
    }

    @Override
    public Publicacion agregarpublicaciom(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }
}
