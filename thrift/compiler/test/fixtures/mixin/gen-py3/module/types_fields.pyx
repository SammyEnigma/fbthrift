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
cdef class __Mixin1_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __Mixin1_FieldsSetter create(_module_types.cMixin1* struct_cpp_obj):
        cdef __Mixin1_FieldsSetter __fbthrift_inst = __Mixin1_FieldsSetter.__new__(__Mixin1_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"field1")] = __Mixin1_FieldsSetter._set_field_0
        return __fbthrift_inst

    cdef void set_field(__Mixin1_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __Mixin1_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, __fbthrift_value) except *:
        # for field field1
        if __fbthrift_value is None:
            __reset_field[_module_types.cMixin1](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'field1 is not a { str !r}.')
        deref(self._struct_cpp_obj).field1_ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.field1 = True


@__cython.auto_pickle(False)
cdef class __Mixin2_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __Mixin2_FieldsSetter create(_module_types.cMixin2* struct_cpp_obj):
        cdef __Mixin2_FieldsSetter __fbthrift_inst = __Mixin2_FieldsSetter.__new__(__Mixin2_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"m1")] = __Mixin2_FieldsSetter._set_field_0
        __fbthrift_inst._setters[__cstring_view(<const char*>"field2")] = __Mixin2_FieldsSetter._set_field_1
        return __fbthrift_inst

    cdef void set_field(__Mixin2_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __Mixin2_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, __fbthrift_value) except *:
        # for field m1
        if __fbthrift_value is None:
            __reset_field[_module_types.cMixin2](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(__fbthrift_value, _module_types.Mixin1):
            raise TypeError(f'm1 is not a { _module_types.Mixin1 !r}.')
        deref(self._struct_cpp_obj).m1_ref().assign(deref((<_module_types.Mixin1?> __fbthrift_value)._cpp_obj))
        deref(self._struct_cpp_obj).__isset.m1 = True

    cdef void _set_field_1(self, __fbthrift_value) except *:
        # for field field2
        if __fbthrift_value is None:
            __reset_field[_module_types.cMixin2](deref(self._struct_cpp_obj), 1)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'field2 is not a { str !r}.')
        deref(self._struct_cpp_obj).field2_ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.field2 = True


@__cython.auto_pickle(False)
cdef class __Mixin3Base_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __Mixin3Base_FieldsSetter create(_module_types.cMixin3Base* struct_cpp_obj):
        cdef __Mixin3Base_FieldsSetter __fbthrift_inst = __Mixin3Base_FieldsSetter.__new__(__Mixin3Base_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"field3")] = __Mixin3Base_FieldsSetter._set_field_0
        return __fbthrift_inst

    cdef void set_field(__Mixin3Base_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __Mixin3Base_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, __fbthrift_value) except *:
        # for field field3
        if __fbthrift_value is None:
            __reset_field[_module_types.cMixin3Base](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'field3 is not a { str !r}.')
        deref(self._struct_cpp_obj).field3_ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.field3 = True


@__cython.auto_pickle(False)
cdef class __Foo_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __Foo_FieldsSetter create(_module_types.cFoo* struct_cpp_obj):
        cdef __Foo_FieldsSetter __fbthrift_inst = __Foo_FieldsSetter.__new__(__Foo_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"field4")] = __Foo_FieldsSetter._set_field_0
        __fbthrift_inst._setters[__cstring_view(<const char*>"m2")] = __Foo_FieldsSetter._set_field_1
        __fbthrift_inst._setters[__cstring_view(<const char*>"m3")] = __Foo_FieldsSetter._set_field_2
        return __fbthrift_inst

    cdef void set_field(__Foo_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __Foo_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, __fbthrift_value) except *:
        # for field field4
        if __fbthrift_value is None:
            __reset_field[_module_types.cFoo](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(__fbthrift_value, str):
            raise TypeError(f'field4 is not a { str !r}.')
        deref(self._struct_cpp_obj).field4_ref().assign(cmove(bytes_to_string(__fbthrift_value.encode('utf-8'))))
        deref(self._struct_cpp_obj).__isset.field4 = True

    cdef void _set_field_1(self, __fbthrift_value) except *:
        # for field m2
        if __fbthrift_value is None:
            __reset_field[_module_types.cFoo](deref(self._struct_cpp_obj), 1)
            return
        if not isinstance(__fbthrift_value, _module_types.Mixin2):
            raise TypeError(f'm2 is not a { _module_types.Mixin2 !r}.')
        deref(self._struct_cpp_obj).m2_ref().assign(deref((<_module_types.Mixin2?> __fbthrift_value)._cpp_obj))
        deref(self._struct_cpp_obj).__isset.m2 = True

    cdef void _set_field_2(self, __fbthrift_value) except *:
        # for field m3
        if __fbthrift_value is None:
            __reset_field[_module_types.cFoo](deref(self._struct_cpp_obj), 2)
            return
        if not isinstance(__fbthrift_value, _module_types.Mixin3Base):
            raise TypeError(f'm3 is not a { _module_types.Mixin3Base !r}.')
        deref(self._struct_cpp_obj).m3_ref().assign(deref((<_module_types.Mixin3Base?> __fbthrift_value)._cpp_obj))
        deref(self._struct_cpp_obj).__isset.m3 = True

