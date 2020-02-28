package io.zkw.jcartadministrationback.service;

import io.zkw.jcartadministrationback.dto.in.ProductCreateInDTO;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);
}
