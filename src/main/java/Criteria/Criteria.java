package Criteria;

import java.util.List;
import Chocolate.Chocolate;

public interface Criteria {
    //过滤巧克力
    public List<Chocolate> meetCriteria(List<Chocolate> chocolates);
}
