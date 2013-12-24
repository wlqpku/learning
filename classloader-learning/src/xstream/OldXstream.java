package xstream;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import xstream.classloader.Myclassloader;
import data.Unit;

public class OldXstream implements IXstream {

    private Class clazz;

    public OldXstream() {
        try {
            URLClassLoader loader = new Myclassloader(
                                                      new URL[] { new URL(
                                                                          "http://maven.oschina.net/content/groups/public/com/thoughtworks/xstream/xstream/1.1.2/xstream-1.1.2.jar") });
            clazz = loader.loadClass("com.thoughtworks.xstream.XStream");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toXML(Object xtream) {
        // TODO Auto-generated method stub
        if (clazz != null) {
            try {
                Method method = clazz.getMethod("toXML", Object.class);
                try {
                    try {
                        return (String) method.invoke(clazz.newInstance(), xtream);
                    } catch (InstantiationException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Unit fromXML(String str) {
        // TODO Auto-generated method stub
        if (clazz != null) {
            Method method = null;
            try {
                method = clazz.getMethod("fromXML", String.class);
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                try {
                    return (Unit) method.invoke(clazz.newInstance(), str);
                } catch (InstantiationException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return null;
    }

}
