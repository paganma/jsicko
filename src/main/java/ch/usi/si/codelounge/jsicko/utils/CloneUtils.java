package ch.usi.si.codelounge.jsicko.utils;

import com.esotericsoftware.kryo.Kryo;


/**
 * Utility class for object cloning.
 */
public abstract class CloneUtils {


    /**
     * Clones the provided object by using Kryo.
     * @param object the object to clone.
     * @param <E> the type of the object to clone.
     * @return a clone of the given object.
     */
    public static <E> E kryoClone(E object) {
        Kryo kryo = new Kryo();
        kryo.setCopyReferences(true);
        return kryo.copy(object);
    }



}
