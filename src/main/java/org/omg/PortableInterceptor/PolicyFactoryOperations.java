package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/PolicyFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u191/11896/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Saturday, October 6, 2018 8:38:59 AM PDT
*/


/**
   * Enables policy types to be constructed using 
   * <code>CORBA.ORB.create_policy</code>.
   * <p>
   * A portable ORB service implementation registers an instance of the 
   * <code>PolicyFactory</code> interface during ORB initialization in order 
   * to enable its policy types to be constructed using 
   * <code>CORBA.ORB.create_policy</code>. The POA is required to preserve 
   * any policy which is registered with <code>ORBInitInfo</code> in this 
   * manner.
   *
   * @see ORBInitInfo#register_policy_factory
   */
public interface PolicyFactoryOperations 
{

  /**
       * Returns an instance of the appropriate interface derived from 
       * <code>CORBA.Policy</code> whose value corresponds to the 
       * specified any. 
       * <p>
       * The ORB calls <code>create_policy</code> on a registered 
       * <code>PolicyFactory</code> instance when 
       * <code>CORBA.ORB.create_policy</code> is called for the 
       * <code>PolicyType</code> under which the <code>PolicyFactory</code> has 
       * been registered. The <code>create_policy</code> operation then 
       * returns an instance of the appropriate interface derived from 
       * <code>CORBA.Policy</code> whose value corresponds to the specified 
       * any. If it cannot, it shall throw an exception as described for 
       * <code>CORBA.ORB.create_policy</code>. 
       * 
       * @param type An int specifying the type of policy being created. 
       * @param value An any containing data with which to construct the 
       *     <code>CORBA.Policy</code>. 
       * @return A <code>CORBA.Policy<code> object of the specified type and 
       *     value.
       */
  org.omg.CORBA.Policy create_policy(int type, org.omg.CORBA.Any value) throws org.omg.CORBA.PolicyError;
} // interface PolicyFactoryOperations
