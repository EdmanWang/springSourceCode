package com.wgx.service;


/**
 * @Author EdmanWang
 * @create 2020/2/21 17:50
 */
public interface PayService {


    void pay(String accountId, double money);

    void updateProductStore(Integer productId);
}
