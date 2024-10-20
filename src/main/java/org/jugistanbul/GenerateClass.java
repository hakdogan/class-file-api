package org.jugistanbul;

import java.io.IOException;
import java.lang.classfile.*;
import java.lang.constant.MethodTypeDesc;
import java.nio.file.Path;

import static java.lang.classfile.ClassFile.*;
import static java.lang.constant.ClassDesc.of;
import static java.lang.constant.ConstantDescs.*;

/**
 * @author hakdogan (huseyin.akdogan@patikaglobal.com)
 * Created on 30.03.2024
 ***/
public class GenerateClass
{
    void main() throws IOException {

        var className = Info.CLASS_NAME.getClassName();
        ClassFile.of().buildTo(Path.of(className + ".class"), of(className),
                classBuilder -> classBuilder
                        .withField("myField", of("java.lang.String"), ACC_PRIVATE)
                        .withMethodBody("hello", MethodTypeDesc.of(CD_void), ACC_STATIC,
                                codeBuilder -> codeBuilder
                                        .getstatic(of("java.lang.System"), "out", of("java.io.PrintStream"))
                                        .ldc("Hello, this class is generated by Class-File API which is a preview API to provide a standard API for parsing, generating, and transforming Java class files.")
                                        .invokevirtual(of("java.io.PrintStream"), "println",
                                                MethodTypeDesc.of(CD_void, of("java.lang.Object")))
                                        .return_())
                        .withMethodBody("main", MethodTypeDesc.of(CD_void, of("java.lang.String").arrayType()), ACC_PUBLIC | ACC_STATIC,
                                codeBuilder -> codeBuilder
                                                .invoke(Opcode.INVOKESTATIC, of(className), "hello", MethodTypeDesc.of(CD_void), false)
                                                .return_()));
    }

}
