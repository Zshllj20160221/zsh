#include "jni.h"
#include "HelloWorld.h"
#include <stdio.h>
JNIEXPORT void JNICALL Java_HelloWorld_hello(JNIEnv *env,jobject obj){
    printf("Hello World!\n");
    return;
}
