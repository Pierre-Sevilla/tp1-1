package fr.univ_amu.iut.exercice2;

public class FizzBuzzer {

    public String computeString(int i) {


        if(i%3==0 && i%5==0)
            return "FizzBuzz";
        else if(i%3==0)
            return "Fizz";
        else if(i%5==0)
            return "Buzz";
        else return ""+i;
    }

    public String[] computeList(int i) {

        String[] liste = new String[i];
        for(int y=0; y<i;++y){
            liste[y] = computeString(y+1);
        }
        return liste;

    }
}
