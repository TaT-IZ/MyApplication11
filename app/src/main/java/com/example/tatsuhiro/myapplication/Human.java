package com.example.tatsuhiro.myapplication;

import android.util.Log;

/**
 * Created by Tatsuhiro on 2017/09/24.
 */

class Human extends Animal implements Thinkable {

    String hobby;

    Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;

    }

    @Override
    public void say(){
        Log.d("javatest"+"私の名前は", name + "です。" );
        Log.d("javatest"+"年は", age + "です。");
    }

    @Override
    public void think(){
        Log.d("javatest"+"私は", hobby + "について考える。");
    }

}
