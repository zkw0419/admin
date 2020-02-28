package io.zkw.jcartadministrationback.service;

import io.zkw.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.zkw.jcartadministrationback.dto.in.ProductUpdateInDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);
}
