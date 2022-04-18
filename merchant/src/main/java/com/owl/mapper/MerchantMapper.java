package com.owl.mapper;

import com.owl.model.Merchant;
import com.owl.vo.MerchantVo;

import java.util.List;

/**
 * @author owl-loong Yuan <br/>
 * @version 1.0.0 <br/>
 * @ClassName MerchantMapper.java <br/>
 * @Description TODO <br/>
 * @CreateTime 2022-01-10 16:46:00
 */

public interface MerchantMapper {

    void insertMerchant(Merchant merchant);

    Merchant findMerchantById(int id);

    void updateMerchant(Merchant merchant);

    List<Merchant> queryListByVo(MerchantVo merchantVo);

    void deleteMerchantById(int id);

    void updateMerchantStatus(Merchant merchant);

}
