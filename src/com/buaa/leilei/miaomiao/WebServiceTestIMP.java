package com.buaa.leilei.miaomiao;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(
		endpointInterface="com.buaa.leilei.miaomiao.IWebServiceTest"
		,serviceName="WebServiceTestIMP"
		,targetNamespace="/miaomiao"
		)
@SOAPBinding(style=Style.DOCUMENT)
public class WebServiceTestIMP implements IWebServiceTest {
	@WebMethod
	public  int add(int num1,int num2){
		return num1+num2;
	}

	@Override
	public String sayHello(String name) {
		return name+"³ÔÁËÂð£¿£¿£¿";
	}

}
