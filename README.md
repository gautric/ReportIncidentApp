
Report Incident Proxy
============================

from CXF WebService Proxy example Camel


You will need to compile this example first:
```
	mvn compile
```

Execute JBoss cli script 
```
	jboss-cli.sh  --file src/main/jboss/configure-jms.cli
```
To run the example type:
```
	mvn jboss:deploy
```
The proxied webservice is located at
```
  http://<hostname>/report-incident/proxy/incident
```
The real webservice is located at
```
	http://<hostname>/report-incident/soap/incident
```
The webservice WSDL is exposed at:
```
	http://<hostname>/report-incident/soap/incident?wsdl
```

To make a SOAP call open soapUI or another SOAP query tool and create a new
project w/WSDL of http://<hostname>/report-incident/soap/incident?wsdl.
Then make SOAP requests of this format:
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:rep="http://reportincident.g.a.net">
   <soapenv:Header/>
   <soapenv:Body>
      <rep:inputReportIncident>
         <id>122</id>
         <date>2010-01-01</date>
         <severity>Low</severity>
         <userName>Jean</userName>
         <summary>Hello</summary>
         <details>World</details>
         <email>jean@paul.dom</email>
      </rep:inputReportIncident>
   </soapenv:Body>
</soapenv:Envelope>
```
This example comes from 
```
http://camel.apache.org/cxf-proxy-example.html
```
Raise a Issue ticket on github if needed
