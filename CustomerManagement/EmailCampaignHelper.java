package CustomerManagement;


/**
* CustomerManagement/EmailCampaignHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/java/cms/src/idl/CustomerManagement.idl
* Thursday, March 13, 2025 1:52:43 PM ICT
*/

abstract public class EmailCampaignHelper
{
  private static String  _id = "IDL:CustomerManagement/EmailCampaign:1.0";

  public static void insert (org.omg.CORBA.Any a, CustomerManagement.EmailCampaign that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CustomerManagement.EmailCampaign extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [7];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "campaignId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "campaignName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "campaignType",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "campaignStatus",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "campaignSchedule",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "emailTemplate",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "targetCustomer",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CustomerManagement.EmailCampaignHelper.id (), "EmailCampaign", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CustomerManagement.EmailCampaign read (org.omg.CORBA.portable.InputStream istream)
  {
    CustomerManagement.EmailCampaign value = new CustomerManagement.EmailCampaign ();
    value.campaignId = istream.read_string ();
    value.campaignName = istream.read_string ();
    value.campaignType = istream.read_string ();
    value.campaignStatus = istream.read_string ();
    value.campaignSchedule = istream.read_string ();
    value.emailTemplate = istream.read_string ();
    value.targetCustomer = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CustomerManagement.EmailCampaign value)
  {
    ostream.write_string (value.campaignId);
    ostream.write_string (value.campaignName);
    ostream.write_string (value.campaignType);
    ostream.write_string (value.campaignStatus);
    ostream.write_string (value.campaignSchedule);
    ostream.write_string (value.emailTemplate);
    ostream.write_string (value.targetCustomer);
  }

}
