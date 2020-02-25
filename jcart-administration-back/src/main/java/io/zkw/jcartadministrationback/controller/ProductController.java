package io.zkw.jcartadministrationback.controller;

import io.zkw.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.zkw.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.zkw.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.zkw.jcartadministrationback.dto.out.PageOutDTO;
import io.zkw.jcartadministrationback.dto.out.ProductListOutDTO;
import io.zkw.jcartadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {


    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,@RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }
    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

}
