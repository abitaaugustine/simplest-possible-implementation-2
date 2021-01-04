import java.util.*;

public class PrimeFactors {

    public List<Integer> of(int number) {
        List<Integer> primeFactors=new ArrayList<Integer>();
        if(number!=1)
            primeFactors.add(number);
        return primeFactors;
    }

}
