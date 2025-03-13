package CustomerManagement;


/**
* CustomerManagement/ComplaintInfoListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/java/cms/src/idl/CustomerManagement.idl
* Thursday, March 13, 2025 1:52:43 PM ICT
*/

abstract public class ComplaintInfoListHelper
{
  private static String  _id = "IDL:CustomerManagement/ComplaintInfoList:1.0";

  public static void insert (org.omg.CORBA.Any a, CustomerManagement.ComplaintInfo[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CustomerManagement.ComplaintInfo[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = CustomerManagement.ComplaintInfoHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (CustomerManagement.ComplaintInfoListHelper.id (), "ComplaintInfoList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CustomerManagement.ComplaintInfo[] read (org.omg.CORBA.portable.InputStream istream)
  {
    CustomerManagement.ComplaintInfo value[] = null;
    int _len0 = istream.read_long ();
    value = new CustomerManagement.ComplaintInfo[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = CustomerManagement.ComplaintInfoHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CustomerManagement.ComplaintInfo[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      CustomerManagement.ComplaintInfoHelper.write (ostream, value[_i0]);
  }

}
