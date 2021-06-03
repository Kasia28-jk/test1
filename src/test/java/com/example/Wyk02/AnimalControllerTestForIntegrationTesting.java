package com.example.Wyk02;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.BDDMockito.given;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AnimalControllerTestForIntegrationTesting
{
    @Mock
    AnimalRepo animalRepo;
    @InjectMocks
    AnimalController animalController;

    @Before
    public void init()
    {
        given(animalRepo.findAll()).willReturn(prepareMockData());
    }

    @Test
    public void getAnimals()
    {
        //WHEN
        List<Animal> animals = animalController.getAnimals();
        //Then
        Assert.assertThat(animals, Matchers.hasSize(3));
    }

    @Test
    public void addAnimal()
    {

    }

    private List<Animal> prepareMockData()
    {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("dog"));
        animals.add(new Animal("cat"));
        animals.add(new Animal("jednorozec"));
        return animals;
    }
}