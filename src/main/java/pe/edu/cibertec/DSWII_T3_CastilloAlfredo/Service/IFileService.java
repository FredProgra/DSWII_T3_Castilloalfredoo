package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import org.springframework.web.multipart.MultipartFile;

public interface IFileService {
    void GuardarArchivo(MultipartFile archivo) throws Exception;
}
