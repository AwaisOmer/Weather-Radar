package com.weather.pojos;
import com.weather.current.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import javax.ws.rs.core.UriInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.sql.Statement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;

import javax.ws.rs.core.UriInfo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CamelProcessor implements Processor {

	public String GetCurrentWeather(UriInfo info) throws Exception {
		
		 Gson gson = new GsonBuilder().create();
		
		 String city = info.getQueryParameters().getFirst("city");
		 String units = info.getQueryParameters().getFirst("units");
		 //System.out.println(units + city);
		 String output="";
		 String req="Get request for Current weather details for " + city + "with units as " + units;
		 String Actual_Unit=changeParams(units);
		 //real request---------------------------------------------------------------------------------------------
		 try {
			 //System.out.println(Actual_Unit + city);
			 URL urlForGetRequest = new URL("https://community-open-weather-map.p.rapidapi.com/weather?units=" + Actual_Unit +"&q=" + city);
			 String readLine = null;
			 HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
			 conection.setRequestMethod("GET");
			 conection.setRequestProperty("X-RapidAPI-Key", "5c329a225fmshb1f9af15d331c0fp177152jsn5d0c98571448"); // set userId its a sample here
			 int responseCode = conection.getResponseCode();
			 if (responseCode == HttpURLConnection.HTTP_OK) {
				 BufferedReader in = new BufferedReader(
		         new InputStreamReader(conection.getInputStream()));
				 StringBuffer response = new StringBuffer();
				 while ((readLine = in .readLine()) != null) {
					 response.append(readLine);
		        } 
				 in .close();
				 output=response.toString();
				 System.out.println(output);
				 CurrentResponse result = gson.fromJson(output, CurrentResponse.class);
			 } 
			 else {
				 BufferedReader in = new BufferedReader(
				 new InputStreamReader(conection.getInputStream()));
				 StringBuffer response = new StringBuffer();
				 while ((readLine = in .readLine()) != null) {
					 response.append(readLine);
				  } 
				 in .close();
				 output=response.toString();
				 System.out.println("GET NOT WORKED");
				 //System.out.println(output);
			 }
		 }
		 catch(Exception e) 
		 {
			 System.out.println(e);
			 String Erroroutput="Error getting the City Weather details";
			 return Erroroutput;
		 }
		 
		 try{
			 String sql = "INSERT INTO Request_Info " + "VALUES(" + req + "," + output + ")";
			 DataSource data=new DataSource();
			 data.setHost("jdbc:sqlserver://LHRLT-719:1433;databaseName=AshghalWeatherPOC");
			 data.setUsername("sa");
			 data.setPassword("abcd@1234");
			 Connection con=data.getConnectin();
			 Statement stmt = con.createStatement();
			 stmt.executeUpdate("INSERT INTO Request_Info VALUES("+"'"+ req + "' , '" + output + "')");
			}
				
		catch(Exception e){
			System.out.println(e);
					
			}	
		 
		    
		return output;
	}

	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		
	}


	public String changeParams(String un) {
		String met="celcius";
		String imp="fahrenheit";
		
		if(un.toLowerCase().indexOf(met.toLowerCase()) != -1) {
			 //System.out.println("here in metric");
			 un="metric";
		}
		else if(un.toLowerCase().indexOf(imp.toLowerCase()) != -1) {
			 un="imperial";
			 //System.out.println("Here in imperial");
		}
		else
			un="metric";
		return un;
	}
}