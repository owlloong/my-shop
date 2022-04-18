package com.owl.service.impl;

import com.owl.dao.MerchantDao;
import com.owl.model.Merchant;
import com.owl.service.IMerchantService;
import com.owl.vo.MerchantVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author owl-loong Yuan <br/>
 * @version 1.0.0 <br/>
 * @ClassName MerchantServiceImpl.java <br/>
 * @Description TODO <br/>
 * @CreateTime 2022-01-10 17:04:00
 */
@Service
public class MerchantServiceImpl implements IMerchantService {

    @Resource
    private MerchantDao merchantDao;

    @Override
    public void insertMerchant(Merchant merchant) {
        merchantDao.insertMerchant(merchant);
    }

    @Override
    public Merchant findMerchantById(int id) {
        return merchantDao.findMerchantById(id);
    }

    @Override
    public void updateMerchant(Merchant merchant) {
        merchantDao.updateMerchant(merchant);
    }

    @Override
    public List<Merchant> queryListByVo(MerchantVo merchantVo) {
        return merchantDao.queryListByVo(merchantVo);
    }

    @Override
    public void deleteMerchantById(int id) {
        merchantDao.deleteMerchantById(id);
    }

    @Override
    public void updateMerchantStatus(int id, int status) {
        Merchant merchant = new Merchant();
        merchant.setId(id);
        merchant.setAuditStatus(status);
        merchantDao.updateMerchantStatus(merchant);
    }
}
