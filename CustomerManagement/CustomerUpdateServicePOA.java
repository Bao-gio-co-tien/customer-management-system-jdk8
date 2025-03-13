package CustomerManagement;


/**
* CustomerManagement/CustomerUpdateServicePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/java/cms/src/idl/CustomerManagement.idl
* Thursday, March 13, 2025 1:52:43 PM ICT
*/

public abstract class CustomerUpdateServicePOA extends org.omg.PortableServer.Servant
 implements CustomerManagement.CustomerUpdateServiceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("updateCustomerInfo", new java.lang.Integer (0));
    _methods.put ("updateCustomerStatus", new java.lang.Integer (1));
    _methods.put ("updateCustomerType", new java.lang.Integer (2));
    _methods.put ("updateCustomerAddress", new java.lang.Integer (3));
    _methods.put ("updateCustomerPhone", new java.lang.Integer (4));
    _methods.put ("updateCustomerEmail", new java.lang.Integer (5));
    _methods.put ("updateCustomerName", new java.lang.Integer (6));
    _methods.put ("getCustomerUpdateHistory", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // CustomerManagement/CustomerUpdateService/updateCustomerInfo
       {
         CustomerManagement.CustomerInfo customer = CustomerManagement.CustomerInfoHelper.read (in);
         boolean $result = false;
         $result = this.updateCustomerInfo (customer);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // CustomerManagement/CustomerUpdateService/updateCustomerStatus
       {
         String customerId = in.read_string ();
         String customerStatus = in.read_string ();
         boolean $result = false;
         $result = this.updateCustomerStatus (customerId, customerStatus);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // CustomerManagement/CustomerUpdateService/updateCustomerType
       {
         String customerId = in.read_string ();
         String customerType = in.read_string ();
         boolean $result = false;
         $result = this.updateCustomerType (customerId, customerType);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // CustomerManagement/CustomerUpdateService/updateCustomerAddress
       {
         String customerId = in.read_string ();
         String customerAddress = in.read_string ();
         boolean $result = false;
         $result = this.updateCustomerAddress (customerId, customerAddress);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // CustomerManagement/CustomerUpdateService/updateCustomerPhone
       {
         String customerId = in.read_string ();
         String customerPhone = in.read_string ();
         boolean $result = false;
         $result = this.updateCustomerPhone (customerId, customerPhone);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 5:  // CustomerManagement/CustomerUpdateService/updateCustomerEmail
       {
         String customerId = in.read_string ();
         String customerEmail = in.read_string ();
         boolean $result = false;
         $result = this.updateCustomerEmail (customerId, customerEmail);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 6:  // CustomerManagement/CustomerUpdateService/updateCustomerName
       {
         String customerId = in.read_string ();
         String customerName = in.read_string ();
         boolean $result = false;
         $result = this.updateCustomerName (customerId, customerName);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 7:  // CustomerManagement/CustomerUpdateService/getCustomerUpdateHistory
       {
         String customerId = in.read_string ();
         CustomerManagement.UpdateHistory $result[] = null;
         $result = this.getCustomerUpdateHistory (customerId);
         out = $rh.createReply();
         CustomerManagement.UpdateHistoryListHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CustomerManagement/CustomerUpdateService:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CustomerUpdateService _this() 
  {
    return CustomerUpdateServiceHelper.narrow(
    super._this_object());
  }

  public CustomerUpdateService _this(org.omg.CORBA.ORB orb) 
  {
    return CustomerUpdateServiceHelper.narrow(
    super._this_object(orb));
  }


} // class CustomerUpdateServicePOA
