public class ComprobadorDeMultiplos{

    public ComprobadorDeMultiplos(){
    }
    public boolean esMultiploDe2(int comproba1){
        boolean resto2;
        resto2 = false;
        if (comproba1 < 2) {
            resto2 = false;
        }
        else{

            if (comproba1 % 2 == 0){
                resto2 = true;
            }

        }
        return resto2 ;
    }

    public boolean esMultiploDe5(int comproba1){
        boolean resto5;
        resto5 = false;
        if(comproba1 <= 0 ){
            resto5 = false;
        }
        else{
            if (comproba1 % 5 == 0){
                resto5 = true;
            }
        }
        return resto5;
    }

    public boolean esMultiploDe(int comproba1,int multiplo){
        boolean restoN;
        restoN = false;
        if(comproba1 < multiplo || comproba1 == 0 || multiplo == 0){
            restoN = false;
        }
        else{
            if (comproba1 % multiplo == 0){
                restoN = true;
            }
        }
        return restoN;
    }
}
