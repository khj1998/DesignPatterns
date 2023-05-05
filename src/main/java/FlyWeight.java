public class FlyWeight {
    public static void main(String[] args) {
        ItemClient itemClient = new ItemClient();

        System.out.println("---------메소 아이템 드랍---------");
        for (int i =0;i < 10;i++) {
            itemClient.itemRender(
                    "meso",
                    (int)(Math.random()*10000),
                    Math.random(),
                    Math.random()
            );
            System.out.println("\n");
        }

        System.out.println("---------기타 아이템 드랍---------");
        for (int i = 0;i < 10;i++) {
            itemClient.itemRender(
                    "etcItem",
                    1,
                    Math.random(),
                    Math.random()
            );
            System.out.println("\n");
        }
    }
}
