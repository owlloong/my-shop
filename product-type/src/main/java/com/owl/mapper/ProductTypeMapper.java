package com.owl.mapper;

import com.owl.model.ProductType;
import com.owl.vo.ProductTypeVo;

import java.util.List;

/**
 * @author owl-loong Yuan <br/>
 * @version 1.0.0 <br/>
 * ClassName ProductTypeMapper.java <br/>
 * Description TODO <br/>
 * CreateTime 2022-01-06 15:46:00
 */
public interface ProductTypeMapper {

    void insertProductType(ProductType productType);

    ProductType findProductTypeById(int id);

    void updateProductType(ProductType productType);

     void deleteProductTypeById(int id);

     List<ProductType> queryListByVo(ProductTypeVo productTypeVo);


}
