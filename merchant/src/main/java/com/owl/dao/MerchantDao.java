package com.owl.dao;

import com.owl.mapper.MerchantMapper;
import com.owl.model.Merchant;
import com.owl.vo.MerchantVo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author owl-loong Yuan <br/>
 * @version 1.0.0 <br/>
 * @ClassName MerchantDao.java <br/>
 * @Description TODO <br/>
 * @CreateTime 2022-01-10 17:01:00
 */
@Component
public class MerchantDao {

    @Resource
    private MerchantMapper merchantMapper;

    public void insertMerchant(Merchant merchant) {
        merchantMapper.insertMerchant(merchant);
    }

    public Merchant findMerchantById(int id) {
        return merchantMapper.findMerchantById(id);
    }

    public void updateMerchant(Merchant merchant) {
        merchantMapper.updateMerchant(merchant);
    }

    public List<Merchant> queryListByVo(MerchantVo merchantVo) {
        return merchantMapper.queryListByVo(merchantVo);
    }

    public void deleteMerchantById(int id) {
        merchantMapper.deleteMerchantById(id);
    }

    public void updateMerchantStatus(Merchant merchant) {
        merchantMapper.updateMerchantStatus(merchant);
    }


}
