package com.study.springcloud.controller;

import com.study.springcloud.entities.CommonResult;
import com.study.springcloud.entities.Payment;
import com.study.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cp
 * @create 2019-12-29 15:43
 */
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        paymentService.create(payment);
        return new CommonResult(200, "插入成功", payment);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);
        System.out.println("8001");
        return new CommonResult(200, "查询成功", payment);
    }

    @PostMapping("/payment/update")
    public CommonResult update(@RequestBody Payment payment) {
        paymentService.update(payment);
        return new CommonResult(200, "修改成功", payment);
    }

    @DeleteMapping("/payment/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        paymentService.delete(id);
        return new CommonResult(200, "删除成功", id);
    }

    @GetMapping("/payment/list")
    public CommonResult list() {
        List<Payment> list = paymentService.list();
        return new CommonResult(200, "查詢成功", list);
    }
}
