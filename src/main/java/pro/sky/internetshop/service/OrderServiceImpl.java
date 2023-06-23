package pro.sky.internetshop.service;

import org.springframework.stereotype.Service;
import pro.sky.internetshop.model.Basket;

import java.util.List;


import java.util.*;
import java.util.stream.Collectors;


@Service
public class OrderServiceImpl implements OrderService {

    private Basket orderBasket;
    @Override
    public Basket add(String idList) {
        String[] idListArray = idList.split(",");
        int[] intOfItemsArray = Arrays.stream(idListArray).mapToInt(Integer::parseInt).toArray();

        List<Integer> listOfItems = Arrays.stream(intOfItemsArray).boxed().collect(Collectors.toList());
        orderBasket = new Basket(listOfItems);
        return orderBasket;

 //       Basket newOrderBasket = new Basket(listOfItems);
 //       return newOrderBasket;
    }
    @Override
    public Basket get() {
        return orderBasket;
    }

}
