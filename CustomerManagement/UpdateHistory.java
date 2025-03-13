package CustomerManagement;


/**
* CustomerManagement/UpdateHistory.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/java/cms/src/idl/CustomerManagement.idl
* Thursday, March 13, 2025 1:52:43 PM ICT
*/

public final class UpdateHistory implements org.omg.CORBA.portable.IDLEntity
{
  public String entityId = null;
  public String entityType = null;
  public String fieldName = null;
  public String oldValue = null;
  public String newValue = null;
  public String updatedBy = null;
  public String updatedDate = null;

  public UpdateHistory ()
  {
  } // ctor

  public UpdateHistory (String _entityId, String _entityType, String _fieldName, String _oldValue, String _newValue, String _updatedBy, String _updatedDate)
  {
    entityId = _entityId;
    entityType = _entityType;
    fieldName = _fieldName;
    oldValue = _oldValue;
    newValue = _newValue;
    updatedBy = _updatedBy;
    updatedDate = _updatedDate;
  } // ctor

} // class UpdateHistory
