package CustomerManagement;


/**
* CustomerManagement/EmailMarketingServiceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/java/cms/src/idl/CustomerManagement.idl
* Thursday, March 13, 2025 1:52:43 PM ICT
*/

abstract public class EmailMarketingServiceHelper
{
  private static String  _id = "IDL:CustomerManagement/EmailMarketingService:1.0";

  public static void insert (org.omg.CORBA.Any a, CustomerManagement.EmailMarketingService that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CustomerManagement.EmailMarketingService extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CustomerManagement.EmailMarketingServiceHelper.id (), "EmailMarketingService");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CustomerManagement.EmailMarketingService read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_EmailMarketingServiceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CustomerManagement.EmailMarketingService value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CustomerManagement.EmailMarketingService narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CustomerManagement.EmailMarketingService)
      return (CustomerManagement.EmailMarketingService)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CustomerManagement._EmailMarketingServiceStub stub = new CustomerManagement._EmailMarketingServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CustomerManagement.EmailMarketingService unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CustomerManagement.EmailMarketingService)
      return (CustomerManagement.EmailMarketingService)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CustomerManagement._EmailMarketingServiceStub stub = new CustomerManagement._EmailMarketingServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
