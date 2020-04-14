/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.complex_struct;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;

@SwiftGenerated
@ThriftStruct("reqXcep")
public final class ReqXcep extends java.lang.Exception {
    private static final long serialVersionUID = 1L;

    private static final TStruct STRUCT_DESC = new TStruct("reqXcep");
    private final String message;
    public static final int _MESSAGE = 1;
    private static final TField MESSAGE_FIELD_DESC = new TField("message", TType.STRING, (short)1);
    private final int errorCode;
    public static final int _ERRORCODE = 2;
    private static final TField ERROR_CODE_FIELD_DESC = new TField("errorCode", TType.I32, (short)2);

    @ThriftConstructor
    public ReqXcep(
        @ThriftField(value=1, name="message", requiredness=Requiredness.REQUIRED) final String message,
        @ThriftField(value=2, name="errorCode", requiredness=Requiredness.REQUIRED) final int errorCode
    ) {
        this.message = message;
        this.errorCode = errorCode;
    }
    
    @ThriftConstructor
    protected ReqXcep() {
      this.message = null;
      this.errorCode = 0;
    }
    
    public static class Builder {
        private String message;
        @ThriftField(value=1, name="message", requiredness=Requiredness.REQUIRED)
        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }
        
        public String getMessage() { return message; }
    
        private int errorCode;
        @ThriftField(value=2, name="errorCode", requiredness=Requiredness.REQUIRED)
        public Builder setErrorCode(int errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        
        public int getErrorCode() { return errorCode; }
    
        public Builder() { }
        public Builder(ReqXcep other) {
            this.message = other.message;
            this.errorCode = other.errorCode;
        }
    
        @ThriftConstructor
        public ReqXcep build() {
            return new ReqXcep (
                this.message,
                this.errorCode
            );
        }
    }
    
    
    @ThriftField(value=1, name="message", requiredness=Requiredness.REQUIRED)
    public String getMessage() { return message; }
        
    @ThriftField(value=2, name="errorCode", requiredness=Requiredness.REQUIRED)
    public int getErrorCode() { return errorCode; }
    
    
      // Currently, the read0 method cannot read metadatamap for JSON styled serialization.
      // Perhaps, it will be implemented in the future!
    public static ReqXcep read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin();
      ReqXcep.Builder builder = new ReqXcep.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _MESSAGE:
          if (__field.type == TType.STRING) {
            String message = oprot.readString();
            builder.setMessage(message);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _ERRORCODE:
          if (__field.type == TType.I32) {
            int errorCode = oprot.readI32();
            builder.setErrorCode(errorCode);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      if (this.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(this.message);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
      oprot.writeI32(this.errorCode);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
}
