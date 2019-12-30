package com.study.springcloud.controller;

import com.study.springcloud.entities.CommonResult;
import com.study.springcloud.entities.Payment;
import org.omg.CORBA.COMM_FAILURE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cp
 * @create 2019-12-29 16:45
 */
@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
//    public static final String PaymentSrv_URL = "http://localhost:8001";
    public static final String PaymentSrv_URL = "http://cloud-payment-service";


    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject(PaymentSrv_URL + "/payment/create", payment, CommonResult.class);
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        return restTemplate.getForObject(PaymentSrv_URL+"/payment/get/"+id, CommonResult.class, id);
    }
    @GetMapping("/consumer/payment/list")
    public CommonResult list(){
        return restTemplate.getForObject(PaymentSrv_URL+"/payment/list", CommonResult.class);
    }
}
