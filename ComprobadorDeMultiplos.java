public class ComprobadorDeMultiplos{

    public ComprobadorDeMultiplos(){
    }

    public boolean esMultiploDe2(int comproba1){
        if (comproba1 == 0){
            return false;
        }
        else{
            if (comproba1 % 2 == 0){
                return true;
            }
            else {
                return false;
            }
        }
    }

    public boolean esMultiploDe5(int comproba1){
        if(comproba1 <= 0 ){
            return false;
        }
        else{
            if (comproba1 % 5 == 0){
                return true;
            }
            else {
                return false;
            }
        }
    }

    public boolean esMultiploDe(int comproba1,int multiplo){
        if(comproba1 < multiplo || comproba1 == 0 || multiplo == 0){
            return false;
        }
        else{
            if (comproba1 % multiplo == 0){
                return true;
            }
            else {
                return false;
            }

        }
    }
}
