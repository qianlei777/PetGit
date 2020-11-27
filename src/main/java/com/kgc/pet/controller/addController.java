package com.kgc.pet.controller;

import com.kgc.pet.pojo.Pet;
import com.kgc.pet.service.addPetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class addController {
    @Resource
    addPetService addPetService;

    @RequestMapping("/addpet.go")
    public String addpet(Pet pet) {

        int i = addPetService.insertPet(pet);
        if (i > 0) {
            System.out.println("111");
            return "<script>alert('添加成功');location.href='/show.go'</script>";
        } else {
            System.out.println("222");
            return "<script>alert('添加失败');location.href='/show1.go'</script>";
        }
    }


}
