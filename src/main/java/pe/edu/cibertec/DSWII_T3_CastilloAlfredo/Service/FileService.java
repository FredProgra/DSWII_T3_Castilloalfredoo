package pe.edu.cibertec.DSWII_T3_CastilloAlfredo.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@Service
public class FileService implements IFileService{
    private static final String ALLOWED_EXTENSIONS ="png";
    private final Path pathFolder= Paths.get("Images");
    @Override
    public void GuardarArchivo(MultipartFile archivo) throws Exception {
        Files.copy(archivo.getInputStream(),this.pathFolder.resolve(archivo.getOriginalFilename()));
    }
}
