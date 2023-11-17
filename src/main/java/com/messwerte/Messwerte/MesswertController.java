package com.messwerte.Messwerte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;


@RestController
public class MesswertController {

	private MesswertService messwertService;

	@Autowired
	public MesswertController(MesswertService messwertService){
		this.messwertService = messwertService;
	}

	@GetMapping("/messwerte")
	public Messwert getMesswert(){
		Optional messwert = messwertService.getMesswert("beamng");
		if(messwert.isPresent()){
			return (Messwert) messwert.get();
		}
		return null;
	}

}


