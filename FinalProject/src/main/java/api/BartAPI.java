/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.*; 

/**
 *
 * @author aungphyo
 */
public class BartAPI {
    
    static JSONObject obj; 
    private static String fromStation = "ashb"; 
    private static String toStation = "civc"; 
    private static String baseURI_Product = "http://api.bart.gov/api/sched.aspx?cmd=depart&orig=" + fromStation + "&dest=" + toStation +"&date=now&key=ZZ22-58T5-93RT-DWEI&b=2&a=2&l=1&json=y";
    
    public static Map<String,String> map = new HashMap(); 
    
    public BartAPI(){
        

    }
    
    public static JSONObject bartAPICalled(String baseurl){
        HttpURLConnection conn = null; 
        try{
            
            String inline = ""; 
            URL url = new URL(baseurl);
            
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            
            int responsecode = conn.getResponseCode();
            
            if(responsecode != 200){
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            }else{
                
                //String inline = ""; 
                Scanner scanner = new Scanner(url.openStream());
                
                while(scanner.hasNext()){
                    inline += scanner.nextLine();
                }
                
                scanner.close();
                
                JSONTokener parse = new JSONTokener(inline); 
                
                
                obj = (JSONObject) parse.nextValue();
           
            }
            
           
            
        }catch(Exception e){
              e.printStackTrace();
        }
        finally{
              conn.disconnect();
        }
        
        return obj; 
    }//end productMediator()
    
    public static void mapValue(){
        map.put("12th St. Oakland City Center", "12TH"); 
        map.put("16th St. Mission", "16TH"); 
        map.put("19th St. Oakland", "19TH"); 
        map.put("24th St. Mission", "24TH"); 
        map.put("Antioch", "ANTC"); 
        map.put("Ashby", "ASHB"); 
        map.put("Balboa Park", "BALB"); 
        map.put("Bay Fair", "BAYF"); 
        map.put("Berryessa/North San Jose", "BERY"); 
        map.put("Castro Valley", "CAST"); 
        map.put("Civic Center/UN Plaza", "CIVC"); 
        map.put("Coliseum", "COLS"); 
        map.put("Colma", "COLM"); 
        map.put("Concord", "CONC"); 
        map.put("Daly City", "DALY"); 
        map.put("Downtown Berkeley", "DBRK"); 
        map.put("Dublin/Pleasanton", "DUBL"); 
        map.put("El Cerrito del Norte", "DELN"); 
        map.put("El Cerrito Plaza", "PLZA"); 
        map.put("Embarcadero", "EMBR"); 
        map.put("Fremont", "FRMT"); 
        map.put("Fruitvale", "FTVL"); 
        map.put("Glen Park", "GLEN"); 
        map.put("Hayward", "HAYW");
        map.put("Lafayette", "LAFY"); 
        map.put("Lake Merritt", "LAKE"); 
        map.put("MacArthur", "MCAR"); 
        map.put("Millbrae", "MLBR"); 
        map.put("Milpitas", "MLPT"); 
        map.put("Montgomery St.", "MONT"); 
        map.put("North Berkeley", "NBRK"); 
        map.put("North Concord/Martinez", "NCON"); 
        map.put("Oakland International Airport", "OAKL"); 
        map.put("Orinda", "ORIN"); 
        map.put("Pittsburg/Bay Point", "PITT"); 
        map.put("Pittsburg Center", "PCTR"); 
        map.put("Pleasant Hill/Contra Costa Centre", "PHIL");  
        map.put("Powell St.", "POWL"); 
        map.put("Richmond", "RICH"); 
        map.put("Rockridge", "ROCK"); 
        map.put("San Bruno", "SBRN");
        map.put("San Francisco International Airport", "SFIA"); 
        map.put("San Leandro", "SANL"); 
        map.put("South Hayward", "SHAY"); 
        map.put("South San Francisco", "SSAN"); 
        map.put("Union City", "UCTY"); 
        map.put("Walnut Creek", "WCRK"); 
        map.put("Warm Springs/South Fremont", "WARM");  
        map.put("West Dublin/Pleasanton", "WDUB"); 
        map.put("West Oakland", "WOAK"); 
    }
    
    public static void main(String[]args){
        //bartAPI(); 
    }
    
}
