package com.study.springcloud.service.impl;

import com.study.springcloud.dao.PaymentDao;
import com.study.springcloud.entities.Payment;
import com.study.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cp
 * @create 2019-12-29 15:41
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public void create(Payment payment) {
        paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public void delete(Long id) {
        paymentDao.delete(id);
    }

    @Override
    public void update(Payment payment) {
        paymentDao.update(payment);
    }

    @Override
    public List<Payment> list() {
        return paymentDao.list();
    }
}
