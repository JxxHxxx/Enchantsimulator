package ToyProject.Wear;

import ToyProject.EnchantPercentageTable;

import java.util.Random;

public class Weapon extends Wear{
    
    EnchantPercentageTable ept = EnchantPercentageTable.getInstance();

    @Override
    public void enchant() {
        Random random = new Random();
        // pos = probability of success
        int pos = ept.weapon[getValue()];

        // 성공확률보다 작은 수가 나온다면 강화는 성공해야함 , 실패시 수치 초기화
        if (pos >= random.nextInt(100)) {
            value++;
        }
        else {
            value = 0;
        }
    }
}
