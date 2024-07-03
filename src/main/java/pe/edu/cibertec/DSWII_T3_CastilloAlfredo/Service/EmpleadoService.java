package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Autor;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Empleado;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Repository.EmpleadoRepository;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class EmpleadoService implements IEmpleadoService{
    private EmpleadoRepository empleadoRepository;
    @Override
    public List<Empleado> empleadolista() {
        return empleadoRepository.findAll();
    }

    @Override
    public Optional<Empleado> buscarEmpleadoXiD(Integer id) {
        Optional<Empleado> empleadoOptional = empleadoRepository.findById(id);
        if (empleadoOptional.isEmpty()) {
            return Optional.empty();
        }
        return empleadoOptional;
    }

    @Override
    public Empleado agregarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}
