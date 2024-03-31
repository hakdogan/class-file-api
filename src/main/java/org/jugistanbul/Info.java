package org.jugistanbul;

/**
 * @author hakdogan (huseyin.akdogan@patikaglobal.com)
 * Created on 31.03.2024
 ***/
public enum Info {

    CLASS_NAME("HelloJEP457");

    private String className;

    Info(String className){
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
