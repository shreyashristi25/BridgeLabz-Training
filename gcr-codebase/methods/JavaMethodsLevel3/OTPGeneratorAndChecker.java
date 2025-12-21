
import java.util.*      ;
public class OTPGeneratorAndChecker {

	// creating methods generateOTP, generateMultipleOTPs, areUnique to generate multiple otps and check for duplicates
    public static int generateOTP() {
   
        return (int)(Math.random() * 900000) + 100000 ;
    }

    public static int [] generateMultipleOTPs(int count) {
        int [] otp = new int[count] ;
        for (int i = 0 ; i < count ; i++) {
            otp[i] = generateOTP() ;
        }
        return otp ;
    }

    public static boolean areUnique(int [] otp) {
        for (int i = 0 ; i < otp.length ; i++) {
            for (int j = i + 1 ; j < otp.length ; j++) {
                if (otp[i] == otp[j]) {
                    return false ; 
                }
            }
        }
        return true ; 
    }

	public static void main(String args []) {
	
		//generating 10 random otps, checking for uniqueness and displaying result
		int [] otp = generateMultipleOTPs(10) ;

        System.out.println("Generated OTPs are : " + Arrays.toString(otp)) ;
        boolean unique = areUnique(otp) ;

        if (unique) {
            System.out.println("All OTPs are unique!") ;
        } else {
            System.out.println("Duplicate OTPs found!") ;
        }

    }
}