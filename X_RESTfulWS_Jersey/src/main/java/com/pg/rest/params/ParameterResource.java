package com.pg.rest.params;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlRootElement;

@Path("/params")
@Produces(MediaType.TEXT_PLAIN + "," + MediaType.TEXT_HTML)
public class ParameterResource {

	@Context
	UriInfo uriInfo;

	@Context
	HttpHeaders httpHeader;

	
	@GET
	@Produces({ MediaType.TEXT_XML, MediaType.TEXT_PLAIN })
	public Response getParameters(@QueryParam("all") boolean isAll,
			@MatrixParam("start") int start, @MatrixParam("count") int count) {
		System.out.println("strWrap is used !!! + isAll"+isAll);
		List<String> strList = applyFilterOnParameterList(isAll, start, count);
		// GenericEntity<List<String>> listStrEntity = new
		// GenericEntity<List<String>>(strList){};
		// List<String> arrStrList = Arrays.asList(strList);
		// Arrays.asList("a","B","c","D")
		StringWrapper strWrap = new StringWrapper();
		strWrap.setStrList(strList);
		/* strWrap.setStr("OYYALa"); */

		Response response = Response.ok(strWrap).build();
		return response;
	}

	
	@GET
	@Path("/{paramType}")
	public String getParameter(@BeanParam BeanParameter myBeanParam) {
		String paramString = "N/A";
		if("bean".equalsIgnoreCase(myBeanParam.getParamType())){
			paramString = applyFilterOnParameterList(myBeanParam.isAll(), myBeanParam.getStart(),
					myBeanParam.getCount()).toString();
		}else if("context".equalsIgnoreCase(myBeanParam.getParamType())){
			paramString = "UriInfo-AbsPath: " + myBeanParam.getUriInfo().getAbsolutePath() + "\n"
					+ "Header accpt lang: " + myBeanParam.getHttpHead().getAcceptableLanguages();
		}
		return paramString;
	}

	
	private List<String> applyFilterOnParameterList(boolean isAll, int start, int count) {

		List<String> strList = createParameterList();

		System.out.println("start applyFilterOnParameterList isAll ? "+isAll);
		
		if(isAll){
			return strList;
		}else if(start > -1 && count > 0){
			if(count + start <= strList.size()) return strList.subList(start, count + start);
			else if(count > strList.size() && count + start > strList.size()){
				System.out.println("count exceeds fixed");
				return strList.subList(start, strList.size());
			}
		}
		return strList;
	}

	
	
	private List<String> createParameterList() {
		List<String> strList = new ArrayList<String>();
		strList.add("@PathParam");
		strList.add("@QueryParam");
		strList.add("@MatrixParam");
		strList.add("@HeaderParam");
		strList.add("@CookieParam");
		strList.add("@FormParam");
		strList.add("@BeanParam");
		return strList;
	}

}

@XmlRootElement
class StringWrapper {

	private List<String> strList = null;

	public List<String> getStrList() {
		return strList;
	}

	public void setStrList(List<String> strList) {
		this.strList = strList;
	}

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}