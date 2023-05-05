//extrinsic한 객체. 각 모델마다 가지는 고유한 객체이다.
public class Item {
    int amount;
    double posX;
    double posY;
    ItemModel itemModel;

    public Item(ItemModel model,int amount, double posX, double posY) {
        this.itemModel = model;
        this.amount = amount;
        this.posX = posX;
        this.posY = posY;
    }
}
