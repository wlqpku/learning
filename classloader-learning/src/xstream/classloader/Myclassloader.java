package xstream.classloader;

import java.net.URL;
import java.net.URLClassLoader;

public class Myclassloader extends URLClassLoader {

    public Myclassloader(URL[] args) {
        super(args);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if (name != null && name.startsWith("com.thoughtworks.xstream")) {
            return super.findClass(name);
        }
        return this.getClass().getClassLoader().loadClass(name);

    }
}
