
/* 
  SWAMP Jenkins Plugin

  Copyright 2016 Jared Sweetland, Vamshi Basupalli, James A. Kupsch

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express implied.
  See the License for the specific language governing permissions and
  limitations under the License.
  */

package org.continuousassurance.swamp.jenkins;

import org.jvnet.localizer.Localizable;

import hudson.model.Messages;
import hudson.plugins.analysis.core.AbstractHealthDescriptor;
import hudson.plugins.analysis.core.HealthDescriptor;
import hudson.plugins.analysis.util.model.AnnotationProvider;

public class SwampHealthDescriptor extends AbstractHealthDescriptor {
	private static final long serialVersionUID = -3404826986876607396L;

    /**
     * Creates a new instance of {@link SwampHealthDescriptor} based on the
     * values of the specified descriptor.
     *
     * @param healthDescriptor the descriptor to copy the values from
     */
    public SwampHealthDescriptor(final HealthDescriptor healthDescriptor) {
        super(healthDescriptor);
    }

    @Override
    protected Localizable createDescription(final AnnotationProvider result) {
        if (result.getNumberOfAnnotations() == 0) {
        	return Messages._HealthReport_EmptyString();
            //return Messages._Swamp_ResultAction_HealthReportNoItem();
        	//return new Localizable(null, "No results found", null);
        }
        /*else if (result.getNumberOfAnnotations() == 1) {
            //return Messages._Swamp_ResultAction_HealthReportSingleItem();
        }*/
        else {
        	return Messages._HealthReport_EmptyString();
            //return Messages._Swamp_ResultAction_HealthReportMultipleItem(result.getNumberOfAnnotations());
        	//return new Localizable(null, "Results found", null);
        }
    }
}