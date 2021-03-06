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

package org.springframework.cloud.dataflow.rest.support.jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;

/**
 * Jackson MixIn for {@link StepExecution} serialization. This MixIn excludes the
 * {@link JobExecution} from being serialized. This is due to the fact that it would cause
 * a {@link StackOverflowError} due to a circular reference.
 *
 * @author Gunnar Hillert
 * @since 1.0
 */
public abstract class StepExecutionJacksonMixIn {

	@JsonIgnore
	abstract JobExecution getJobExecution();
}
