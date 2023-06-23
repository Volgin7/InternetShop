package pro.sky.internetshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.internetshop.model.Basket;
import pro.sky.internetshop.service.OrderServiceImpl;


@RestController
@RequestMapping("/store/order")
public class OrderController {
    private final OrderServiceImpl serviceOrder;

    public OrderController(OrderServiceImpl serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    @GetMapping("/add")
    public Basket addOrder(@RequestParam String idList) {
        return serviceOrder.add(idList);
    }

    @GetMapping("/get")
    public Basket getOrder() {
        return serviceOrder.get();
    }
}