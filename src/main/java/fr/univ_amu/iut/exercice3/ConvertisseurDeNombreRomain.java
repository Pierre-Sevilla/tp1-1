package fr.univ_amu.iut.exercice3;

import java.util.HashMap;

public class ConvertisseurDeNombreRomain {
    public int enNombreArabe(String i) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res=0;
        int ret=0;

        for (char c : i.toCharArray()) {
            if (ret >= map.get(c) || ret == 0)
                res += map.get(c);
            else
                res += map.get(c) - 2 * ret;
            ret = map.get(c);
        }
        return res;
    }

}
