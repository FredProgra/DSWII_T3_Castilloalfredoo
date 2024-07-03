package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Autor;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Empleado;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {
    List<Empleado> empleadolista();
    Optional<Empleado> buscarEmpleadoXiD(Integer id);
    Empleado agregarEmpleado(Empleado empleado);
}
