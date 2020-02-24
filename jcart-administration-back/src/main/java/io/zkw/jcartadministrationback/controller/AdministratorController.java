package io.zkw.jcartadministrationback.controller;

import io.zkw.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.zkw.jcartadministrationback.dto.in.AdministratorUpdateProfileInDTO;
import io.zkw.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }

    @GetMapping("/getprofile")
    public AdministratorGetProfileOutDTO getProfile(Integer adminstratorId){
    return null;

    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }
}
