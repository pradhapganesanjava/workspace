package com.pg.rest.university;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

//Root resource
@Path("/university")
public class UniversityRestWS {

	//subresource-Subresource locators, do not annotated with @Path
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getUniversityInfo(){
		return "Kekran Mekran University";
	}
	
	//Sub-resource method- similar to subresource, But annotated with @Path.
	//PathParam
	/*@GET
	@Path("/{departName}")
	@Produces(MediaType.TEXT_HTML+","+MediaType.TEXT_PLAIN)
	public String getDepartInfo(@PathParam("departName") String departName){
		return "<html><body>Your requested department <b>"+departName+"</b> </body></html>";
	}*/

	//Sub-resource methods
	//MatrixParam
	@Path("/depart")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDepartSchedules(@MatrixParam("departname") String departName,
			@MatrixParam("schedule") String schedule) {

		return matrixParamImpl(departName, schedule);
	}

	@POST
	@Path("/departsearch")
	@Produces(MediaType.TEXT_HTML)
	public String getDepartments(@FormParam("departname")String departName, @FormParam("departid")String departId){
		
		return formParamImpl(departName, departId);
	}

	@Path("/down_rawfile")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public File getRawFile(){
		File file = new File("a:\\rest_rawfile.txt");
		return file;
	}
	
	@Path("/down_resfile")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getResFile(){
		File file = new File("a:\\rest_rawfile.txt");
		
		ResponseBuilder resBuilder = Response.ok((Object)file);
		resBuilder.header("Content-Disposition", "attachment;filename=DemoResponseFile.txt");
		return resBuilder.build();
	}
	
	@Path("/upload_txt")
	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA) //capable of consume upload file
	public Response uploadTxtFile(@FormDataParam("upldtxtfile") InputStream upldInputStream,
			@FormDataParam("upldtxtfile") FormDataContentDisposition fileDetail) {

		System.out.println("uploadeTxtFile method is called");
		
		String upldFileLocation = "a://rest_upld_" + fileDetail.getFileName();

		try{

			OutputStream outStream = new FileOutputStream(new File(upldFileLocation));
			byte[] byteInStream = new byte[1024];
			int read = 0;
			while((read = upldInputStream.read(byteInStream)) != -1){
				System.out.println("file read success");
				outStream.write(byteInStream, 0, read);
				System.out.println("file write success");
			}
			outStream.flush();
			outStream.close();

		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

		return Response.ok("File uploaded successfully").build();
	}
	
	private String formParamImpl(String departName, String departId) {
		System.out.println("getDepartments called ... form parameters departname:"+departName+" departId:"+departId);
		
		if((null == departName || "".equals(departName)) && (null == departId || "".equals(departId))){
			return "<html><body><ul><li>IT</li><li>MECH</li><li>CIVIL</li><li>ECE</li><li>EEE</li><ul></body></html>";
		}
		if("IT".equalsIgnoreCase(departName) || "IT001".equalsIgnoreCase(departId)){
			return "<html><body>Information Technology contains Programming and Software Engineering subjects</body></html>";
		}
		else if("MECH".equalsIgnoreCase(departName) || "MECH001".equalsIgnoreCase(departId)){
			return "<html><body>Mechanical Engineering subjects focuses Manchines, tools, auto etc</body></html>";
		}
		else if("ECE".equalsIgnoreCase(departName) || "ECE001".equalsIgnoreCase(departId)){
			return "<html><body>Electrical Electronics and communications subjects focuses Electronics</body></html>";
		}else if("EEE".equalsIgnoreCase(departName) || "EEE001".equalsIgnoreCase(departId)){
			return "<html><body>Electrical Engineering subjects focuses on Electricals</body></html>";
		}else if("CIVIL".equalsIgnoreCase(departName) || "CIVIL001".equalsIgnoreCase(departId)){
			return "<html><body>CIVIL subjects focuses constructions of building</body></html>";
		}else{
			return "<html><body>Invalid Inputs</body></html>";
		}
	}
	
	
	private String matrixParamImpl(String departName, String schedule) {
		if("IT".equalsIgnoreCase(departName)){
			if("2016".equals(schedule)){
				return "For IT department, 1st Semester starts JUN'2016";
			}else{
				return "For IT department, 1st Semester starts JUN'2015";
			}
		}else if("MECH".equalsIgnoreCase(departName)){
			if("2016".equals(schedule)){
				return "For IT department, 1st Semester starts MARCH'2016";
			}else{
				return "For IT department, 1st Semester starts MARCH'2015";
			}
		}else{
			return "Invalid departname is entered";
		}
	}
}
