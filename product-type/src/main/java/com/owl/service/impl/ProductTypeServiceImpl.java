package com.owl.service.impl;

import com.owl.dao.ProductTypeDao;
import com.owl.model.ProductType;
import com.owl.service.IProductTypeService;
import com.owl.vo.ProductTypeVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author owl-loong Yuan <br/>
 * @version 1.0.0 <br/>
 * @ClassName ProductTypeServiceImpl.java <br/>
 * @Description TODO <br/>
 * @CreateTime 2022-01-06 15:57:00
 */
@Service
public class ProductTypeServiceImpl implements IProductTypeService {

    @Resource
    private ProductTypeDao productTypeDao;

    @Override
    public void insertProductType(ProductType productType) {
        productTypeDao.insertProductType(productType);
    }

    @Override
    public ProductType findProductTypeById(int id) {
        return productTypeDao.findProductTypeById(id);
    }

    @Override
    public void updateProductType(ProductType productType) {
        productTypeDao.updateProductType(productType);
    }

    @Override
    public void deleteProductTypeById(int id) {
        productTypeDao.deleteProductTypeById(id);
    }

    @Override
    public List<ProductType> queryListByVo(ProductTypeVo productTypeVo) {
        return productTypeDao.queryListByVo(productTypeVo);
    }
}
