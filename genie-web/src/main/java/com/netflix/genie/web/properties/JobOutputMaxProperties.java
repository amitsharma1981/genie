/*
 *
 *  Copyright 2016 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.genie.web.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Min;

/**
 * Properties related to the maximum length of certain job related files.
 *
 * @author tgianos
 * @since 3.0.0
 */
@ConfigurationProperties(prefix = "genie.jobs.output.max")
@Component
@Getter
@Setter
public class JobOutputMaxProperties {
    @Min(1L)
    private long stdOut = 8589934592L;
    @Min(1L)
    private long stdErr = 8589934592L;
}
