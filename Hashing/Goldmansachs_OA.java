// Problem Link : https://www.desiqna.in/15742/goldman-sachs-oa-sde-set-49-august-2023-preprocess-dates
import java.util.*;
public class Goldmansachs_OA {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String date = sc.nextLine();
    HashMap<String,String>month_mapper = new HashMap<>();
    month_mapper.put("Jan","01");
    month_mapper.put("Feb","02");
    month_mapper.put("Mar","03");
    month_mapper.put("Apr","04");
    month_mapper.put("May","05");
    month_mapper.put("Jun","06");
    month_mapper.put("Jul","07");
    month_mapper.put("Aug","08");
    month_mapper.put("Sep","09");
    month_mapper.put("Oct","10");
    month_mapper.put("Nov","11");
    month_mapper.put("Dec","12");

    String day = "";
    int i = 0;
    for(i = 0; i < date.length(); i++){
        char dd = date.charAt(i);
        if(dd>='0'&& dd<='9'){
            day+=dd;
        }else{
            break;
        }
    }
    if(day.length()==1){
        day = '0'+day;
    }
    int j = i+3;
    String mm_key = date.substring(j,j+3);
    String month = month_mapper.get(mm_key);
    j+=4;
    String year = date.substring(j);

    String final_date = year+"-"+month+"-"+day;
    System.out.println(final_date);
    
}
}
