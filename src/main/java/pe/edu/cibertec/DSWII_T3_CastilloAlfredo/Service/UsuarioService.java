package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Usuario;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Repository.UsuarioRepository;
@Service
@AllArgsConstructor
public class UsuarioService implements IUsuarioService{
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario obtenerUsuarioPorNomUsuario(String nomusuario) {
         return usuarioRepository.findByNomusuario(nomusuario);
    }
}
