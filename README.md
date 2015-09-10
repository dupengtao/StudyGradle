# StudyGradle
Study Android Gradle

A demo for study android gradle

eg.
```groovy
//声明插件类型，这里声明的是Android程序
apply plugin: 'com.android.application'

android {
    //编译SDK的版本
    compileSdkVersion 22
    //build tools 的版本 对应Android SDK Build-tools
    buildToolsVersion "21.1.2"

    defaultConfig {
        //应用包名
        applicationId "com.example.dpt.studygradledemo"
        minSdkVersion 21
        targetSdkVersion 22
        versionCode 1
        versionName "1.0"
    }
    buildTypes {//构建类型，常用的有release和debug两种，可以在这里面启用混淆，启用zipAlign以及配置签名信息等
        release {
            //是否进行混淆
            minifyEnabled false
            //混淆文件位置
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }

    // 移除lint检查的error
    lintOptions {
        abortOnError false
    }
}

dependencies {
    // 编译依赖libs目录下的所有jar包
    compile fileTree(dir: 'libs', include: ['*.jar'])
    // //应用格式: packageName:artifactId:version
    // 依赖 support-v4
    compile 'com.android.support:support-v4:22.2.0'
    // 依赖 card view
    compile 'com.android.support:cardview-v7:22.2.0'
    // 依赖 library module
    compile project(':demolibrary')
    compile 'com.android.support:palette-v7:22.2.0'
}
```
