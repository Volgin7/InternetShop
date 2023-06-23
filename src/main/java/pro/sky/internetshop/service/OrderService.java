package pro.sky.internetshop.service;

import org.springframework.stereotype.Service;
import pro.sky.internetshop.model.Basket;

public interface OrderService {
    Basket add(String stringOfItems);
}
