/*
 * Copyright 2016-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.dataflow.server.service;

import java.util.List;
import java.util.Map;

/**
 * Provides Task related services.
 *
 * @author Michael Minella
 * @author Marius Bogoevici
 * @author Glenn Renfro
 * @author Mark Fisher
 * @author Janne Valkealahti
 * @author Gunnar Hillert
 * @author David Turanski
 * @author Daniel Serleg
 */
public interface TaskExecutionService {

	/**
	 * Execute a task with the provided task name and optional runtime properties.
	 *
	 * @param taskName Name of the task. Must not be null or empty.
	 * @param taskDeploymentProperties Optional deployment properties. Must not be null.
	 * @param commandLineArgs Optional runtime commandline arguments
	 * @return the taskExecutionId for the executed task.
	 */
	long executeTask(String taskName, Map<String, String> taskDeploymentProperties, List<String> commandLineArgs);

}
