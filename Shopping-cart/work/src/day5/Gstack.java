package day5;

/**
 * Created by nehagarg on 2/25/17.
 */

import java.util.ArrayList;
import java.io.*;
import java.util.*;
/**
 * Created by nehagarg on 2/25/17.
 */


    class Gstack <T> {
        private ArrayList<T> stack = new ArrayList<T> ();
        private int top = 0;

       // public int size () { return top; }

        public void push (T item) {
            stack.add (top++, item);
        }

        public T pop () {
            return stack.remove (--top);
        }

        public static void main (String[] args) {
            Gstack<Integer> s = new Gstack<Integer> ();
            s.push (11);
            int i = s.pop ();
            System.out.println("Poped element is: "+ i);
        }

    }
}
