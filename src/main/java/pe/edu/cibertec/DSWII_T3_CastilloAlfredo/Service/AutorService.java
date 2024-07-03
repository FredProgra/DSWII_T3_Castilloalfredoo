package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Autor;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Repository.AutorRepository;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class AutorService implements IAutorService {
    private AutorRepository autorRepository;

    @Override
    public List<Autor> autoreslista() {
        return autorRepository.findAll();
    }

    @Override
    public Optional<Autor> buscarAutorXiD(Integer id) {
        Optional<Autor> autorOptional = autorRepository.findById(id);
        if (autorOptional.isEmpty()) {
            return Optional.empty();
        }
        return autorOptional;

    }

    @Override
    public Autor agregarAutor(Autor autor) {
        return autorRepository.save(autor);
    }
}
