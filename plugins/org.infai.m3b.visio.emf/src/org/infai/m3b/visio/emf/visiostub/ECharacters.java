
package org.infai.m3b.visio.emf.visiostub;

import org.jawin.*;






/**
 * Jawin generated code please do not edit
 *
 * Dispatch: ECharacters
 * Description: Visio Characters Event Interface
 * Help file:   C:\Program Files\Microsoft Office\Office12\Vis_SDR.CHM
 *
 * @author JawinTypeBrowser
 */

public class ECharacters extends DispatchPtr {
	public static final GUID DIID = new GUID("{000d0b0c-0000-0000-C000-000000000046}");
	public static final int IID_TOKEN;
	static {
		IID_TOKEN = IdentityManager.registerProxy(DIID, ECharacters.class);
	}

	/**
	 * The required public no arg constructor.
	 * <br><br>
	 * <b>Important:</b>Should never be used as this creates an uninitialized
	 * ECharacters (it is required by Jawin for some internal working though).
	 */
	public ECharacters() {
		super();
	}

	/**
	 * For creating a new COM-object with the given progid and with 
	 * the ECharacters interface.
	 * 
	 * @param progid the progid of the COM-object to create.
	 */
	public ECharacters(String progid) throws COMException {
		super(progid, DIID);
	}

	/**
	 * For creating a new COM-object with the given clsid and with 
	 * the ECharacters interface.
	 * 
	 * @param clsid the GUID of the COM-object to create.
	 */
	public ECharacters(GUID clsid) throws COMException {
		super(clsid, DIID);
	}

	/**
	 * For getting the ECharacters interface on an existing COM-object.
	 * This is an alternative to calling {@link #queryInterface(Class)}
	 * on comObject.
	 * 
	 * @param comObject the COM-object to get the ECharacters interface on.
	 */
	public ECharacters(COMPtr comObject) throws COMException {
		super(comObject);
	}

	public int getIIDToken() {
		return IID_TOKEN;
	}
	
	
    /**
    *
    
    * @return void
    **/
    public void TextChanged(Object[] Shape) throws COMException
    {
      
		invokeN("TextChanged", new Object[] {Shape});
        
    }
}
