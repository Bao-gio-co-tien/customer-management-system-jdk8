package CustomerManagement;


/**
* CustomerManagement/CustomerInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/java/cms/src/idl/CustomerManagement.idl
* Thursday, March 13, 2025 1:52:43 PM ICT
*/

public final class CustomerInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String customerId = null;
  public String customerName = null;
  public String customerAddress = null;
  public String customerPhone = null;
  public String customerEmail = null;
  public String customerType = null;
  public String customerRegion = null;
  public String customerStatus = null;
  public String createdDate = null;
  public String updatedDate = null;

  public CustomerInfo ()
  {
  } // ctor

  public CustomerInfo (String _customerId, String _customerName, String _customerAddress, String _customerPhone, String _customerEmail, String _customerType, String _customerRegion, String _customerStatus, String _createdDate, String _updatedDate)
  {
    customerId = _customerId;
    customerName = _customerName;
    customerAddress = _customerAddress;
    customerPhone = _customerPhone;
    customerEmail = _customerEmail;
    customerType = _customerType;
    customerRegion = _customerRegion;
    customerStatus = _customerStatus;
    createdDate = _createdDate;
    updatedDate = _updatedDate;
  } // ctor

} // class CustomerInfo
