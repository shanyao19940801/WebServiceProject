/**
 * HelloWorldServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yao.webserviceclient;

public class HelloWorldServiceTestCase extends junit.framework.TestCase {
    public HelloWorldServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testHelloWorldWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.yao.webserviceclient.HelloWorldServiceLocator().getHelloWorldAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.yao.webserviceclient.HelloWorldServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1HelloWorldSayHelloWorldFrom() throws Exception {
        com.yao.webserviceclient.HelloWorldSoapBindingStub binding;
        try {
            binding = (com.yao.webserviceclient.HelloWorldSoapBindingStub)
                          new com.yao.webserviceclient.HelloWorldServiceLocator().getHelloWorld();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.sayHelloWorldFrom(new java.lang.String());
        // TBD - validate results
    }

}
