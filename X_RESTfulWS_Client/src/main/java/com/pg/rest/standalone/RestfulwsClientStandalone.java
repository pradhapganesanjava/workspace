package com.pg.rest.standalone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestfulwsClientStandalone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String baseURLStr = "http://localhost:8020/X_RESTfulWS_Jersey/";
		String rootPath = "messages/";
		String urlGet = String.format("%s%s%s", baseURLStr, rootPath, "1");

		//httpGetMethodInvoke(urlGet);

		String urlPost = String.format("%s%s", baseURLStr, rootPath);

		httpPostMethodInvoke(urlPost);
	}

	private static void httpPostMethodInvoke(String urlPost) {
		try{
System.out.println("URL post "+urlPost);
			URL url = new URL(urlPost);
			HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();
			httpUrlConn.setRequestMethod("POST");
			httpUrlConn.setRequestProperty("Content-Type", "application/json");
			httpUrlConn.setDoOutput(true);

			String postStr = "{\"createdBy\":\"ganesan\",\"createdDt\":\"2016-01-21T14:42:55.856\",\"message\":\"Hi I am new\"}";

			OutputStream outStream = httpUrlConn.getOutputStream();
			outStream.write(postStr.getBytes());
			outStream.flush();

			System.out.println(" http post response status " + httpUrlConn.getResponseCode());

			BufferedReader buffRead = new BufferedReader(new InputStreamReader(
					httpUrlConn.getInputStream()));
			String resLine = null;
			while((resLine = buffRead.readLine()) != null){
				System.out.println("post response " + resLine);
			}

		}catch(MalformedURLException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			
		}
	}

	private static void httpGetMethodInvoke(String urlStr) {
		HttpURLConnection httpUrlConn = null;
		try{

			System.out.println("URLstr? " + urlStr);
			URL url = new URL(urlStr);
			httpUrlConn = (HttpURLConnection) url.openConnection();
			httpUrlConn.setRequestMethod("GET");
			httpUrlConn.setRequestProperty("accept", "application/json");

			if(httpUrlConn.getResponseCode() == 200){
				String line = null;
				BufferedReader buffRead = new BufferedReader(new InputStreamReader(
						httpUrlConn.getInputStream()));
				while((line = buffRead.readLine()) != null){
					System.out.println(" http response " + line);
				}
			}

		}catch(MalformedURLException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(null != httpUrlConn){
				httpUrlConn.disconnect();
			}
		}
	}

}
