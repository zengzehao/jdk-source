package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynAnyHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u191/11896/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Saturday, October 6, 2018 8:38:58 AM PDT
*/


/**
    * Any values can be dynamically interpreted (traversed) and constructed through DynAny objects.
    * A DynAny object is associated with a data value which corresponds to a copy of the value
    * inserted into an any.
    * <P>A DynAny object may be viewed as an ordered collection of component DynAnys.
    * For DynAnys representing a basic type, such as long, or a type without components,
    * such as an empty exception, the ordered collection of components is empty.
    * Each DynAny object maintains the notion of a current position into its collection
    * of component DynAnys. The current position is identified by an index value that runs
    * from 0 to n-1, where n is the number of components.
    * The special index value -1 indicates a current position that points nowhere.
    * For values that cannot have a current position (such as an empty exception),
    * the index value is fixed at -1.
    * If a DynAny is initialized with a value that has components, the index is initialized to 0.
    * After creation of an uninitialized DynAny (that is, a DynAny that has no value but a TypeCode
    * that permits components), the current position depends on the type of value represented by
    * the DynAny. (The current position is set to 0 or -1, depending on whether the new DynAny
    * gets default values for its components.)
    * <P>The iteration operations rewind, seek, and next can be used to change the current position
    * and the current_component operation returns the component at the current position.
    * The component_count operation returns the number of components of a DynAny.
    * Collectively, these operations enable iteration over the components of a DynAny, for example,
    * to (recursively) examine its contents.
    * <P>A constructed DynAny object is a DynAny object associated with a constructed type.
    * There is a different interface, inheriting from the DynAny interface, associated with
    * each kind of constructed type in IDL (fixed, enum, struct, sequence, union, array,
    * exception, and value type).
    * <P>A constructed DynAny object exports operations that enable the creation of new DynAny objects,
    * each of them associated with a component of the constructed data value.
    * As an example, a DynStruct is associated with a struct value. This means that the DynStruct
    * may be seen as owning an ordered collection of components, one for each structure member.
    * The DynStruct object exports operations that enable the creation of new DynAny objects,
    * each of them associated with a member of the struct.
    * <P>If a DynAny object has been obtained from another (constructed) DynAny object,
    * such as a DynAny representing a structure member that was created from a DynStruct,
    * the member DynAny is logically contained in the DynStruct.
    * Calling an insert or get operation leaves the current position unchanged.
    * Destroying a top-level DynAny object (one that was not obtained as a component of another DynAny)
    * also destroys any component DynAny objects obtained from it.
    * Destroying a non-top level DynAny object does nothing.
    * Invoking operations on a destroyed top-level DynAny or any of its descendants raises OBJECT_NOT_EXIST.
    * If the programmer wants to destroy a DynAny object but still wants to manipulate some component
    * of the data value associated with it, then he or she should first create a DynAny for the component
    * and, after that, make a copy of the created DynAny object.
    * <P>The behavior of DynAny objects has been defined in order to enable efficient implementations
    * in terms of allocated memory space and speed of access. DynAny objects are intended to be used
    * for traversing values extracted from anys or constructing values of anys at runtime.
    * Their use for other purposes is not recommended.
    * <P>Insert and get operations are necessary to handle basic DynAny objects
    * but are also helpful to handle constructed DynAny objects.
    * Inserting a basic data type value into a constructed DynAny object
    * implies initializing the current component of the constructed data value
    * associated with the DynAny object. For example, invoking insert_boolean on a
    * DynStruct implies inserting a boolean data value at the current position
    * of the associated struct data value.
    * A type is consistent for inserting or extracting a value if its TypeCode is equivalent to
    * the TypeCode contained in the DynAny or, if the DynAny has components, is equivalent to the TypeCode
    * of the DynAny at the current position.
    * <P>DynAny and DynAnyFactory objects are intended to be local to the process in which they are
    * created and used. This means that references to DynAny and DynAnyFactory objects cannot be exported
    * to other processes, or externalized with ORB.object_to_string().
    * If any attempt is made to do so, the offending operation will raise a MARSHAL system exception.
    * Since their interfaces are specified in IDL, DynAny objects export operations defined in the standard
    * org.omg.CORBA.Object interface. However, any attempt to invoke operations exported through the Object
    * interface may raise the standard NO_IMPLEMENT exception.
    * An attempt to use a DynAny object with the DII may raise the NO_IMPLEMENT exception.
    */
abstract public class DynAnyHelper
{
  private static String  _id = "IDL:omg.org/DynamicAny/DynAny:1.0";

  public static void insert (org.omg.CORBA.Any a, DynAny that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DynAny extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DynAnyHelper.id (), "DynAny");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DynAny read (org.omg.CORBA.portable.InputStream istream)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DynAny value)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static DynAny narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DynAny)
      return (DynAny)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DynAnyStub stub = new _DynAnyStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static DynAny unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DynAny)
      return (DynAny)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DynAnyStub stub = new _DynAnyStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}