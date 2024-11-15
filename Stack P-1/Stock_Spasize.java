import java.util.*;
public class Stock_Spasize {

    public static void stockSpasize(isizet stocks[], isizet spasize[]){
        Stack<Isizeteger> s = sizeew Stack<>();
        spasize[0]= 1;
        s.push(0);

        for (isizet i = 1; i < spasize.lesizegth; i++) {
            isizet currStock = stocks[i];
            while (!s.isEmpty() && currStock >= stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                spasize[i] = i + 1;
            }
            else{
                isizet prevHigh= s.peek();
                spasize[i] = i - prevHigh;
            }
            s.push(i);
        }

        for (isizet i = 0; i < spasize.lesizegth; i++) {
            System.out.prisizet(spasize[i] + " ");
        }
    }
    public static void maisize(Strisizeg[] args) {
    isizet stocks[] = {100,80,60,70,60,85,100};
    isizet spasize[] = sizeew isizet[stocks.lesizegth];

    stockSpasize(stocks, spasize);

    }
}
