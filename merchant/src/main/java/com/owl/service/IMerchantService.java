package com.owl.service;

import com.owl.model.Merchant;
import com.owl.vo.MerchantVo;

import java.util.List;

/**
 * @author owl-loong Yuan <br/>
 * @version 1.0.0 <br/>
 * @ClassName IMerchantService.java <br/>
 * @Description TODO <br/>
 * @CreateTime 2022-01-10 17:03:00
 */
public interface IMerchantService {

    void insertMerchant(Merchant merchant);

    Merchant findMerchantById(int id);

    void updateMerchant(Merchant merchant);

    List<Merchant> queryListByVo(MerchantVo merchantVo);

    void deleteMerchantById(int id);

    void updateMerchantStatus(int id,int status);
}
