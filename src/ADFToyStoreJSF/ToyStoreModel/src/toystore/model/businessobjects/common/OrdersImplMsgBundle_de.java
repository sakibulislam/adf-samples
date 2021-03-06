/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/businessobjects/common/OrdersImplMsgBundle_de.java,v 1.1.1.1 2006/01/26 21:47:21 steve Exp $
package toystore.model.businessobjects.common;
import oracle.jbo.common.JboResourceBundle;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
public class OrdersImplMsgBundle_de extends OrdersImplMsgBundle {
  static final Object[][] sMessageStrings = {
    { EXPIRED_CREDITCARD, "Die Gültigkeit Ihrer Kreditkarte ist abgelaufen" }
  };

  /**
   *
   * This is the default constructor (do not remove)
   */
  public OrdersImplMsgBundle_de() {
  }

  /**
   *
   * @return an array of key-value pairs.
   */
  public Object[][] getContents() {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }
}
