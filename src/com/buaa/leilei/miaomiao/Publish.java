package com.buaa.leilei.miaomiao;

import javax.xml.ws.Endpoint;

public class Publish {
		public static void main(String[] args) {
			String address = "http://localhost:8888/ws";
			Object implementor = new WebServiceTestIMP();
			Endpoint.publish(address, implementor);
			System.out.println("·¢²¼OK£¡£¡£¡");
		}

}
