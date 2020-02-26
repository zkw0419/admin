package io.zkw.jcartstoreback.controller;


import io.zkw.jcartstoreback.dto.in.ProductSearchInDTO;
import io.zkw.jcartstoreback.dto.out.PageOutDTO;
import io.zkw.jcartstoreback.dto.out.ProductListOutDTO;
import io.zkw.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

}
