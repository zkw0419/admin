package io.zkw.jcartadministrationback.controller;

import io.zkw.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.zkw.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.zkw.jcartadministrationback.dto.out.PageOutDTO;
import io.zkw.jcartadministrationback.dto.out.ReturnListOutDTO;
import io.zkw.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
