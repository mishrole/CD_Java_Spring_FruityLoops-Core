package com.codingdojo.fruityloops.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.fruityloops.model.Item;

@Controller
public class ItemController {
	
	@RequestMapping("/")
	public String index(Model model) {
		ArrayList<Item> fruits = new ArrayList<>();
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Bayas de Goji", 4.0));
		fruits.add(new Item("Guayava", .75));
		
		model.addAttribute("fruitsList", fruits);
		
		return "index";
	}
}
