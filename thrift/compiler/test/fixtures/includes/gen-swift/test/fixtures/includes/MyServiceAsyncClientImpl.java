/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.includes;

import com.facebook.swift.codec.*;
import com.facebook.swift.service.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;

@SwiftGenerated
public class MyServiceAsyncClientImpl implements MyService.Async {

    @Override
    public void close() {
      throw new RuntimeException("No implemented");
    }


    @Override
    public ListenableFuture<Void> query(
        test.fixtures.includes.MyStruct s,
        test.fixtures.includes.includes.Included i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListenableFuture<Void> hasArgDocs(
        test.fixtures.includes.MyStruct s,
        test.fixtures.includes.includes.Included i) {
        throw new UnsupportedOperationException();
    }
}