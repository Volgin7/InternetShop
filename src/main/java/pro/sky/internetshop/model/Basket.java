package pro.sky.internetshop.model;

import java.util.List;

public class Basket {
    private List<Integer> itemsIDList;

    public Basket(List<Integer> itemsIDList) {
        this.itemsIDList = itemsIDList;
    }

    public List<Integer> getItemsIDList() {
        return itemsIDList;
    }

    public void setItemsIDList(List<Integer> itemList) {
        this.itemsIDList = itemsIDList;
    }
}
