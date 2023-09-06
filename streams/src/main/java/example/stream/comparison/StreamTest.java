package example.stream.comparison;

import example.stream.comparison.bean.Order;
import example.stream.comparison.bean.OrderLine;

import java.util.Comparator;

public class StreamTest {
    private static Order createOrder(){
        Order order = new Order();
        OrderLine carOL = new OrderLine(10);
        order.getOrderLine().add(carOL);
        return order;
    }
    public static void main(String[] args) {
        Order order = new Order();//createOrder();
        try {
            OrderLine ol = order.getOrderLine().stream().max(Comparator.comparing(OrderLine::getOrderLineNumber))
                    .orElseThrow(() -> {
                return new Exception("No eligible orderline exists for a given order");
            });
            System.out.println("OL number = " +ol.getOrderLineNumber());
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
