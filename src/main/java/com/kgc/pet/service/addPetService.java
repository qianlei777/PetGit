package com.kgc.pet.service;

import com.kgc.pet.dao.PetMapper;
import com.kgc.pet.pojo.Pet;

import javax.annotation.Resource;

public interface addPetService {


    //添加宠物
    int insertPet(Pet pet);
}
