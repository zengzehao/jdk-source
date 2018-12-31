package org.omg.CORBA;


/**
* org/omg/CORBA/ParameterModeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u191/11896/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Saturday, October 6, 2018 8:38:58 AM PDT
*/


/**
   * Enumeration of parameter modes for Parameter.  Possible vaues:
   * <ul>
   *   <li>PARAM_IN - Represents an "in" parameter.</li>
   *   <li>PARAM_OUT - Represents an "out" parameter.</li>
   *   <li>PARAM_INOUT - Represents an "inout" parameter.</li>
   * </ul>
   */
abstract public class ParameterModeHelper
{
  private static String  _id = "IDL:omg.org/CORBA/ParameterMode:1.0";

  public static void insert (Any a, ParameterMode that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ParameterMode extract (Any a)
  {
    return read (a.create_input_stream ());
  }

  private static TypeCode __typeCode = null;
  synchronized public static TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ORB.init ().create_enum_tc (ParameterModeHelper.id (), "ParameterMode", new String[] { "PARAM_IN", "PARAM_OUT", "PARAM_INOUT"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ParameterMode read (org.omg.CORBA.portable.InputStream istream)
  {
    return ParameterMode.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ParameterMode value)
  {
    ostream.write_long (value.value ());
  }

}
