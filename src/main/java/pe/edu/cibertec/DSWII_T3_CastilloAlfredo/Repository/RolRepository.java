package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {
    //Select * from rol where nomrol = 'ADMIN'
    Rol findByNomrol(String nomrol);
}
