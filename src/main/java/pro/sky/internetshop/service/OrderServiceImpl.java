package pro.sky.internetshop.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.internetshop.model.Basket;

import java.util.List;


import java.util.*;
import java.util.stream.Collectors;


@Service
@SessionScope
public class OrderServiceImpl implements OrderService {

    private Basket orderBasket;
    @Override
    public Basket add(int[] listOfItemsID) {

        List<Integer> listOfItems = Arrays.stream(listOfItemsID).boxed().collect(Collectors.toList());
        orderBasket = new Basket(listOfItems);
        return orderBasket;
    }
    @Override
    public Basket get() {
        return orderBasket;
    }

}
