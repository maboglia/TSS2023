package it.bogliaccino.uploader;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {

	void init();
	void store(MultipartFile file); //qs tipo di file
	Stream<Path> loadAll();
	Path load(String nomeFile);
	Resource loadAsResource(String nomeFile);
	void deleteAll();
	
	
}
