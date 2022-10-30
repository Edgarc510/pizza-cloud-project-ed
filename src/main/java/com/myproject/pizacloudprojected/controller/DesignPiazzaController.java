package com.myproject.pizacloudprojected.controller;

import com.myproject.pizacloudprojected.bootstrap.DataGenerator;
import com.myproject.pizacloudprojected.model.Pizza;
import com.myproject.pizacloudprojected.repository.PizzaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/design")
public class DesignPiazzaController {

    public DesignPiazzaController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    PizzaRepository pizzaRepository;



    @GetMapping()
    public String showDesignForm(Model model) {

        model.addAttribute("pizza", new Pizza());
        model.addAttribute("cheeses", DataGenerator.cheeseTypeList);
        model.addAttribute("sauces", DataGenerator.sauceTypeList);
        model.addAttribute("toppings", DataGenerator.toppingTypeList);

        return "/design";
    }

    @PostMapping("/createPizza")
    public String processPizza(Pizza pizza) {

        pizza.setId(UUID.randomUUID());
        pizzaRepository.createPizza(pizza);

        return "redirect:/orders/current?pizzaId=" + pizza.getId();
    }




}
