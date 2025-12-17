//create class VolumeOfEarth to calculate volume of earth
public class VolumeOfEarth {
   public static void main (String args []) {
   
   //create variable radius and assign it the radius of earth
   int radius = 6378 ;
   double volumeInKilometers = (4/3)*3.14 * radius ;
   double volumeInMiles = volumeInKilometers * 1.6 ;
   
   //Dsiplaying Volume of Earth in Kilometers and miles
   System.out.println("The volume of earth in cubic kilometers is " +volumeInKilometers +" and cubic miles is " +volumeInMiles) ;
   
   }
}