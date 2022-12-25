package OpenClosed.solution;

import OpenClosed.solution.Interfaces.Order;

import java.util.List;

public class BillsV2 {

    /**
     Extend capabilities without modifying existing code.
     */

    public void CheckOrder(List<Order> orders){

        for (Order order: orders){
            order.OrderMenu();
        }
    }
}
