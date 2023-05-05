import java.util.HashMap;
import java.util.Map;

public class ItemModelFactory {
    private static final Map<String,ItemModel> itemCache = new HashMap<>();

    public static ItemModel getInstance(String key) {
        if (itemCache.containsKey(key)) {
            System.out.println(key + " 객체를 캐싱합니다.");
            return itemCache.get(key);
        } else {
            ItemModel itemModel = new ItemModel(key,new ItemTexture());
            itemCache.put(key,itemModel);
            System.out.println(key + " 객체를 새로 생성합니다!" + itemModel.memorySize +" bytes 메모리 사용");
            System.out.println("");
            return itemModel;
        }
    }
}
