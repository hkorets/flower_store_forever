package ua.edu.ucu.apps.flowerstore.delivery;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.flower.Item;

import java.util.List;
@Getter
public class PostDeliveryStrategy implements Delivery {
    private String description;
    public PostDeliveryStrategy() {
        this.description = "Post delivery";
    }
    public void deliver(List<Item> items){
        System.out.println("Delivering "+items.size()+" items via post delivery");
    }
}
