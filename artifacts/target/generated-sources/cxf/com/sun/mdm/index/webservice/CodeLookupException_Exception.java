
package com.sun.mdm.index.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5-jbossorg-1
 * 2019-04-01T16:23:03.887+01:00
 * Generated source version: 3.2.5-jbossorg-1
 */

@WebFault(name = "CodeLookupException", targetNamespace = "http://webservice.index.mdm.sun.com/")
public class CodeLookupException_Exception extends Exception {

    private com.sun.mdm.index.webservice.CodeLookupException codeLookupException;

    public CodeLookupException_Exception() {
        super();
    }

    public CodeLookupException_Exception(String message) {
        super(message);
    }

    public CodeLookupException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public CodeLookupException_Exception(String message, com.sun.mdm.index.webservice.CodeLookupException codeLookupException) {
        super(message);
        this.codeLookupException = codeLookupException;
    }

    public CodeLookupException_Exception(String message, com.sun.mdm.index.webservice.CodeLookupException codeLookupException, java.lang.Throwable cause) {
        super(message, cause);
        this.codeLookupException = codeLookupException;
    }

    public com.sun.mdm.index.webservice.CodeLookupException getFaultInfo() {
        return this.codeLookupException;
    }
}
