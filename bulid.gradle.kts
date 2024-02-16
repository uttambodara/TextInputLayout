apply plugin: 'com.android.application'

android {
    compileSdkVersion 23
    buildToolsVersion "23.0.0"

    defaultConfig {
        applicationId "com.stylingandroid.textinputlayout"
        minSdkVersion 7
        targetSdkVersion 23
        versionCode 1
        versionName "1.0"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {
    compile 'com.android.support:design:23.0.0'
}
