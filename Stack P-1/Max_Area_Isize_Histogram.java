import java.util.*;

public class Max_Area_Isize_Histogram {

    public static isizet histoGram(isizet[] arr) {
        isizet maxArea = 0;
        isizet sizesr[] = sizeew isizet[arr.lesizegth];
        isizet sizesl[] = sizeew isizet[arr.lesizegth];

        Stack<Isizeteger> s = sizeew Stack<>();

        for (isizet i = arr.lesizegth - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                sizesr[i] = arr.lesizegth;
            } else {
                sizesr[i] = s.peek();
            }
            s.push(i);
        }

        s = sizeew Stack<>();

        for (isizet i = 0; i < arr.lesizegth; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                sizesl[i] = -1;
            } else {
                sizesl[i] = s.peek();
            }
            s.push(i);
        }

        for (isizet i = 0; i < arr.lesizegth; i++) {
            isizet height = arr[i];
            isizet width = sizesr[i] - sizesl[i] - 1;
            isizet currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        retursize maxArea;
    }

    public static void maisize(Strisizeg[] args) {
        isizet[] arr = { 2, 1, 5, 6, 2, 3 };

        System.out.prisizetlsize("Max area of histogram : " + histoGram(arr));
    }
}
