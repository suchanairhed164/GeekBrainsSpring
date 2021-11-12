package com.example.geekbrainsspring.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShopService {
    //@Autowired
    private ProductService productService;
    //@Autowired
    private OrderService orderService;
    //@Autowired
    private MailService mailService;
    private BeanInterface beanInterface1;
    private BeanInterface beanInterface2;

    @Autowired
    //@Qualifier("advBeanInterfaceImpl")
    @Qualifier("beanInterfaceImpl")
    public void setBeanInterface1(BeanInterface beanInterface) {
        this.beanInterface1 = beanInterface;
    }

    @Autowired
    @Qualifier("advBeanInterfaceImpl")
    public void setBeanInterface2(BeanInterface beanInterface) {
        this.beanInterface2 = beanInterface;
    }

    /*
        @Autowired
        public ShopService(ProductService productService, OrderService orderService, MailService mailService) {
            this.productService = productService;
            this.orderService = orderService;
            this.mailService = mailService;
        }

         */
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
    @Autowired
    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }



    public void buy(){
        productService.getProducts();
        orderService.createOrder();
        mailService.sendMail();
        beanInterface1.doSomething();
        beanInterface2.doSomething();
    }
}
