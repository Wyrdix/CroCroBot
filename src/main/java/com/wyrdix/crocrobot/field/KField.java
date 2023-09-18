package com.wyrdix.crocrobot.field;

import com.wyrdix.crocrobot.KUser;

public abstract class KField<T> {

    public KField() {}

    public abstract T get(KUser user);

    public abstract void set(KUser user, T value);

    public T sanitize(T value){
        return value;
    }

}
