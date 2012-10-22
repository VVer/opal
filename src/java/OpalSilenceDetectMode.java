/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opalvoip;

public final class OpalSilenceDetectMode {
  public final static OpalSilenceDetectMode OpalSilenceDetectNoChange = new OpalSilenceDetectMode("OpalSilenceDetectNoChange");
  public final static OpalSilenceDetectMode OpalSilenceDetectDisabled = new OpalSilenceDetectMode("OpalSilenceDetectDisabled");
  public final static OpalSilenceDetectMode OpalSilenceDetectFixed = new OpalSilenceDetectMode("OpalSilenceDetectFixed");
  public final static OpalSilenceDetectMode OpalSilenceDetectAdaptive = new OpalSilenceDetectMode("OpalSilenceDetectAdaptive");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static OpalSilenceDetectMode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + OpalSilenceDetectMode.class + " with value " + swigValue);
  }

  private OpalSilenceDetectMode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private OpalSilenceDetectMode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private OpalSilenceDetectMode(String swigName, OpalSilenceDetectMode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static OpalSilenceDetectMode[] swigValues = { OpalSilenceDetectNoChange, OpalSilenceDetectDisabled, OpalSilenceDetectFixed, OpalSilenceDetectAdaptive };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

