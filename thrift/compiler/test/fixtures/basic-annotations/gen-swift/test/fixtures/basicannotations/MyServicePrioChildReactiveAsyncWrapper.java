/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basicannotations;

import java.util.*;

public class MyServicePrioChildReactiveAsyncWrapper  extends test.fixtures.basicannotations.MyServicePrioParentReactiveAsyncWrapper
  implements MyServicePrioChild.Async {
  private MyServicePrioChild.Reactive _delegate;

  public MyServicePrioChildReactiveAsyncWrapper(MyServicePrioChild.Reactive _delegate) {
    super(_delegate);
    this._delegate = _delegate;
  }

  @java.lang.Override
  public void close() {
    _delegate.close();
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<Void> pang() {
      return com.facebook.swift.transport.util.FutureUtil.toListenableFuture(_delegate.pang());
  }

}
