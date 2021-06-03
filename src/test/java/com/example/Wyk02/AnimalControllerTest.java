package com.example.Wyk02;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.hamcrest.Matchers;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.BDDMockito.given;

public class AnimalControllerTest {

    @Test
    public void getAnimals() {
        //GIVEN
        AnimalController animalController = mock(AnimalController.class);
        //WHEN
        when(animalController.getAnimals()).thenReturn(prepareMockData());
        //THEN
        Assert.assertThat(animalController.getAnimals(), Matchers.hasSize(2));
    }

    @Test
    public void getAnimals2() {
        //GIVEN
        AnimalController animalController = mock(AnimalController.class);
        when(animalController.getAnimals()).thenReturn(prepareMockData());
        //WHEN
       List<Animal> animals = animalController.getAnimals();
        //THEN
        Assert.assertThat(animals, Matchers.hasSize(3));
    }

    @Test
    public void getAnimalsWithBDD2() {
        //GIVEN
        AnimalController animalController = mock(AnimalController.class);
        given(animalController.getAnimals()).willReturn(prepareMockData());
        //WHEN
        List<Animal> animals = animalController.getAnimals();
        //THEN
        Assert.assertThat(animals, Matchers.hasSize(3));
    }

    private List<Animal> prepareMockData()
    {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("dog"));
        animals.add(new Animal("cat"));
        animals.add(new Animal("jednorozec"));
        return animals;
    }

    @Mock
    AnimalController animalController;

    @Test
    public void addAnimal()
    {
        //GIVEN
        AnimalController animalController = mock(AnimalController.class);
        BDDMockito.given(animalController.addAnimal(Mockito.any(Animal.class))).willReturn(new Animal("snake"));
        //WHEN
        Animal animal = animalController.addAnimal(new Animal());
        //THEN
        Assert.assertEquals(animal.getName(),"snake");
    }
}