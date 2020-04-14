/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic;

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
@ThriftStruct(value="MyStruct", builder=MyStruct.Builder.class)
public final class MyStruct {
    @ThriftConstructor
    public MyStruct(
        @ThriftField(value=1, name="MyIntField", requiredness=Requiredness.NONE) final long myIntField,
        @ThriftField(value=2, name="MyStringField", requiredness=Requiredness.NONE) final String myStringField,
        @ThriftField(value=3, name="MyDataField", requiredness=Requiredness.NONE) final test.fixtures.basic.MyDataItem myDataField,
        @ThriftField(value=4, name="myEnum", requiredness=Requiredness.NONE) final test.fixtures.basic.MyEnum myEnum
    ) {
        this.myIntField = myIntField;
        this.myStringField = myStringField;
        this.myDataField = myDataField;
        this.myEnum = myEnum;
    }
    
    @ThriftConstructor
    protected MyStruct() {
      this.myIntField = 0L;
      this.myStringField = null;
      this.myDataField = null;
      this.myEnum = null;
    }
    
    public static class Builder {
        private long myIntField;
        @ThriftField(value=1, name="MyIntField", requiredness=Requiredness.NONE)
        public Builder setMyIntField(long myIntField) {
            this.myIntField = myIntField;
            return this;
        }
        
        public long getMyIntField() { return myIntField; }
    
        private String myStringField;
        @ThriftField(value=2, name="MyStringField", requiredness=Requiredness.NONE)
        public Builder setMyStringField(String myStringField) {
            this.myStringField = myStringField;
            return this;
        }
        
        public String getMyStringField() { return myStringField; }
    
        private test.fixtures.basic.MyDataItem myDataField;
        @ThriftField(value=3, name="MyDataField", requiredness=Requiredness.NONE)
        public Builder setMyDataField(test.fixtures.basic.MyDataItem myDataField) {
            this.myDataField = myDataField;
            return this;
        }
        
        public test.fixtures.basic.MyDataItem getMyDataField() { return myDataField; }
    
        private test.fixtures.basic.MyEnum myEnum;
        @ThriftField(value=4, name="myEnum", requiredness=Requiredness.NONE)
        public Builder setMyEnum(test.fixtures.basic.MyEnum myEnum) {
            this.myEnum = myEnum;
            return this;
        }
        
        public test.fixtures.basic.MyEnum getMyEnum() { return myEnum; }
    
        public Builder() { }
        public Builder(MyStruct other) {
            this.myIntField = other.myIntField;
            this.myStringField = other.myStringField;
            this.myDataField = other.myDataField;
            this.myEnum = other.myEnum;
        }
    
        @ThriftConstructor
        public MyStruct build() {
            return new MyStruct (
                this.myIntField,
                this.myStringField,
                this.myDataField,
                this.myEnum
            );
        }
    }
    
    private static final TStruct STRUCT_DESC = new TStruct("MyStruct");
    private final long myIntField;
    public static final int _MYINTFIELD = 1;
    private static final TField MY_INT_FIELD_FIELD_DESC = new TField("myIntField", TType.I64, (short)1);
    private final String myStringField;
    public static final int _MYSTRINGFIELD = 2;
    private static final TField MY_STRING_FIELD_FIELD_DESC = new TField("myStringField", TType.STRING, (short)2);
    private final test.fixtures.basic.MyDataItem myDataField;
    public static final int _MYDATAFIELD = 3;
    private static final TField MY_DATA_FIELD_FIELD_DESC = new TField("myDataField", TType.STRUCT, (short)3);
    private final test.fixtures.basic.MyEnum myEnum;
    public static final int _MYENUM = 4;
    private static final TField MY_ENUM_FIELD_DESC = new TField("myEnum", TType.I32, (short)4);

    
    @ThriftField(value=1, name="MyIntField", requiredness=Requiredness.NONE)
    public long getMyIntField() { return myIntField; }
        
    @ThriftField(value=2, name="MyStringField", requiredness=Requiredness.NONE)
    public String getMyStringField() { return myStringField; }
        
    @ThriftField(value=3, name="MyDataField", requiredness=Requiredness.NONE)
    public test.fixtures.basic.MyDataItem getMyDataField() { return myDataField; }
        
    @ThriftField(value=4, name="myEnum", requiredness=Requiredness.NONE)
    public test.fixtures.basic.MyEnum getMyEnum() { return myEnum; }
    
    @Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("myIntField", myIntField);
        helper.add("myStringField", myStringField);
        helper.add("myDataField", myDataField);
        helper.add("myEnum", myEnum);
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
    
        MyStruct other = (MyStruct)o;
    
        return
            Objects.equals(myIntField, other.myIntField) &&
            Objects.equals(myStringField, other.myStringField) &&
            Objects.equals(myDataField, other.myDataField) &&
            Objects.equals(myEnum, other.myEnum) &&
            true;
    }
    
    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            myIntField,
            myStringField,
            myDataField,
            myEnum
        });
    }
    
    
      // Currently, the read0 method cannot read metadatamap for JSON styled serialization.
      // Perhaps, it will be implemented in the future!
    public static MyStruct read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin();
      MyStruct.Builder builder = new MyStruct.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _MYINTFIELD:
          if (__field.type == TType.I64) {
            long myIntField = oprot.readI64();
            builder.setMyIntField(myIntField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYSTRINGFIELD:
          if (__field.type == TType.STRING) {
            String myStringField = oprot.readString();
            builder.setMyStringField(myStringField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYDATAFIELD:
          if (__field.type == TType.STRUCT) {
            test.fixtures.basic.MyDataItem myDataField = test.fixtures.basic.MyDataItem.read0(oprot);
            builder.setMyDataField(myDataField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYENUM:
          if (__field.type == TType.I32) {
            test.fixtures.basic.MyEnum myEnum = test.fixtures.basic.MyEnum.fromInteger(oprot.readI32());
            builder.setMyEnum(myEnum);
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
      oprot.writeFieldBegin(MY_INT_FIELD_FIELD_DESC);
      oprot.writeI64(this.myIntField);
      oprot.writeFieldEnd();
      if (this.myStringField != null) {
        oprot.writeFieldBegin(MY_STRING_FIELD_FIELD_DESC);
        oprot.writeString(this.myStringField);
        oprot.writeFieldEnd();
      }
      if (this.myDataField != null) {
        oprot.writeFieldBegin(MY_DATA_FIELD_FIELD_DESC);
        this.myDataField.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MY_ENUM_FIELD_DESC);
      oprot.writeI32(this.myEnum == null ? 0 : this.myEnum.getValue());
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
}
