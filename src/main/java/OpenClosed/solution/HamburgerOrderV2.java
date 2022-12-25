package OpenClosed.solution;

import OpenClosed.solution.Interfaces.Order;

public class HamburgerOrderV2 implements Order {

    private static final int price = 6500;

    @Override
    public void OrderMenu() {
        ShowPrice();
        System.out.println("햄버거 단품메뉴 주문완료 되었습니다.");
    }

    @Override
    public void ShowPrice() {
        System.out.println("5000원 입니다.");
    }
}
