package io.zkw.jcartadministrationback.controller;

import io.zkw.jcartadministrationback.dto.out.AddressListOutDTO;
import io.zkw.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.zkw.jcartadministrationback.dto.out.AddressShowOutDTO;
import io.zkw.jcartadministrationback.po.Address;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {


    @Autowired
    private AddressService addressService;

    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){
        List<Address> addresses = addressService.getByCustomerId(customerId);
        List<AddressListOutDTO> addressListOutDTOS = addresses.stream().map(address -> {
            AddressListOutDTO addressListOutDTO = new AddressListOutDTO();
            addressListOutDTO.setAddressId(address.getAddressId());
            addressListOutDTO.setReceiverName(address.getReceiverName());
            addressListOutDTO.setReceiverMobile(address.getReceiverMobile());
            addressListOutDTO.setContent(address.getContent());
            addressListOutDTO.setTag(address.getTag());
            return addressListOutDTO;
        }).collect(Collectors.toList());
        return addressListOutDTOS;
    }

    @GetMapping("/getById")
    public AddressShowOutDTO getById(@RequestParam Integer addressId){
        Address address = addressService.getById(addressId);
        AddressShowOutDTO addressShowOutDTO = new AddressShowOutDTO();
        addressShowOutDTO.setAddressId(address.getAddressId());
        addressShowOutDTO.setReceiverName(address.getReceiverName());
        addressShowOutDTO.setReceiverMobile(address.getReceiverMobile());
        addressShowOutDTO.setContent(address.getContent());
        addressShowOutDTO.setTag(address.getTag());
        return addressShowOutDTO;
    }

}
