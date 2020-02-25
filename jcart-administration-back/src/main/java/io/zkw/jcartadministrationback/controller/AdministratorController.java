package io.zkw.jcartadministrationback.controller;

import io.zkw.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.zkw.jcartadministrationback.dto.in.AdministratorRestPwdDTO;
import io.zkw.jcartadministrationback.dto.in.AdministratorUpdateProfileInDTO;
import io.zkw.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.zkw.jcartadministrationback.dto.out.AdministratorListOutDTO;
import io.zkw.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }

    @GetMapping("/getprofile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId){
    return null;

    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @GetMapping("/getPwdRestCode")
    public String getPwdRestCode(@RequestParam String email){
        return null;
    }
    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorRestPwdDTO administratorRestPwdDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){

        return null;
    }
}
