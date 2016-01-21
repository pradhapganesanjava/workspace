package com.pg.ws.simpleserver.math;

import javax.jws.WebService;


/***
 * 
 * wsgen -cp . -wsdl -r ../wsdl -keep -s ../src com.pg.ws.simpleserver.math.MapTableServiceImpl
 * wsimport -keep -p com.pg.ws.simpleclient.math -Xnocompile file:../wsdl/MapTableServiceImplService.wsd
 * 
 * @author pganesan
 *
 */


@WebService(endpointInterface="com.pg.ws.simpleserver.math.MapTableService")
public class MapTableServiceImpl {

	public String getSquare(Integer number){
		return new Integer(number*number).toString();
	}
}
