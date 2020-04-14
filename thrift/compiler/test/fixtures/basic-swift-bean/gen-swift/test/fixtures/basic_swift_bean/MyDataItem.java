/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic_swift_bean;

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
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@ThriftStruct("MyDataItem")
public final class MyDataItem {
    @ThriftConstructor
    public MyDataItem() {}

    public static class Builder {
        private int field1;
        @ThriftField(value=1, name="field1", requiredness=Requiredness.NONE)
        public Builder setField1(int field1) {
            this.field1 = field1;
            return this;
        }
        
        public int getField1() { return field1; }
    
        private int field2;
        @ThriftField(value=2, name="field2", requiredness=Requiredness.NONE)
        public Builder setField2(int field2) {
            this.field2 = field2;
            return this;
        }
        
        public int getField2() { return field2; }
    
        public Builder() { }
        public Builder(MyDataItem other) {
            this.field1 = other.field1;
            this.field2 = other.field2;
        }
    
        @ThriftConstructor
        public MyDataItem build() {
            MyDataItem result = new MyDataItem();
            result.field1 = this.field1;
            result.field2 = this.field2;
            return result;
        }
    }
    
    private static final TStruct STRUCT_DESC = new TStruct("MyDataItem");
    private int field1;
    public static final int _FIELD1 = 1;
    private static final TField FIELD1_FIELD_DESC = new TField("field1", TType.I32, (short)1);
    private int field2;
    public static final int _FIELD2 = 2;
    private static final TField FIELD2_FIELD_DESC = new TField("field2", TType.I32, (short)2);

    
    @ThriftField(value=1, name="field1", requiredness=Requiredness.NONE)
    public int getField1() { return field1; }
    
    @ThriftField
    public MyDataItem setField1(int field1) {
        this.field1 = field1;
        return this;
    }
        
    @ThriftField(value=2, name="field2", requiredness=Requiredness.NONE)
    public int getField2() { return field2; }
    
    @ThriftField
    public MyDataItem setField2(int field2) {
        this.field2 = field2;
        return this;
    }
    
    @Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("field1", field1);
        helper.add("field2", field2);
        return helper.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        MyDataItem other = (MyDataItem)o;
    
        return
            Objects.equals(field1, other.field1) &&
            Objects.equals(field2, other.field2) &&
            true;
    }
    
    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            field1,
            field2
        });
    }
    
    
      // Currently, the read0 method cannot read metadatamap for JSON styled serialization.
      // Perhaps, it will be implemented in the future!
    public static MyDataItem read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin();
      MyDataItem.Builder builder = new MyDataItem.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _FIELD1:
          if (__field.type == TType.I32) {
            int field1 = oprot.readI32();
            builder.setField1(field1);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _FIELD2:
          if (__field.type == TType.I32) {
            int field2 = oprot.readI32();
            builder.setField2(field2);
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
      oprot.writeFieldBegin(FIELD1_FIELD_DESC);
      oprot.writeI32(this.field1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FIELD2_FIELD_DESC);
      oprot.writeI32(this.field2);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
}
