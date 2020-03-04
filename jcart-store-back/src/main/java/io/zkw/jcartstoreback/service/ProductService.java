package io.zkw.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.zkw.jcartstoreback.dto.out.ProductListOutDTO;
import io.zkw.jcartstoreback.dto.out.ProductShowOutDTO;
import io.zkw.jcartstoreback.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
