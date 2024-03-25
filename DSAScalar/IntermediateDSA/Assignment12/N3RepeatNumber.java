package DSAScalar.IntermediateDSA.Assignment12;

import java.util.List;

public class N3RepeatNumber {
    public int repeatedNumber(final List<Integer> a) {
        int element1 = Integer.MIN_VALUE;
        int count1 = 0;
        int element2 = Integer.MIN_VALUE;
        int count2 = 0;

        for(int i=0; i<a.size(); i++){
            if(count1 == 0 && element2 != a.get(i)){
                element1 = a.get(i);
                count1 = 1;
            } else if(count2 == 0 && element1 != a.get(i)){
                element2 = a.get(i);
                count2 = 1;
            } else if(element1 == a.get(i)){
                count1++;
            } else if(element2 == a.get(i)){
                count2++;
            } else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int i=0; i<a.size(); i++){
            if(element1 == a.get(i))
                count1++;
            else if(element2 == a.get(i))
                count2++;
        }

        if(count1 > a.size()/3)
            return element1;
        else if(count2 > a.size()/3)
            return element2;

        return -1;
    
    }
}
