/* 
 * @(#)NoKey.java        1.0 3/8/12
 *
 * This file has been auto-generated by JPyang, the
 * Java output format plug-in of pyang.
 * Origin: module "mini", revision: "unknown".
 */

package gen;

import com.tailf.jnc.*;
import java.util.HashMap;

/**
 * This class represents a "noKey" element
 * from the namespace http://example.com/ns/mini/1.0
 *
 * @version 1.0 2012-8-3
 * @author Auto Generated
 */
public class NoKey extends YangElement {

    /**
     * Constructor for an empty NoKey object.
     */
    public NoKey() {
        super(Mini.NAMESPACE, "noKey");
        setDefaultPrefix();
        setPrefix(Mini.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Object clone() {
        return (NoKey)cloneContent(new NoKey());
    }


    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Element cloneShallow() {
        return cloneShallowContent(new NoKey());
    }


    /**
     * Structure information which specifies
     * the keys for the list entries.
     */
    public String[] keyNames() {
        return null;
    }

    /**
     * Structure information with the names of the children.
     * Makes it possible to order the children.
     */
    public String[] childrenNames() {
        return new String[] {
            "ll"
        };
    }

    /**
     * -------------------------------------------------------
     * Access methods for leaf-list child: "ll".
     * -------------------------------------------------------
     */

    /**
     * Iterator method for the leaf-list "ll".
     * @return An iterator for the leaf-list.
     */
    public ElementLeafListValueIterator llIterator() {
        return new ElementLeafListValueIterator(children, "ll");
    }

    /**
     * Sets the value for child leaf-list "ll", using the java primitive value.
     * @param llValue The value to set.
     */
    public void setLlValue(gen.MyType llValue)
        throws JNCException {
        setLeafListValue(Mini.NAMESPACE,
            "ll",
            llValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf-list "ll", using a string value.
     * @param llValue The string representation of the value to set.
     */
    public void setLlValue(String llValue)
        throws JNCException {
        setLlValue(new gen.MyType(llValue));
    }

    /**
     * Deletes leaf-list entry "ll
     * @param llValue Child to be removed."
     */
    public void deleteLl(gen.MyType llValue)
        throws JNCException {
        String path = "ll[name='" + llValue + "']";
        delete(path);
    }

    /**
     * Deletes leaf-list entry "ll
     * The value is specified as a String
     * @param llValue Child to be removed."
     */
    public void deleteLl(String llValue)
        throws JNCException {
        String path = "ll[name='" + llValue + "']";
        delete(path);
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ll" leaf-list will not have a value.
     */
    public void addEmptyLl()
        throws JNCException {
        setLeafListValue(Mini.NAMESPACE,
            "ll",
            null,
            childrenNames());
    }

    /**
     * Marks the "ll" leaf-list with operation "replace".
     * @param llValue The value to mark.
     */
    public void markLlReplace(gen.MyType llValue)
        throws JNCException {
        markLeafReplace("ll[name='" + llValue+"']");
    }

    /**
     * Marks the "ll" leaf-list with operation "replace".
     * @param llValue The value to mark, given as a String.
     */
    public void markLlReplace(String llValue)
        throws JNCException {
        markLeafReplace("ll[name='" + llValue+"']");
    }

    /**
     * Marks the "ll" leaf-list with operation "merge".
     * @param llValue The value to mark.
     */
    public void markLlMerge(gen.MyType llValue)
        throws JNCException {
        markLeafMerge("ll[name='" + llValue+"']");
    }

    /**
     * Marks the "ll" leaf-list with operation "merge".
     * @param llValue The value to mark, given as a String.
     */
    public void markLlMerge(String llValue)
        throws JNCException {
        markLeafMerge("ll[name='" + llValue+"']");
    }

    /**
     * Marks the "ll" leaf-list with operation "create".
     * @param llValue The value to mark.
     */
    public void markLlCreate(gen.MyType llValue)
        throws JNCException {
        markLeafCreate("ll[name='" + llValue+"']");
    }

    /**
     * Marks the "ll" leaf-list with operation "create".
     * @param llValue The value to mark, given as a String.
     */
    public void markLlCreate(String llValue)
        throws JNCException {
        markLeafCreate("ll[name='" + llValue+"']");
    }

    /**
     * Marks the "ll" leaf-list with operation "delete".
     * @param llValue The value to mark.
     */
    public void markLlDelete(gen.MyType llValue)
        throws JNCException {
        markLeafDelete("ll[name='" + llValue+"']");
    }

    /**
     * Marks the "ll" leaf-list with operation "delete".
     * @param llValue The value to mark, given as a String.
     */
    public void markLlDelete(String llValue)
        throws JNCException {
        markLeafDelete("ll[name='" + llValue+"']");
    }

    /**
     * -------------------------------------------------------
     * Support method for addChild.
     * -------------------------------------------------------
     */

    /**
     * Adds a child to this object.
     */
    public void addChild(Element $child) {
        super.addChild($child);
        
    }

}