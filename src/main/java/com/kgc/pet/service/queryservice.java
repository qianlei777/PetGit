package com.kgc.pet.service;

import com.kgc.pet.pojo.Pet;
import com.kgc.pet.pojo.PetExample;

import java.util.List;

public interface queryservice {


    List<Pet> selectByExample(int pack);
}
