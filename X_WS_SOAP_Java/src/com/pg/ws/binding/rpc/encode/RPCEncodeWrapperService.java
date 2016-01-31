package com.pg.ws.binding.rpc.encode;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.pg.ws.binding.bo.ExchangeRateBO;
import com.pg.ws.binding.bo.ExchangeRateRequestBO;

/*
 * A:\projects\pgworkspace\X_WS_SOAP_Java\bin>wsgen -cp . com.pg.ws.binding.rpc.encode.RPCEncodeWrapperServiceImpl -wsdl -r ../wsdl/wsgen/RPCEncode
Wrapper -s ../src -verbose
Note:   ap round: 1
Problem encountered during annotation processing;
see stacktrace below for more information.
com.sun.tools.internal.ws.processor.modeler.ModelerException: modeler error: The com.pg.ws.binding.rpc.encode.RPCEncodeWrapperService class has
invalid SOAPBinding annotation. rpc/encoded SOAPBinding is not supported
        at com.sun.tools.internal.ws.processor.modeler.annotation.WebServiceAP.onError(WebServiceAP.java:225)
        at com.sun.tools.internal.ws.processor.modeler.annotation.WebServiceVisitor.pushSOAPBinding(WebServiceVisitor.java:262)
        at com.sun.tools.internal.ws.processor.modeler.annotation.WebServiceVisitor.preProcessWebService(WebServiceVisitor.java:220)
        at com.sun.tools.internal.ws.processor.modeler.annotation.WebServiceVisitor.visitInterfaceDeclaration(WebServiceVisitor.java:105)
        at com.sun.tools.apt.mirror.declaration.InterfaceDeclarationImpl.accept(InterfaceDeclarationImpl.java:32)
        at com.sun.tools.internal.ws.processor.modeler.annotation.WebServiceVisitor.inspectEndpointInterface(WebServiceVisitor.java:395)
        at com.sun.tools.internal.ws.processor.modeler.annotation.WebServiceVisitor.visitClassDeclaration(WebServiceVisitor.java:128)
        at com.sun.tools.apt.mirror.declaration.ClassDeclarationImpl.accept(ClassDeclarationImpl.java:95)
        at com.sun.tools.internal.ws.processor.modeler.annotation.WebServiceAP.buildModel(WebServiceAP.java:315)
        at com.sun.tools.internal.ws.processor.modeler.annotation.WebServiceAP.process(WebServiceAP.java:256)
        at com.sun.mirror.apt.AnnotationProcessors$CompositeAnnotationProcessor.process(AnnotationProcessors.java:60)
 * 
 */

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC, use=SOAPBinding.Use.ENCODED, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface RPCEncodeWrapperService {
	@WebMethod
	public ExchangeRateBO getExchangeRate(ExchangeRateRequestBO rateRequestBO, String toCurrency);
}
