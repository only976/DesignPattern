package Observer;

import Charlie.Charlie;
import Chocolate.Material;
import Chocolate.Color.Colors;
import FactoryParameter.Parameter;

public class CharlieObserver implements MaterialObserver{
    @Override
   public void update(Material material, Colors color) {
        int num=0;
        Charlie charlie = Charlie.charlie;
        double cost = 0;
        if(color==Colors.black){
            num = (int)(charlie.getAccount()/2/Parameter.blackMeterialPrice);
            cost = num*Parameter.blackMeterialPrice;
        }
        else {
            num = (int)(charlie.getAccount()/2/Parameter.whiteMeterialPrice);
            cost = num*Parameter.whiteMeterialPrice;
        }
        charlie.reduceAccount(cost);
        material.add(num);
        System.out.println("charlie花费"+cost+"购买了"+num+"份原料");
   }
}
