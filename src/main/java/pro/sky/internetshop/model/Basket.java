package pro.sky.internetshop.model;

import java.util.List;

public class Basket {
    private List<Item> itemList;

    public Basket(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
