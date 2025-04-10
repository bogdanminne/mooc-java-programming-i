


public class Playground {


    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
    
        
        


      
        /* 
         * 1 birth - 7 seconds
         * 1 death - 13 seconds
         * 1 immigrant - 45 seconds
         * 
         * current population = 312032486
         * one year = 365 days
         * 
         * what population for each in the next 5 years? 
         * 
         * we need to figure out the birth / death / immigrant per second, so as to more easily calculate, so:
         * 
         * birth per second = 1/7
         * death per second = 1/13
         * immigrant per second = 1/45
         * 
         * now we need to calculate how many seconds in one year:
         * 
         * seconds per one year = 31536000
         * 
         * now we need to calculate how many seconds in 5 years:
         * 
         * 
         * seconds per 5 years = 157680000
         * 
         * 
         * now we need to calculate how many births, deaths and immigrants will be ADDED in 5 years
         * 
         * births in 5 years = 157680000 / 7 = 22525714
         * deaths in 5 years = 157680000 / 13 = 12129230
         * immigrands in 5 years = 157680000 / 45 = 3504000
         * 
         * 
         * 
         * now we just add these numbers to the initial pop, which was 312032486
         * 
         * 
        */


        int current_population = 312032486;
        float seconds_in_5_years = 157680000f;


        float birth_per_second = 1/7f;
        float death_per_second = 1/13f;
        float immigrant_per_second = 1/45f;

        float births_in_5_years = seconds_in_5_years * birth_per_second;
        
        
        

        float deaths_in_5_years = seconds_in_5_years * death_per_second;
        float immigrants_in_5_years = seconds_in_5_years * immigrant_per_second;

        float pop_in_5_years = current_population + births_in_5_years - deaths_in_5_years + immigrants_in_5_years;
        
     

        System.out.println("Ce populatie va fi peste 5 ani: ");
        System.out.println("----------------------------------");
        System.out.print("Births in 5 years: ");
        System.out.println(String.format("%.1f", births_in_5_years));
        System.out.print("Deaths in 5 years: ");
        System.out.println(String.format("%.1f", deaths_in_5_years));
        System.out.print("Influx immigrants in 5 years: ");
        System.out.println(immigrants_in_5_years);

        System.out.println(String.format("%.2f", pop_in_5_years));









        System.out.println("");
        System.out.println("");
    }
}
