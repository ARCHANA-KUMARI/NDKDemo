//
 // Created by Archana Kumari on 06-09-2022.
//
#include <jni.h>

extern "C" jint Java_com_example_ndkdemo_MainActivity_sumFromJNI(JNIEnv* env, jobject, jint x , jint y) {
   return x + y;
}

extern "C" jint  Java_com_example_ndkdemo_MainActivity_subFromJNI(JNIEnv* env, jobject , jint x , jint y) {
    return x - y;
}

extern "C" jint Java_com_example_ndkdemo_MainActivity_mulFromJNI(JNIEnv* env, jobject /* this */, jint x, jint y) {
   return x * y;
}

extern "C" jint Java_com_example_ndkdemo_MainActivity_divFromJNI(JNIEnv* env, jobject, /* this */ jint x , jint y) {
   return x / y;
}