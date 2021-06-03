package com.example.Wyk02;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.BDDMockito.given;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class AnimalSorterTest
{
    @Spy
    AnimalSorter animalSorter;

    @Before
    public void getDataFromApi() {
        given(animalSorter.getDataFromApi()).willReturn(prepareMockData());
    }

    @Test
    public void sortDataFromApi()
    {
        String[] sorted = {"pies","kot","chomik","rybka"};
        assertArrayEquals(sorted,animalSorter.getDataFromApi());
        //animalSorter.SortDataFromApi();
    }


    private String[] prepareMockData()
    {
        String[] animals = {"pies","kot","chomik","rybka"};
        return animals;
    }

}