package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerAlreadyRegisteredHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u191/11896/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, October 6, 2018 8:38:57 AM PDT
*/

public final class ServerAlreadyRegisteredHolder implements org.omg.CORBA.portable.Streamable
{
  public ServerAlreadyRegistered value = null;

  public ServerAlreadyRegisteredHolder ()
  {
  }

  public ServerAlreadyRegisteredHolder (ServerAlreadyRegistered initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerAlreadyRegisteredHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerAlreadyRegisteredHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerAlreadyRegisteredHelper.type ();
  }

}
