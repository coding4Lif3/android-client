/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public enum pjrpid_activity {
  PJRPID_ACTIVITY_UNKNOWN,
  PJRPID_ACTIVITY_AWAY,
  PJRPID_ACTIVITY_BUSY;

  public final int swigValue() {
    return swigValue;
  }

  public static pjrpid_activity swigToEnum(int swigValue) {
    pjrpid_activity[] swigValues = pjrpid_activity.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (pjrpid_activity swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + pjrpid_activity.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private pjrpid_activity() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private pjrpid_activity(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private pjrpid_activity(pjrpid_activity swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

