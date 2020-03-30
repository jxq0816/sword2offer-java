package offer.power;

public class Solution {
    public double Power(double base, int exponent) {
        double rs=1.0;
        if(exponent==0){
            rs=1.0;
        }else if(exponent>0){
            for(int i=0;i<exponent;i++){
                rs*=base;
            }
        }else{
            for(int i=0;i<-exponent;i++){
                rs*=base;
            }
            rs=1.0/rs;
        }
        return rs;
    }
}
