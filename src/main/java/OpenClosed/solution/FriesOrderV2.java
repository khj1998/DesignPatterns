package OpenClosed.solution;

import OpenClosed.solution.Interfaces.Order;

public class FriesOrderV2 implements Order {

    @Override
    public void OrderMenu() {
        ShowPrice();
        System.out.println("감자튀김 단품메뉴 주문완료 되었습니다.");
    }

    @Override
    public void ShowPrice() {
        System.out.println("2000원 입니다.");
    }
}
