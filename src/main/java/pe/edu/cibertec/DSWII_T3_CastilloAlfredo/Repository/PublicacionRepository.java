package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion,Integer> {
}
