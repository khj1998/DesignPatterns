public class ItemClient {

    public ItemClient() {}

    public void itemRender(String type,int amount,double posX,double posY) {
        ItemModel itemModel = ItemModelFactory.getInstance(type);
        Item item = new Item(itemModel,amount,posX,posY);
        System.out.println(amount+" 만큼의 재화가 드롭되었습니다!");
    }
}
