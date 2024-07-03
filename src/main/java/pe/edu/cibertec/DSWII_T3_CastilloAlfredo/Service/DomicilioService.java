package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Domicilio;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Empleado;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Repository.DomicilioRepository;

import java.util.List;
import java.util.Optional;

public class DomicilioService implements IDomicilioService{
    private DomicilioRepository domicilioRepository;
    @Override
    public List<Domicilio> domicilioslista() {
        return domicilioRepository.findAll();
    }

    @Override
    public Optional<Domicilio> buscarDomicilioXiD(Integer id) {
        Optional<Domicilio> domicilioOptional = domicilioRepository.findById(id);
        if (domicilioOptional.isEmpty()) {
            return Optional.empty();
        }
        return domicilioOptional;
    }

    @Override
    public Domicilio agregarDomicilio(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }
}
