package com.pg.ws.handler.universaltime;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.jws.WebService;

/***
 * 
 * bin>wsgen -cp . com.pg.ws.handler.universaltime.UniversalTimeServiceImpl -wsdl -r ../wsdl/wsgen/UniversalTime -keep -s ../src -verbose
 *> wsimport file:wsdl/wsimport/UniversalTime/UniversalTimeServiceSEI.wsdl -keep -s src/ -p com.pg.ws.client.handler.universaltime -verbose -Xnocompile  
 *
  wsgen:
  Time -keep -s ../src -verbose
	Note:   ap round: 1
	[ProcessedMethods Interface: com.pg.ws.handler.universaltime.UniversalTimeService]
	[should process method: getCurrentTime hasWebMethods: false ]
	[endpointReferencesInterface: true]
	[declaring class has WebSevice: true]
	[returning: true]
	[WrapperGen - method: getCurrentTime(java.lang.String,java.lang.String)]
	[method.getDeclaringType(): com.pg.ws.handler.universaltime.UniversalTimeService]
	[requestWrapper: com.pg.ws.handler.universaltime.jaxws.GetCurrentTime]
	...GetCurrentTime.java
	...GetCurrentTimeResponse.java
	Note:   ap round: 2
 *
 */

/**
 * with handler
 * 
 * bin>wsgen -cp . com.pg.ws.handler.universaltime.UniversalTimeServiceImpl -wsdl -r ../wsdl/wsgen/UniversalTimeHandler -keep -s ../src -verbose
 *> wsimport file:wsdl/wsimport/UniversalTimeHandler/UniversalTimeServiceSEI.wsdl -keep -s src/ -p com.pg.ws.client.handler.universaltime -verbose -Xnocompile  

 * @author pganesan
 *
 */

@WebService(serviceName="UniversalTimeServiceSEI",endpointInterface="com.pg.ws.handler.universaltime.UniversalTimeService")
public class UniversalTimeServiceImpl {

	enum COUNTRY{
		USA, IND, AUS,NZ,CN,JP
	}
	
	enum TIMEZONE{
		EST("US/Eastern"), CST("US/Central"), PST("US/Pacific"),IST("Asia/Calcutta");
		public TimeZone timeZone;
		private TIMEZONE(String timeZoneValue) {
			this.timeZone = TimeZone.getTimeZone(timeZoneValue);
		}
		
	}
	
	public String getCurrentTime(String country) {
		String currentTime = "N/A";
		Date currentDate = null;
		currentTime = getCurrentTimeImpl(country);
		return currentTime;
	}

	public String getCurrentTime(String country, String timeZone){
		String currentTime = "N/A";
		Date currentDate = null;
		System.out.println(" getCurrentTime "+timeZone);
		currentTime = getCurrentTimeTzoneImpl(country, timeZone);
		return currentTime;
	}

	private String getCurrentTimeImpl(String country) {
		String currentTime;
		Date currentDate;
		switch(COUNTRY.valueOf(country)){
		case USA:
			currentDate = Calendar.getInstance(Locale.US).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		case IND:
			currentDate = Calendar.getInstance(new Locale("en", "IN")).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		case AUS:
			currentDate = Calendar.getInstance(new Locale("en", "AU")).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		case NZ:
			currentDate = Calendar.getInstance(new Locale("en", "NZ")).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		case CN:
			currentDate = Calendar.getInstance(new Locale("zh", "CN")).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		case JP:
			currentDate = Calendar.getInstance(new Locale("ja", "JP")).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		default:
			currentTime = "No Matching Country found.";
		}
		return currentTime;
	}
	
	private String getCurrentTimeTzoneImpl(String country, String timeZone) {
		String currentTime;
		Date currentDate;
		switch(COUNTRY.valueOf(country)){
		case USA:
			Calendar calendar = Calendar.getInstance(Locale.US);
			System.out.println("USA "+timeZone);
			if(null != timeZone){
				calendar.setTimeZone(TIMEZONE.valueOf(timeZone).timeZone);
			}
			currentDate = calendar.getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		case IND:
			currentDate = Calendar.getInstance(new Locale("en", "IN")).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		case AUS:
			currentDate = Calendar.getInstance(new Locale("en", "AU")).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		case NZ:
			currentDate = Calendar.getInstance(new Locale("en", "NZ")).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		case CN:
			currentDate = Calendar.getInstance(new Locale("zh", "CN")).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		case JP:
			currentDate = Calendar.getInstance(new Locale("ja", "JP")).getTime();
			currentTime = DateFormat.getInstance().format(currentDate);
			break;
		default:
			currentTime = "No Matching Country found.";
		}
		return currentTime;
	}
}
