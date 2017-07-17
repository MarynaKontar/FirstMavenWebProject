package com.app;

/**
 * Created by User on 17.07.2017.
 * Standard java bean
 */
public class User {

   private String _name;
   private String _email;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }
}
