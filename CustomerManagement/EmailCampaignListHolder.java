package CustomerManagement;


/**
* CustomerManagement/EmailCampaignListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/java/cms/src/idl/CustomerManagement.idl
* Thursday, March 13, 2025 1:52:43 PM ICT
*/

public final class EmailCampaignListHolder implements org.omg.CORBA.portable.Streamable
{
  public CustomerManagement.EmailCampaign value[] = null;

  public EmailCampaignListHolder ()
  {
  }

  public EmailCampaignListHolder (CustomerManagement.EmailCampaign[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CustomerManagement.EmailCampaignListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CustomerManagement.EmailCampaignListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CustomerManagement.EmailCampaignListHelper.type ();
  }

}
