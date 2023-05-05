// intrinsic한 객체. 불변해야한다.
final class ItemModel {
    String type;
    Object texture;
    final Long lifeTime = 100L; // 100초간 아이템을 주울 수 있다.
    final Long memorySize = 1000L;

    public ItemModel(String type, Object texture) {
        this.type = type;
        this.texture = texture;
    }
}
