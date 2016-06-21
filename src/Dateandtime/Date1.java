package Dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1{
public static void main(String args[]){
	Date date = new Date();
	
	
	 SimpleDateFormat ft = 
		      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	//printing date format
         System.out.println(date);
        //printing simple date format 
         System.out.println("Current Date: " + ft.format(date));
         
System.out.println(date+""+"Current Date: " + ft.format(date));
	// changes made
}
}
