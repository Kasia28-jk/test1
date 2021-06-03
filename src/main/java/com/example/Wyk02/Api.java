package com.example.Wyk02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Api
{
    private AnimalController animalController;

    @Autowired
    public Api(AnimalController animalController)
    {
        this.animalController  = animalController;
    }

    @GetMapping("/animal")
    public Iterable<Animal> getAnimals()
    {
        return animalController.getAnimals();
    }

    @PostMapping("/animal")
    public void addAnimals(@RequestBody Animal animal)
    {
        animalController.addAnimal(animal);
    }
}
