package com.owl.dao;

import com.owl.mapper.ProductTypeMapper;
import com.owl.model.ProductType;
import com.owl.vo.ProductTypeVo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author owl-loong Yuan <br/>
 * @version 1.0.0 <br/>
 * @ClassName ProductTypeDao.java <br/>
 * @Description TODO <br/>
 * @CreateTime 2022-01-06 15:57:00
 */
@Component
public class ProductTypeDao {

    @Resource
    private ProductTypeMapper productTypeMapper;

    public void insertProductType(ProductType productType) {
        productTypeMapper.insertProductType(productType);
    }

    public ProductType findProductTypeById(int id) {
        return productTypeMapper.findProductTypeById(id);
    }

    public void updateProductType(ProductType productType) {
        productTypeMapper.updateProductType(productType);
    }


    public void deleteProductTypeById(int id) {
        productTypeMapper.deleteProductTypeById(id);
    }

    public List<ProductType> queryListByVo(ProductTypeVo productTypeVo) {
        return productTypeMapper.queryListByVo(productTypeVo);
    }
}
