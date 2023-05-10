QUESTION ANSWER.JAVA

package com.example.quiz_app;

public class QuestionAnswer {

    public static String question[] ={

            "Which of the following is used for layout design in Android Studio?",
            "Which of the following is used to build and manage dependencies in Android Studio?",
            "Which of the following is used to debug Android apps in Android Studio?",
            "Which of the following is used to preview layout design in Android Studio?",
            "Which of the following is used to generate signed APKs in Android Studio?",

    };

    public static String choices[][] = {


            {"XML","JSON","YAML","HTML"},
            {"Gradle","Maven","Ant","Make"},
            {"Android Debug Bridge (ADB)","Android Emulator","Logcat"," All of the above"},
            {"Preview window","Android Emulator","Layout Inspector","None of the above"},
            {"Build menu","Run menu","File menu","Tools menu"}




    };

    public static String correctAnswers[] = {


            "XML",
            "Gradle",
            "All of the above",
            "Preview window",
            " Build menu"
    };


}
