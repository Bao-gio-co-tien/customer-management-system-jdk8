package CustomerManagement;


/**
* CustomerManagement/StringListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/java/cms/src/idl/CustomerManagement.idl
* Thursday, March 13, 2025 1:52:43 PM ICT
*/

public final class StringListHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public StringListHolder ()
  {
  }

  public StringListHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CustomerManagement.StringListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CustomerManagement.StringListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CustomerManagement.StringListHelper.type ();
  }

}
