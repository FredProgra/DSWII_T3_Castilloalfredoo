package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Autor;
@Data
public class PublicacionDto implements DtoEntity{
    private String titulo;
    private String resumen;
    private String fechpublicacion;

    private AutorDto autor;
}
