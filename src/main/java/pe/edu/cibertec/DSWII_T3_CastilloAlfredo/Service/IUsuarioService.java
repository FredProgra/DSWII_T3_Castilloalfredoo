package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Usuario;

public interface IUsuarioService {
    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}
