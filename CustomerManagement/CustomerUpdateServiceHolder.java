package CustomerManagement;

/**
* CustomerManagement/CustomerUpdateServiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/java/cms/src/idl/CustomerManagement.idl
* Thursday, March 13, 2025 1:52:43 PM ICT
*/

public final class CustomerUpdateServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public CustomerManagement.CustomerUpdateService value = null;

  public CustomerUpdateServiceHolder ()
  {
  }

  public CustomerUpdateServiceHolder (CustomerManagement.CustomerUpdateService initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CustomerManagement.CustomerUpdateServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CustomerManagement.CustomerUpdateServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CustomerManagement.CustomerUpdateServiceHelper.type ();
  }

}
