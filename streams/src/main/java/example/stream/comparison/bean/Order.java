package example.stream.comparison.bean;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private List<OrderLine> orderLine = new ArrayList<OrderLine>(0);
}
