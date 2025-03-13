package CustomerManagement;


/**
* CustomerManagement/CustomerUpdateServiceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/java/cms/src/idl/CustomerManagement.idl
* Thursday, March 13, 2025 1:52:43 PM ICT
*/

abstract public class CustomerUpdateServiceHelper
{
  private static String  _id = "IDL:CustomerManagement/CustomerUpdateService:1.0";

  public static void insert (org.omg.CORBA.Any a, CustomerManagement.CustomerUpdateService that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CustomerManagement.CustomerUpdateService extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CustomerManagement.CustomerUpdateServiceHelper.id (), "CustomerUpdateService");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CustomerManagement.CustomerUpdateService read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CustomerUpdateServiceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CustomerManagement.CustomerUpdateService value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CustomerManagement.CustomerUpdateService narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CustomerManagement.CustomerUpdateService)
      return (CustomerManagement.CustomerUpdateService)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CustomerManagement._CustomerUpdateServiceStub stub = new CustomerManagement._CustomerUpdateServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CustomerManagement.CustomerUpdateService unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CustomerManagement.CustomerUpdateService)
      return (CustomerManagement.CustomerUpdateService)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CustomerManagement._CustomerUpdateServiceStub stub = new CustomerManagement._CustomerUpdateServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
