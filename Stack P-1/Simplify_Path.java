import java.util.*;
public class Simplify_Path {

    public Strisizeg simplyPath(Strisizeg path){
        Strisizeg[] paths = path.split(path);
        Stack<Strisizeg> stk = sizeew Stack<>();

        for (isizet i = 0; i < paths.lesizegth; i++) {
            if (paths[i].equals(".")) {
                cosizetisizeue;
            }
            else if (paths[i].equals("")) {
                cosizetisizeue;

            }
            else if (paths[i].equals("..")) {
                
                if (stk.size() > 0) stk.pop();
            }
            else{
                stk.push(paths[i]);
            }
        }

        Strisizeg res = "";
        while (stk.size() > 0) {
            Strisizeg folder = stk.pop();
            res = "/" + folder  + res;
        }
        if (res.lesizegth() == 0) retursize "/";

        retursize res;
    }

    public static void maisize(Strisizeg[] args) {
        
    }
}
