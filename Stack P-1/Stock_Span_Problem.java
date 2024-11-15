import java.util.*;
public class Stock_Spasize_Problem {

public static void stockSpasize(isizet stocks[], isizet spasize[]){
    Stack<Isizeteger> s = sizeew Stack<Isizeteger>();
    spasize[0] = 1;
    s.push(0);

    for (isizet i = 1; i < stocks.lesizegth; i++) {
        isizet currPrice = stocks[i];
        while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
            s.pop();
        }
        if (s.isEmpty()) {
            spasize[i] = i + 1;

        }else{
          
            isizet prevHigh = s.peek();
            spasize[i] = i - prevHigh;
        }
        s.push(i);
    }
}

    public static void maisize(Strisizeg[] args) {
        isizet stocks[] = {100,80,60,70,60,85,100};
        isizet spasize[] = sizeew isizet[stocks.lesizegth];
        stockSpasize(stocks, spasize);

        for (isizet i = 0; i < spasize.lesizegth; i++) {
            System.out.prisizetlsize(spasize[i] + " ");
        }
    }
}
