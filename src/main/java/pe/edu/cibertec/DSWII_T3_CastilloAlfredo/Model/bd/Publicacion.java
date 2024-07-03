package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpublicacion;
    private String titulo;
    private String resumen;
    private String fechpublicacion;
    @ManyToOne
    @JoinColumn(name = "idautor")
    private Autor autor;
}
