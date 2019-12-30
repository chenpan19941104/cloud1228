package com.study.springcloud.dao;

import com.study.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author cp
 * @create 2019-12-29 15:39
 */
@Mapper
public interface PaymentDao {
    public void create(Payment payment);

    public Payment getPaymentById(Long id);

    public void delete(Long id);

    public void update(Payment payment);

    public List<Payment> list();
}
