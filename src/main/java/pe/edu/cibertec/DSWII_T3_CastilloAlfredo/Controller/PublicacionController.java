package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Exception.ResourceNotFoundException;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.bd.Publicacion;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.dto.DtoEntity;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.dto.PublicacionDto;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service.IPublicacionService;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.util.DtoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/publicacion")
public class PublicacionController {
    private IPublicacionService publicacionService;

    @GetMapping("")
    @PreAuthorize("hasRole('Coordinador')")
    public ResponseEntity<List<DtoEntity>> publicacionListResponse(){
        List<DtoEntity> publicacionList=new ArrayList<>();
        publicacionList=publicacionService.lisPublicacions()
                .stream()
                .map(x->new DtoUtil().convertirADto(x,new PublicacionDto()))
                .collect(Collectors.toList());
        if (publicacionList.isEmpty()){new ResponseEntity<>(HttpStatus.NO_CONTENT);}
        return  new ResponseEntity<>(publicacionList,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Publicacion> buscarPublicacoionId(@PathVariable Integer id){
        Publicacion idpublicacion=publicacionService.publicacionxID(id).orElseThrow(
                ()->new ResourceNotFoundException("El id de la publicacion"+id+"No existe")

        );
        return  new ResponseEntity<>(idpublicacion,HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<Publicacion> agregarpublicacionResponse(@RequestBody Publicacion publicacion){
        return new ResponseEntity<>(publicacionService.agregarpublicaciom(publicacion),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Publicacion> actualizarPublicacionResponse(
            @PathVariable Integer id,
            @RequestBody Publicacion publicacion
    ){
        Publicacion newpublicacion = publicacionService.publicacionxID(id).orElseThrow(() -> new ResourceNotFoundException("La publicaccion con Id "
                + id +" no existe"));
        newpublicacion.setTitulo(publicacion.getTitulo());
        newpublicacion.setResumen(publicacion.getResumen());
        newpublicacion.setFechpublicacion(publicacion.getFechpublicacion());
        newpublicacion.setAutor(publicacion.getAutor());


        return new ResponseEntity<>(publicacionService.agregarpublicaciom(newpublicacion),
                HttpStatus.OK);
    }


}
