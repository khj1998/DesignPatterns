package OpenClosed.wrong;

public class Bills {

    public void CheckBurgerOrder(HamburgerOrderV1 ho){
        ho.ShowHamburgerPrice();
        ho.OrderHamburger();
    }

    public void CheckSetOrder(SetOrderV1 so){
        so.ShowSetPrice();
        so.SetOrder();
    }

    /**
    New Requirement : Fries Order
    It is possible to expand the function only when the existing code is modified.
    This breaks OCP principle.
     */
    public void CheckFriesOrder(FriesOrderV1 fo){
        fo.ShowFriesPrice();
        fo.FriesOrder();
    }
}
