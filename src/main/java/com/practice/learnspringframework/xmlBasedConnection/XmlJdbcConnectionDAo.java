package com.practice.learnspringframework.xmlBasedConnection;

import org.springframework.stereotype.Component;

@Component
public class XmlJdbcConnectionDAo {

    XmlJdbcConnection xmlJdbcConnection;

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    public XmlJdbcConnection getXmlJdbcConnection(){
        return xmlJdbcConnection;
    }
}
