package com.owl.service;

import com.owl.model.ProductType;
import com.owl.vo.ProductTypeVo;

import java.util.List;

/**
 * @author owl-loong Yuan <br/>
 * @version 1.0.0 <br/>
 * @ClassName IProductTypeService.java <br/>
 * @Description TODO <br/>
 * @CreateTime 2022-01-06 15:57:00
 */
public interface IProductTypeService {

    void insertProductType(ProductType productType);

    ProductType findProductTypeById(int id);

    void updateProductType(ProductType productType);


    void deleteProductTypeById(int id);

    List<ProductType> queryListByVo(ProductTypeVo productTypeVo);
}
