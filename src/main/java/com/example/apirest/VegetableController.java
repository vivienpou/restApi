package com.example.apirest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VegetableController
{
	@Autowired
	private VegetableRepository vegetableRepo;

	@RequestMapping(value = "vegetables", method = RequestMethod.GET)
	public String listAll(Model model)
	{
		List<Vegetable> listVegetables = vegetableRepo.findAll();
		model.addAttribute("listVegetables", listVegetables);

		return "vegetables";
	}

}