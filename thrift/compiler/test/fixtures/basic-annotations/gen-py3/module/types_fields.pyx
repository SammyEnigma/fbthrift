#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#
cimport cython as __cython
from cython.operator cimport dereference as deref
from libcpp.memory cimport make_unique, unique_ptr, shared_ptr

cimport thrift.py3.types
from thrift.py3.types cimport (
    reset_field as __reset_field,
    StructFieldsSetter as __StructFieldsSetter
)

from thrift.py3.types cimport const_pointer_cast


@__cython.auto_pickle(False)
cdef class __MyStructNestedAnnotation_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __MyStructNestedAnnotation_FieldsSetter create(_module_types.cMyStructNestedAnnotation* struct_cpp_obj):
        cdef __MyStructNestedAnnotation_FieldsSetter __fbthrift_inst = __MyStructNestedAnnotation_FieldsSetter.__new__(__MyStructNestedAnnotation_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"name")] = __MyStructNestedAnnotation_FieldsSetter._set_field_0
        return __fbthrift_inst

    cdef void set_field(__MyStructNestedAnnotation_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __MyStructNestedAnnotation_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, __fbthrift_value) except *:
        # for field name
        if __fbthrift_value is None:
            __reset_field[_module_types.cMyStructNestedAnnotation](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'name is not a { str !r}.')
        deref(self._struct_cpp_obj).name_ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.name = True


@__cython.auto_pickle(False)
cdef class __MyStruct_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __MyStruct_FieldsSetter create(_module_types.cMyStruct* struct_cpp_obj):
        cdef __MyStruct_FieldsSetter __fbthrift_inst = __MyStruct_FieldsSetter.__new__(__MyStruct_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"major")] = __MyStruct_FieldsSetter._set_field_0
        __fbthrift_inst._setters[__cstring_view(<const char*>"package")] = __MyStruct_FieldsSetter._set_field_1
        __fbthrift_inst._setters[__cstring_view(<const char*>"annotation_with_quote")] = __MyStruct_FieldsSetter._set_field_2
        __fbthrift_inst._setters[__cstring_view(<const char*>"class_")] = __MyStruct_FieldsSetter._set_field_3
        __fbthrift_inst._setters[__cstring_view(<const char*>"annotation_with_trailing_comma")] = __MyStruct_FieldsSetter._set_field_4
        __fbthrift_inst._setters[__cstring_view(<const char*>"empty_annotations")] = __MyStruct_FieldsSetter._set_field_5
        return __fbthrift_inst

    cdef void set_field(__MyStruct_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __MyStruct_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, __fbthrift_value) except *:
        # for field major
        if __fbthrift_value is None:
            __reset_field[_module_types.cMyStruct](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(__fbthrift_value, int):
            raise TypeError(f'major is not a { int !r}.')
        __fbthrift_value = <cint64_t> __fbthrift_value
        deref(self._struct_cpp_obj).major_ref().assign(__fbthrift_value)
        deref(self._struct_cpp_obj).__isset.major = True

    cdef void _set_field_1(self, __fbthrift_value) except *:
        # for field package
        if __fbthrift_value is None:
            __reset_field[_module_types.cMyStruct](deref(self._struct_cpp_obj), 1)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'package is not a { str !r}.')
        deref(self._struct_cpp_obj).package_ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.package = True

    cdef void _set_field_2(self, __fbthrift_value) except *:
        # for field annotation_with_quote
        if __fbthrift_value is None:
            __reset_field[_module_types.cMyStruct](deref(self._struct_cpp_obj), 2)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'annotation_with_quote is not a { str !r}.')
        deref(self._struct_cpp_obj).annotation_with_quote_ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.annotation_with_quote = True

    cdef void _set_field_3(self, __fbthrift_value) except *:
        # for field class_
        if __fbthrift_value is None:
            __reset_field[_module_types.cMyStruct](deref(self._struct_cpp_obj), 3)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'class_ is not a { str !r}.')
        deref(self._struct_cpp_obj).class__ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.class_ = True

    cdef void _set_field_4(self, __fbthrift_value) except *:
        # for field annotation_with_trailing_comma
        if __fbthrift_value is None:
            __reset_field[_module_types.cMyStruct](deref(self._struct_cpp_obj), 4)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'annotation_with_trailing_comma is not a { str !r}.')
        deref(self._struct_cpp_obj).annotation_with_trailing_comma_ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.annotation_with_trailing_comma = True

    cdef void _set_field_5(self, __fbthrift_value) except *:
        # for field empty_annotations
        if __fbthrift_value is None:
            __reset_field[_module_types.cMyStruct](deref(self._struct_cpp_obj), 5)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'empty_annotations is not a { str !r}.')
        deref(self._struct_cpp_obj).empty_annotations_ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.empty_annotations = True


@__cython.auto_pickle(False)
cdef class __SecretStruct_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __SecretStruct_FieldsSetter create(_module_types.cSecretStruct* struct_cpp_obj):
        cdef __SecretStruct_FieldsSetter __fbthrift_inst = __SecretStruct_FieldsSetter.__new__(__SecretStruct_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"id")] = __SecretStruct_FieldsSetter._set_field_0
        __fbthrift_inst._setters[__cstring_view(<const char*>"password")] = __SecretStruct_FieldsSetter._set_field_1
        return __fbthrift_inst

    cdef void set_field(__SecretStruct_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __SecretStruct_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, __fbthrift_value) except *:
        # for field id
        if __fbthrift_value is None:
            __reset_field[_module_types.cSecretStruct](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(__fbthrift_value, int):
            raise TypeError(f'id is not a { int !r}.')
        __fbthrift_value = <cint64_t> __fbthrift_value
        deref(self._struct_cpp_obj).id_ref().assign(__fbthrift_value)
        deref(self._struct_cpp_obj).__isset.id = True

    cdef void _set_field_1(self, __fbthrift_value) except *:
        # for field password
        if __fbthrift_value is None:
            __reset_field[_module_types.cSecretStruct](deref(self._struct_cpp_obj), 1)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'password is not a { str !r}.')
        deref(self._struct_cpp_obj).password_ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.password = True

