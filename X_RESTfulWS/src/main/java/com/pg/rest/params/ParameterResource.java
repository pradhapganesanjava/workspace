package com.pg.rest.params;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/params")
@Produces(MediaType.TEXT_PLAIN + "," + MediaType.TEXT_HTML)
public class ParameterResource {

	@Context
	UriInfo uriInfo;

	@Context
	HttpHeaders httpHeader;

	@GET
	public List<String> getParameters(@QueryParam("all") boolean isAll, @MatrixParam("start") int start, @MatrixParam("count") int count) {
		return applyFilterOnParameterList(isAll, start, count);
	}

	@GET
	@Path("/{paramType}")
	public String getParameter(@BeanParam BeanParameter myBeanParam) {
		String paramString = "N/A";
		if("bean".equalsIgnoreCase(myBeanParam.getParamType())){
			paramString = applyFilterOnParameterList(myBeanParam.isAll(), myBeanParam.getStart(),
					myBeanParam.getCount()).toString();
		}
		return paramString;
	}
	
	private List<String> applyFilterOnParameterList(boolean isAll, int start, int count) {

		List<String> strList = createParameterList();

		if(isAll){
			return strList;
		}else if(start > 0 && count > 0){
			return strList.subList(start, count);
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
