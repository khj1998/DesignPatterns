package OpenClosed.solution;

import OpenClosed.solution.Interfaces.Order;

public class SetOrderV2 implements Order {

    private static final int price = 8000;

    @Override
    public void OrderMenu() {
        ShowPrice();
        System.out.println("햄버거 세트메뉴 주문완료 되었습니다..");
    }

    @Override
    public void ShowPrice() {
        System.out.println("8000원 입니다.");
    }
}
