package com.kgc.pet.controller;




import com.kgc.pet.pojo.Pet;

import com.kgc.pet.service.queryservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class QueryContorller {

    @Resource
    queryservice qs;
    @RequestMapping("/show.go")
    public String jj(Integer pack, Model model){
        if(pack==null){
            pack=0;
        }
        List<Pet> pets = qs.selectByExample(pack);
        model.addAttribute("pets",pets);
        return "index";
    }

    @RequestMapping("/show1.go")
    public String jj1(){
        System.out.println("111111");
        return "add";
    }

}
