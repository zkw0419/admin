package io.zkw.jcartstoreback.controller;

import io.zkw.jcartstoreback.dto.in.ReturnApplyInDTO;
import io.zkw.jcartstoreback.dto.out.PageOutDTO;
import io.zkw.jcartstoreback.dto.out.ReturnListOutDTO;
import io.zkw.jcartstoreback.dto.out.ReturnShowOutDTO;
import io.zkw.jcartstoreback.enumeration.ReturnStatus;
import io.zkw.jcartstoreback.po.Return;
import io.zkw.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/return")
@CrossOrigin
public class ReturnController {

    @Autowired
    private ReturnService returnService;

    @PostMapping("/apply")
    public Integer apply(@RequestBody ReturnApplyInDTO returnApplyInDTO,
                         @RequestAttribute Integer customerId){
        Return aReturn = new Return();
        aReturn.setOrderId(returnApplyInDTO.getOrderId());
        aReturn.setOrderTime(new Date(returnApplyInDTO.getOrderTimestamp()));
        aReturn.setCustomerId(customerId);
        aReturn.setCustomerName(returnApplyInDTO.getCustomerName());
        aReturn.setMobile(returnApplyInDTO.getMobile());
        aReturn.setEmail(returnApplyInDTO.getEmail());
        aReturn.setStatus((byte) ReturnStatus.ToProcess.ordinal());
        aReturn.setProductCode(returnApplyInDTO.getProductCode());
        aReturn.setProductName(returnApplyInDTO.getProductName());
        aReturn.setQuantity(returnApplyInDTO.getQuantity());
        aReturn.setReason(returnApplyInDTO.getReason());
        aReturn.setOpened(returnApplyInDTO.getOpened());
        aReturn.setComment(returnApplyInDTO.getComment());
        Date now = new Date();
        aReturn.setCreateTime(now);
        aReturn.setUpdateTime(now);
        returnService.create(aReturn);
        Integer returnId = aReturn.getReturnId();

        return returnId;
    }

    @GetMapping("/getList")
    public PageOutDTO<ReturnListOutDTO> getList(@RequestAttribute Integer customerId,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/cancel")
    public void cancel(@RequestBody Integer returnId){

    }

}
