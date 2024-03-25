package DSAScalar.IntermediateDSA.Assignment12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ColourfulNumbers {
    public class Solution {
    public int colorful(int A) {
        List<Integer> num = new ArrayList<>();
        int number;
        while(A != 0){
            number = A%10;
            num.add(number);
            A /= 10;
        }
        Collections.reverse(num);

        int product = 1;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<num.size(); i++){
            product = 1;
            for(int j=i; j<num.size(); j++){
                product *= num.get(j);
                if(hs.contains(product))
                    return 0;
                hs.add(product);
            }
        }

        return 1;
    }
}
}
