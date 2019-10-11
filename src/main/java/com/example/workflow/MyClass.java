/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
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
package com.example.workflow;

import org.camunda.spin.json.SpinJsonNode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static org.camunda.spin.Spin.S;

@Component
public class MyClass {

  @PostConstruct
  public void execute() {
    SpinJsonNode jsonNode = S("{\"dateTime\": \"2019-12-12T22:22:22\"}");
    Object key = jsonNode.mapTo(MyDto.class);

    System.out.println(key);
  }

}
