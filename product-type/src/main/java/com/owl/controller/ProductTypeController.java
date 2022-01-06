package com.owl.controller;

import com.owl.model.ProductType;
import com.owl.service.IProductTypeService;
import com.owl.vo.ProductTypeVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author owl-loong Yuan <br/>
 * @version 1.0.0 <br/>
 * @ClassName ProductTypeController.java <br/>
 * @Description TODO <br/>
 * @CreateTime 2022-01-06 16:04:00
 */
@Controller
@RequestMapping("/")
public class ProductTypeController {

    @Resource
    private IProductTypeService productTypeService;

    @RequestMapping(value = "/toProductTypeAdd", method = RequestMethod.GET)
    public String toProductTypeAdd(int id, Model model) {
        ProductType productType = productTypeService.findProductTypeById(id);
        if (productType == null) {
            productType = new ProductType();
            productType.setId(-1);
        }
        model.addAttribute("productType", productType);
        return "product_type_add";
    }

    @ResponseBody
    @RequestMapping(value = "/insertProductType", method = RequestMethod.POST)
    public String insertProductType(ProductType productType) {
        productTypeService.insertProductType(productType);
        return "success";
    }

    @RequestMapping(value = "/toUpdateProductType", method = RequestMethod.GET)
    public String toUpdateProductType(int id, Model model) {
        ProductType productType = productTypeService.findProductTypeById(id);
        model.addAttribute("productType", productType);
        return "product_type_update";
    }

    @ResponseBody
    @RequestMapping(value = "/updateProductType", method = RequestMethod.POST)
    public String updateProductType(ProductType productType) {
        productTypeService.updateProductType(productType);
        return "success";
    }

    @RequestMapping(value = "/toProductTypeView", method = RequestMethod.GET)
    public String toProductTypeView(int id, Model model) {
        ProductType productType = productTypeService.findProductTypeById(id);
        model.addAttribute("productType", productType);
        int parentId = productType.getParentId();
        ProductType parentProductType = productTypeService.findProductTypeById(parentId);
        if (parentProductType == null) {
            parentProductType = new ProductType();
            parentProductType.setId(-1);
        }
        model.addAttribute("parentProductType", parentProductType);
        return "product_type_view";
    }


    @RequestMapping(value = "/toProductTypeList", method = RequestMethod.GET)
    public String toProductTypeList(Model model) {
        ProductTypeVo productTypeVo = new ProductTypeVo();
        List<ProductType> list = productTypeService.queryListByVo(productTypeVo);
        model.addAttribute("list", list);
        return "product_type_list";
    }

    @ResponseBody
    @RequestMapping(value = "/delProductTypeById", method = RequestMethod.GET)
    public String delProductTypeById(int id) {
        productTypeService.deleteProductTypeById(id);
        return "success";
    }


}
