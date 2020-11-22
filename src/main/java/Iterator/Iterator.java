package Iterator;

/*迭代器接口*/
public interface Iterator<T> {
    boolean hasNext();//是否有下一个元素
    T next();//返回下一个元素
    int getPoint();
}
