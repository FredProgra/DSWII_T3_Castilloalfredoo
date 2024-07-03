package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Domicilio;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio,Integer> {
}
