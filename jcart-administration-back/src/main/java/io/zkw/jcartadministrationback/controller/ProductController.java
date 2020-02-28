package io.zkw.jcartadministrationback.controller;

import io.zkw.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.zkw.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.zkw.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.zkw.jcartadministrationback.dto.out.PageOutDTO;
import io.zkw.jcartadministrationback.dto.out.ProductListOutDTO;
import io.zkw.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.zkw.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

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
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }
    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        productService.update(productUpdateInDTO);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
        productService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
        productService.batchDelete(productIds);
    }


}
