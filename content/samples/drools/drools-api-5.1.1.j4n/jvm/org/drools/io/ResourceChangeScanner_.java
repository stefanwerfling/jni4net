// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package org.drools.io;

@net.sf.jni4net.attributes.ClrTypeInfo
public final class ResourceChangeScanner_ {
    
    //<generated-static>
    private static system.Type staticType;
    
    public static system.Type typeof() {
        return org.drools.io.ResourceChangeScanner_.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        org.drools.io.ResourceChangeScanner_.staticType = staticType;
    }
    //</generated-static>
}

//<generated-proxy>
@net.sf.jni4net.attributes.ClrProxy
class __ResourceChangeScanner extends system.Object implements org.drools.io.ResourceChangeScanner {
    
    protected __ResourceChangeScanner(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/SystemEventListener;)V")
    public native void setSystemEventListener(org.drools.SystemEventListener par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/io/ResourceChangeNotifier;Lorg/drools/io/Resource;)V")
    public native void subscribeNotifier(org.drools.io.ResourceChangeNotifier par0, org.drools.io.Resource par1);
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/io/ResourceChangeNotifier;Lorg/drools/io/Resource;)V")
    public native void unsubscribeNotifier(org.drools.io.ResourceChangeNotifier par0, org.drools.io.Resource par1);
    
    @net.sf.jni4net.attributes.ClrMethod("()V")
    public native void start();
    
    @net.sf.jni4net.attributes.ClrMethod("()V")
    public native void stop();
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/util/Properties;)Lorg/drools/io/ResourceChangeScannerConfiguration;")
    public native org.drools.io.ResourceChangeScannerConfiguration newResourceChangeScannerConfiguration(java.util.Properties par0);
    
    @net.sf.jni4net.attributes.ClrMethod("()Lorg/drools/io/ResourceChangeScannerConfiguration;")
    public native org.drools.io.ResourceChangeScannerConfiguration newResourceChangeScannerConfiguration();
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/io/ResourceChangeScannerConfiguration;)V")
    public native void configure(org.drools.io.ResourceChangeScannerConfiguration par0);
    
    @net.sf.jni4net.attributes.ClrMethod("()V")
    public native void scan();
    
    @net.sf.jni4net.attributes.ClrMethod("(I)V")
    public native void setInterval(int par0);
}
//</generated-proxy>