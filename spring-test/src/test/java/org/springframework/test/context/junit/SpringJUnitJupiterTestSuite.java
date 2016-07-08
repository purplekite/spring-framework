/*
 * Copyright 2002-2016 the original author or authors.
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

package org.springframework.test.context.junit;

import org.junit.platform.runner.IncludeEngines;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.runner.SelectPackages;
import org.junit.platform.runner.UseTechnicalNames;
import org.junit.runner.RunWith;

/**
 * JUnit 4 based test suite for tests that involve the Spring TestContext
 * Framework and JUnit Jupiter (a.k.a., JUnit 5).
 *
 * <p>This class intentionally does not reside in the "jupiter" package
 * so that the entire "jupiter" package can be excluded from the Gradle
 * build. This class is therefore responsible for executing all JUnit
 * Jupiter based tests in Spring's official test suite.
 *
 * @author Sam Brannen
 * @since 5.0
 */
@RunWith(JUnitPlatform.class)
@IncludeEngines("junit-jupiter")
@SelectPackages("org.springframework.test.context.junit.jupiter")
@UseTechnicalNames
public class SpringJUnitJupiterTestSuite {
}
