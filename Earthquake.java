public class Earthquake
{
    public double magnitude;
    public int depth;
    // Default constructor
    Earthquake(){
    magnitude=0.0;
    depth=0;
    }
    // Parameterized Constructor
    Earthquake(double m,int d){
        magnitude = m;
        depth = d;
    }
    public void earthquakeType()
    {
     String typeFromMagnitude;
     String typeFromDepth;

     // Deciding type of earthquake on basis of magnitude
     if(magnitude<2.0){
         typeFromMagnitude = "Micro Earthquake";
     }
     else if(magnitude>2.0 && magnitude<3.9){
         typeFromMagnitude = "Light Earthquake";
     }
     else if(magnitude>4.0 && magnitude<5.9){
         typeFromMagnitude = "Strong Earthquake";
     }
     else if(magnitude>6.0 && magnitude<6.9){
         typeFromMagnitude = "Major Earthquake";
     }
     else if(magnitude>7.0 && magnitude<7.9){
         typeFromMagnitude = "Great Earthquake";
     }
     else{
         typeFromMagnitude = "Severe Earthquake";
     }

     // Deciding type of earthquake on basis of depth
     if(depth<70){
         typeFromDepth = "Shallow Earthquake";
     }
     else if(depth>70 && depth<300){
        typeFromDepth = "Intermediate-depth Earthquake";
     }
     else{
        typeFromDepth = "Deep Earthquake";
     }

        System.out.println("EarthQuake type: "+typeFromMagnitude+
    "\nDepth : "+typeFromDepth);

    }// method ends here
    void aftershocks(){
       String afterShocks;
       String potentialDamage;
       String precaution;
       if(magnitude<4.9){
        afterShocks = "Few hours to days";
        potentialDamage = "Minor structural damage to buildings, such as cracks in walls";
        precaution = "Be prepared for potential disruptions to" +
                " utilities (gas, water, electricity) and have emergency supplies on hand";
       }
       else if(magnitude>5.0 && magnitude<6.9){
        afterShocks = "Days to week";
        potentialDamage = "Accumulated damage to structures," +
                " including weakened or cracked buildings";
        precaution = "Secure heavy furniture and appliances to prevent them from toppling.";
       }
       else if(magnitude>7.0 && magnitude< 7.9){
        afterShocks = "Weeks to months";
        potentialDamage = "Ongoing stress on buildings, leading to progressive structural damage";
        precaution = "Stay updated on aftershock forecasts and preparedness information from local authorities.";
       }
       else {
        afterShocks = "Month to years";
        potentialDamage = "Increased risk of landslides, especially in hilly or mountainous regions";
        precaution = "Encourage community resilience and support networks.";
       }

        System.out.println("After-shocks : "+afterShocks
        +"\nPotential Damage: "+potentialDamage
        +"\nPrecautions: " +precaution);
    } // method ends here
}// Class ends here
