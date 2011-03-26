/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.proofpoint.galaxy.agent;

import org.testng.annotations.BeforeMethod;

import java.io.File;

import static com.proofpoint.galaxy.RepositoryTestHelper.newAssignment;

public class TestMockLifecycleManager extends AbstractLifecycleManagerTest
{
    @BeforeMethod
    protected void setUp()
            throws Exception
    {
        manager = new MockLifecycleManager();
        apple = new Deployment("apple", new File("apple"), newAssignment("pp:apple:1.0", "@prod:apple:1.0"));
        banana = new Deployment("banana", new File("banana"), newAssignment("pp:banana:1.0", "@prod:banana:1.0"));
    }

}