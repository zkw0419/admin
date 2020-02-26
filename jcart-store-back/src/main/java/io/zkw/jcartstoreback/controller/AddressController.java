package io.zkw.jcartstoreback.controller;

import io.zkw.jcartstoreback.dto.in.AddressCreateInDTO;
import io.zkw.jcartstoreback.dto.in.AddressUpdateInDTO;
import io.zkw.jcartstoreback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/getAddressByCustomerId")
    public List<AddressListOutDTO> getAddressByCustomerId(@RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/create")

    public Integer create(@RequestBody AddressCreateInDTO addressCreateInDTO,@RequestAttribute Integer customerId){
    return  null;

    }
    @PostMapping("/update")
    public void update(@RequestBody AddressUpdateInDTO addressUpdateInDTO,@RequestAttribute Integer customerId){

    }
}
