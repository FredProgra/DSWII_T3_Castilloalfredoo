package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "domicilio")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer iddomicilio;
private String descdomicilio;
private Integer nrodomicilio;
private String refdomicilio;

}
