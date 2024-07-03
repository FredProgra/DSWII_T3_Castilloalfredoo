package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idempleado;
    private String nombre;
    private String apellido;
    private String fechacontrat;
    @ManyToOne
    @JoinColumn(name = "iddomicilio")
    private Domicilio domicilio;
}
