package OpenClosed;

import OpenClosed.solution.BillsV2;
import OpenClosed.solution.FriesOrderV2;
import OpenClosed.solution.HamburgerOrderV2;
import OpenClosed.solution.Interfaces.Order;
import OpenClosed.solution.SetOrderV2;
import OpenClosed.wrong.Bills;
import OpenClosed.wrong.HamburgerOrderV1;
import OpenClosed.wrong.SetOrderV1;
import OpenClosed.wrong.FriesOrderV1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args){

        /*
        Break OCP case
         */
        Bills bills = new Bills();
        bills.CheckBurgerOrder(new HamburgerOrderV1());
        bills.CheckSetOrder(new SetOrderV1());
        //new requirement
        bills.CheckFriesOrder(new FriesOrderV1());

        System.out.println("\n");

        /*
        OCP case
         */
        BillsV2 billsV2 = new BillsV2();
        List<Order> orders = new ArrayList<Order>();
        orders.add(new HamburgerOrderV2());
        orders.add(new SetOrderV2());
        //new requirement
        orders.add(new FriesOrderV2());

        billsV2.CheckOrder(orders);
    }
}
