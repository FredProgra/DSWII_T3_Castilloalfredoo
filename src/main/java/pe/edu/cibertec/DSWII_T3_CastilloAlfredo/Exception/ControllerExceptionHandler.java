package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Model.dto.MensajeErrorDto;

import java.util.Date;
@RestControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public MensajeErrorDto resouceNotFoundException(ResourceNotFoundException ex, WebRequest request) {

        return MensajeErrorDto.builder().mensaje(ex.getMessage()).codigo(HttpStatus.NOT_FOUND.value()).fechaError(new Date())
                .description(request.getDescription(true)).build();
    }
}
