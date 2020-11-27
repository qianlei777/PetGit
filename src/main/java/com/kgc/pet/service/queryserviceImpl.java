package com.kgc.pet.service;

import com.kgc.pet.dao.PetMapper;
import com.kgc.pet.pojo.Pet;
import com.kgc.pet.pojo.PetExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class queryserviceImpl implements queryservice {
    @Autowired
    PetMapper petMapper;
    @Override
    public List<Pet> selectByExample(int pack) {
        PetExample petExample=new PetExample();
        if(pack==0){
            return petMapper.selectByExample(null);
        }
        if(pack>0){
            petExample.createCriteria().andPetbreedEqualTo(pack);
        }
        List<Pet> pets = petMapper.selectByExample(petExample);
        return pets;
    }
}
