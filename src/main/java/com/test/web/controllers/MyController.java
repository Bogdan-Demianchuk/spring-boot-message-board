package com.test.web.controllers;

import java.util.List;
import com.test.web.model.Massage;
import com.test.web.repository.MassageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
	private final MassageRepository massageRepository;

	public MyController(MassageRepository massageRepository) {
		this.massageRepository = massageRepository;
	}

	@GetMapping("/")
	public String greeting( Model model) {
		model.addAttribute("titile", "Илюхаr");
		List<Massage> allMassages = massageRepository.findAll();
		model.addAttribute("massages", allMassages);
		return "home";
	}
	@GetMapping("/hi")
	public String hi( Model model) {
		model.addAttribute("titile", "Iluha");
		Massage massage = new Massage();
		massage.setMassage("Hello massage");
		massage.setAuthor("Bogdan Demianchuk");
		massageRepository.save(massage);
		return "home";
	}
}