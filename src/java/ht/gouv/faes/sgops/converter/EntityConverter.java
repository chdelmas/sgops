/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author chdelmas
 */
public class EntityConverter implements Converter
{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
//
//
//    /** Logger for this class */
//    private static final Log myLog = LogFactory.getLog( EntityConverter.class );
//
//    public static final String ROLE_EDIT_PICK_LIST_ID = "roleEditPickList";
//    
//
//    /** This map is statically initialized by the UIComponent-ID (ID attribute in JSF) and the 
//     * class which is espected in getAsString() */
//    private static Map<String,Class<?>> ID_CLASS_MAP = new HashMap<String,Class<?>>();
//    static
//    {
//        ID_CLASS_MAP.put( ROLE_EDIT_PICK_LIST_ID, Permission.class );
//    }
//    
//    /** 
//     * This map holds a submap for each possible Entity class. The submap maps the generated string (getAsString() to
//     * the Entity instance.
//     * <p> 
//     * This implementation assumes that always first getAsString() is called, where the submap is populated, and afterwards
//     * the getAsObject, where the corresponding Entity instance can be retrieved by the received String 
//     */
//    // TODO: This map has to be static because the Converter instance is not the same in the "Render Response" phase (getAsString)
//    // and the "Apply Request Values" phase (getAsObject). Maybe experiment around with the additional interface StateHolder (see
//    // javadoc of javax.faces.convert.Converter
//    private static Map<Class<?>,Map<String,Object>> LABEL_OBJECT_MAP = new HashMap<Class<?>,Map<String,Object>>();
//
//    /**
//     * @see javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.String)
//     */
//    public Object getAsObject( FacesContext aArg0, UIComponent aArg1, String aArg2 )
//    {
//        myLog.trace( "in EntityConverter.getAsObject(): FacesContext: " + aArg0 + "; UIComponent: " + aArg1 + "; String: " + aArg2 );
//
//        if ( aArg2.length() == 0 )
//        {
//            myLog.debug( "getAsObject(): received string is empty. Returning a null object" );
//            return null;
//        } // if aArg2.length() == 0
//        
//        Map<String, Object> map = retrieveLabelObjectMap( aArg1, null ); // throws if not found
//        Object result = map.get( aArg2 );
//        if ( result == null )
//        {
//            throw new AssertionError( "the given String \"" + aArg2 + "\" was not rendered by this getAsString() method!" );
//        } // if result == null
//        
//        return result;
//    }
//
//    /**
//     * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
//     */
//    public String getAsString( FacesContext aArg0, UIComponent aArg1, Object aArg2 )
//    {
//        myLog.trace( "in EntityConverter.getAsString(). FacesContext: " + aArg0 + "; UIComponent: " + aArg1 + "; Object: " + aArg2 );
//
//        if ( aArg2 == null )
//        {
//            myLog.debug( "getAsString(): aArg2 is null. Returning null" );
//            return null;
//        } // if aArg2 == null
//        
//        if ( ( aArg2 instanceof String ) && ( ( ( String ) aArg2 ).isEmpty() ) )
//        {
//            myLog.debug( "getAsString(): aArg2 is an empty string. Returning an empty string" );
//            return "";
//        } // if aArg2 instanceof String )
//        
//        Map<String, Object> map = retrieveLabelObjectMap( aArg1, aArg2.getClass() ); // creates one if not found
//        
//        String label;
//        
//        if ( aArg2 instanceof Permission )
//        {
//            // TODO: Our rendering needs could be covered by an Interface "LabelRendered" with method formatDisplayLabel().
//            label = formatPermissionDisplayLabel( ( Permission  ) aArg2 );
//        }
//        else
//        {
//            myLog.warn( "unhandled class: " + aArg2.getClass().getName() );
//            label = aArg2.toString();
//        } // if..else aArg2 instanceof UserEntity
//        
//        map.put( label, aArg2 );
//        
//        return label;
//    }
//
//    private Map<String, Object> retrieveLabelObjectMap( UIComponent aArg1, Class<?> aReceivedClass ) throws AssertionError
//    {
//        String id = aArg1.getId();
//        if ( id == null )
//        {
//            throw new AssertionError( "the given UIComponent has no ID!" );
//        } // if id == null
//        
//        Class<?> clazz = ID_CLASS_MAP.get( id );
//        if ( clazz == null )
//        {
//            throw new AssertionError( "unhandled UIComponent-ID: " + id );
//        } // if id == null
//        
//        Map<String,Object> map = LABEL_OBJECT_MAP.get( clazz );
//        
//        if ( aReceivedClass != null )
//        {
//            // call comes from getAsString(). Check the correct class:
//            if ( !( clazz.isAssignableFrom( aReceivedClass ) ) )
//            {
//                throw new AssertionError( "Configured Class (" + clazz.getName() + ") for UIComponent-ID " + id + " is not assignment compatible with received class: " + aReceivedClass.getName() );
//            } // if !( clazz.isAssignableFrom( aReceivedClass ) )
//            // if not yet constructed, construct the map now:
//            if ( map == null  )
//            {
//                map = new HashMap<String,Object>();
//                LABEL_OBJECT_MAP.put( clazz, map );
//            }
//        }
//        
//        if ( map == null  )
//        {
//            // can only happen on calls from getAsObject()
//            throw new IllegalStateException( "No LabelObjectMap found for class " + clazz.getName() );
//        } // if map == null && aCreate
//        
//        return map;
//    }
//
//    private String formatPermissionDisplayLabel( Permission aPermission )
//    {
//        return aPermission.getName();
//    }
//    
}