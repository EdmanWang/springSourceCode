package com.wgx.service;

import com.wgx.dao.AccountInfoDao;
import com.wgx.dao.ProductInfoDao;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @Author EdmanWang
 * @create 2020/2/21 17:50
 */
@Component
public class PayServiceImpl implements PayService {

    @Autowired
    private AccountInfoDao accountInfoDao;

    @Autowired
    private ProductInfoDao productInfoDao;


    @Transactional
    public void pay(String accountId, double money) {
        //查询余额
        double blance = accountInfoDao.qryBlanceByUserId(accountId);

        //余额不足正常逻辑
        if(new BigDecimal(blance).compareTo(new BigDecimal(money))<0) {
            throw new RuntimeException("余额不足");
        }

        //更新库存
//        ((PayService) AopContext.currentProxy()).updateProductStore(1);
//        this.updateProductStore(1);


        //System.out.println(1/0);

        //更新余额
        int retVal = accountInfoDao.updateAccountBlance(accountId,money);
    }

    //
    @Transactional(propagation =Propagation.REQUIRES_NEW)
    public void updateProductStore(Integer productId) {
        try{
            productInfoDao.updateProductInfo(productId);

        }
        catch (Exception e) {
            throw new RuntimeException("内部异常");
        }
    }


}
