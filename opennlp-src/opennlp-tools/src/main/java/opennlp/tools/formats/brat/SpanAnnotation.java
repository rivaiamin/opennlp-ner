/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package opennlp.tools.formats.brat;

import opennlp.tools.util.Span;

public class SpanAnnotation extends BratAnnotation {

  private final Span span;
  private final String coveredText;

  SpanAnnotation(String id, String type, Span span, String coveredText) {
    super(id, type);
    this.span = span;
    this.coveredText = coveredText;
  }

  public Span getSpan() {
    return span;
  }

  public String getCoveredText() {
    return coveredText;
  }

  @Override
  public String toString() {
    return super.toString() + " " + span.getStart() + " " + span.getEnd() + " " + getCoveredText();
  }
}
