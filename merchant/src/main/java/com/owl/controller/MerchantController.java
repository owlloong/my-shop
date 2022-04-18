package com.owl.controller;

import com.owl.model.Merchant;
import com.owl.service.IMerchantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author owl-loong Yuan <br/>
 * @version 1.0.0 <br/>
 * @ClassName MerchantController.java <br/>
 * @Description TODO <br/>
 * @CreateTime 2022-01-10 17:06:00
 */
@Controller
public class MerchantController {

    @Resource
    private IMerchantService merchantService;

    @RequestMapping(value = "/toAddMerchant", method = RequestMethod.GET)
    public String toAddMerchant() {
        return "merchant_register";
    }

    @ResponseBody
    @RequestMapping(value = "/addMerchant", method = RequestMethod.POST)
    public String addMerchant(Merchant merchant) {
        merchant.setAuditStatus(1);
        merchantService.insertMerchant(merchant);
        return "success";
    }

    @RequestMapping(value = "/toUpdateMerchant", method = RequestMethod.GET)
    public String toUpdateMerchant(int id, Model model) {
        Merchant merchant = merchantService.findMerchantById(id);
        model.addAttribute("merchant", merchant);
        return "merchant_update";
    }

    @ResponseBody
    @RequestMapping(value = "/updateMerchant", method = RequestMethod.POST)
    public String updateMerchant(Merchant merchant) {
        merchantService.updateMerchant(merchant);
        return "success";
    }

    @RequestMapping(value = "/toMerchantView", method = RequestMethod.GET)
    public String toMerchantView(int id, Model model) {
        Merchant merchant = merchantService.findMerchantById(id);
        model.addAttribute("merchant", merchant);
        return "merchant_view";
    }

    @RequestMapping(value = "/toMerchantAudit", method = RequestMethod.GET)
    public String toMerchantAudit(int id, Model model) {
        Merchant merchant = merchantService.findMerchantById(id);
        model.addAttribute("merchant", merchant);
        return "merchant_audit";
    }

    @ResponseBody
    @RequestMapping(value = "/merchantAudit", method = RequestMethod.POST)
    public String merchantAudit(int id, int status) {
        merchantService.updateMerchantStatus(id, status);
        return "success";
    }


}
