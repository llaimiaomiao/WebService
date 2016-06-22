package com.buaa.leilei.miaomiao;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
		targetNamespace="/miaomiao"
		,name="WebServiceTest")
public interface IWebServiceTest {
	@WebMethod(operationName="sum")
	@WebResult(name="equal")
	  int add(@WebParam(name="num1")int num1,@WebParam(name="num2")int num2);
	@WebMethod(exclude=true)
	String sayHello(String name);

}
