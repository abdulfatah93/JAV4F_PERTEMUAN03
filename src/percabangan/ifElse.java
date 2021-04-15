package percabangan;

public class ifElse {
    public static void main(String[]args){
        double totalBelanja =53000;
        double uangDidompet =25000;

        if(uangDidompet>totalBelanja){
            System.out.println("uang kada cukup,kurangi belanjaan anda");
        }else if (uangDidompet<totalBelanja){
            double angsul = uangDidompet-totalBelanja;
            System.out.println("alhamdulillah uang cukup haja,ansul : "+angsul);
        }else {
            System.out.println("uang pas ..yuhuuu..");
        }
        }
    }

