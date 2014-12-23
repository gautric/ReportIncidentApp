/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.a.g.reportincident;

import java.util.UUID;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import net.a.g.reportincident.InputReportIncident;
import net.a.g.reportincident.OutputReportIncident;
import net.a.g.reportincident.ReportIncidentEndpoint;

import org.jboss.logging.Logger;

/**
 * This is the implementation of the real web service
 *
 * @version
 */
@WebService(name = "ReportIncident", targetNamespace = "http://reportincident.g.a.net", serviceName = "ReportIncidentEndpointService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class ReportIncidentEndpointRealService implements ReportIncidentEndpoint {

	private static Logger log = Logger
			.getLogger(ReportIncidentEndpointRealService.class.getName());

	public OutputReportIncident reportIncident(InputReportIncident in) {
		// just log and return a fixed response
		log.info(">> Invoked Real web service: id=" + in.getId() + " by "
				+ in.getUserName());

		OutputReportIncident out = new OutputReportIncident();
		out.setCode("INCIDENT_ENREGISTRE");
		out.setId(UUID.randomUUID().toString());
		return out;
	}

}