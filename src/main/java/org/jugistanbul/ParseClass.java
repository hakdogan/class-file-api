package org.jugistanbul;

import java.io.File;
import java.io.IOException;
import java.lang.classfile.ClassFile;
import java.lang.classfile.FieldModel;
import java.lang.classfile.MethodModel;
import java.nio.file.Files;

/**
 * @author hakdogan (huseyin.akdogan@patikaglobal.com)
 * Created on 31.03.2024
 ***/
public class ParseClass {

    void main() {

        var classModel = ClassFile.of().parse(getGivenClassBytes(Info.CLASS_NAME.getClassName()));
        for (var classElement : classModel) {
            switch (classElement) {
                case MethodModel mm -> System.out.printf("Method name %s type %s%n", mm.methodName().stringValue(), mm.methodType().stringValue());
                case FieldModel fm -> System.out.printf("Field name %s type %s%n", fm.fieldName().stringValue(), fm.fieldType().stringValue());
                default -> {
                }
            }
        }
    }

    private static byte[] getGivenClassBytes(final String className) {
        try {
            var path = System.getProperty("user.dir") + "/" + className + ".class";
            File file = new File(path);
            return Files.readAllBytes(file.toPath());
        } catch (IOException ioe){
            throw new RuntimeException(ioe.getMessage());
        }
    }
}
