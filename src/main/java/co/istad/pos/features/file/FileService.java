package co.istad.pos.features.file;

import co.istad.pos.features.file.dto.FileResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    FileResponse uploadSingleFile(MultipartFile file, HttpServletRequest request);

}
