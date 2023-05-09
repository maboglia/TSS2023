package it.bogliaccino.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import it.bogliaccino.entities.Viaggio;
import it.bogliaccino.services.ViaggioService;
import it.bogliaccino.uploader.StorageService;

@Controller
public class ViaggioController {

	@Autowired
	private ViaggioService service;
	
	@Autowired
	private StorageService storage;
	
	@GetMapping("viaggi") 
	String getAll(Model m){
		m.addAttribute("titolo", "Elenco viaggi");
		m.addAttribute("elencoViaggi", service.getViaggi());
		return "elenco";
	}
	
	@GetMapping("add") 
	String viewAdd(Model m){
		m.addAttribute("titolo", "Add viaggio");
		return "addViaggi";
	}
	
	@GetMapping("/immagini/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> mostraFile(@PathVariable String filename){
		System.out.println("-------------------------------" + filename);
		Resource file = storage.loadAsResource(filename);
		
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG)
				.body(file);
		
	}
	
	
	@PostMapping("viaggi") 
	String addViaggio(Viaggio v, @RequestParam("documento") MultipartFile file){
		System.out.println(v);
		v.setPercorsoFile(file.getOriginalFilename());
		service.addViaggio(v);
		System.out.println("------------"+file.getOriginalFilename()+"-------------");
		storage.store(file);
		return "redirect:viaggi";
	}
	
	
	
}
