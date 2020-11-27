package com.kgc.pet.service;

import com.kgc.pet.dao.PetMapper;
import com.kgc.pet.pojo.Pet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class addPetServiceImpl implements addPetService {
    @Resource
    PetMapper petMapper;

    @Override
    public int insertPet(Pet pet) {
        return petMapper.insertSelective(pet);
    }
}
