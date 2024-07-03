package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Exception;

public class ResourceNotFoundException extends  RuntimeException {
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
