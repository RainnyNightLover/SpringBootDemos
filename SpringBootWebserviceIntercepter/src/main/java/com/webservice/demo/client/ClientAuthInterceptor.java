package com.webservice.demo.client;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ClientAuthInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	private static final String NAME = "admin";
	private static final String PASSWORD = "123456";

	public ClientAuthInterceptor() {
		// 准备发送阶段
		super(Phase.PREPARE_SEND);
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		// TODO Auto-generated method stub

        //创建QName  
        String namespaceURI = "http://ws.cxf.hqh.com";  
        String localPart = "license";
        String prefix = "ns";  
        QName qname = new QName(namespaceURI, localPart, prefix); 
		
		
		List<Header> headers = message.getHeaders();

		Document doc = DOMUtils.createDocument();

		Element auth = doc.createElement("auth");

		Element name = doc.createElement("name");
		name.setTextContent(NAME);

		Element password = doc.createElement("password");
		password.setTextContent(PASSWORD);

		auth.appendChild(name);
		auth.appendChild(password);

		headers.add(new Header(qname, auth));

	}

}
