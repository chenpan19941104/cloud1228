package com.study.springcloud.service;

import com.study.springcloud.entities.Payment;

import java.util.List;

/**
 * @author cp
 * @create 2019-12-29 15:40
 */
public interface PaymentService {
    public void create(Payment payment);

    public Payment getPaymentById(Long id);

    public void delete(Long id);

    public void update(Payment payment);

    public List<Payment> list();
}
