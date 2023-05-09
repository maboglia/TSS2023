package it.bogliaccino.uploader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageServiceImpl implements StorageService {

	private Path location;
	
	public StorageServiceImpl(StorageProperties proprieta) {
		this.location = Paths.get(proprieta.getLocation());
	}
	
	@Override
	public void init() {
		try {
			Files.createDirectories(location);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void store(MultipartFile file) {
		try {
			if (file.isEmpty()) {
				throw new Exception("Il file che hai caricato è vuoto");
			}
			
			Path destinazione = this.location.resolve(Paths.get(file.getOriginalFilename())).normalize().toAbsolutePath();

			InputStream is = file.getInputStream();
			
			Files.copy(is, destinazione, StandardCopyOption.REPLACE_EXISTING);
			
		} 
		catch (IOException e) {
			// TODO: handle exception
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Stream<Path> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path load(String nomeFile) {
		// TODO Auto-generated method stub
		return this.location.resolve(nomeFile);
	}

	@Override
	public Resource loadAsResource(String nomeFile) {

		try {
			
			Path file = load(nomeFile);
			Resource risorsa = new UrlResource(file.toUri());
			
			if (risorsa.exists() || risorsa.isReadable()) {
				return risorsa;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
