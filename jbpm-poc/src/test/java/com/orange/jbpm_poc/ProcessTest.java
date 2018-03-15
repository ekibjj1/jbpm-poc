package com.orange.jbpm_poc;

import org.jbpm.process.workitem.rest.RESTWorkItemHandler;
import org.jbpm.test.JbpmJUnitBaseTestCase;
import org.junit.Test;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.api.runtime.process.ProcessInstance;

/**
 * This is a sample file to test a process.
 */
public class ProcessTest extends JbpmJUnitBaseTestCase {

	@Test
	public void testProcess() {
		RuntimeManager manager = createRuntimeManager("com/orange/jbpm_poc/Composicion.bpmn2");
		RuntimeEngine engine = getRuntimeEngine(null);
		KieSession ksession = engine.getKieSession();
		ksession.getWorkItemManager().registerWorkItemHandler("Rest", new RESTWorkItemHandler(this.getClass().getClassLoader()));

		ProcessInstance processInstance = ksession.startProcess("jbpm-poc.Composicion");
		// check whether the process instance has completed successfully
		assertProcessInstanceCompleted(processInstance.getId(), ksession);
		
		manager.disposeRuntimeEngine(engine);
		manager.close();
	}

}